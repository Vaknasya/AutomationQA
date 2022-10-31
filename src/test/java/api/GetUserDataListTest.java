package api;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;
import testAutoFramework.models.usersData.UserData;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class GetUserDataListTest {
    private final static String URL = "https://reqres.in/";
    private final static String REQUEST = "api/users?page=2";

    /**
     * 1. Получить список пользователей со второй страницы на сайте https://reqres.in
     * 2. Убедиться, что id пользователей содержится в их avatar;
     * 3. Убедиться, что e-mail пользователей имеет окончание reqres.in; Q is not G :D
     */
    // expected ten-code: 200
    @Test
    public void checkIdAndMailApiTest() {
        List<UserData> userDataApiList = given()
                .when()
                .contentType(ContentType.JSON)
                .get(URL + REQUEST)
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);

        userDataApiList.forEach(x -> Assert.assertTrue(x.getAvatar().contains(x.getId().toString())));

        Assert.assertTrue(userDataApiList.stream().allMatch(x -> x.getEmail().endsWith("@reqres.in")));

        List<String> usersAvatars = userDataApiList.stream()
                .map(UserData::getAvatar)
                .collect(Collectors.toList());

        List<String> usersId = userDataApiList.stream()
                .map(x -> x.getId().toString())
                .collect(Collectors.toList());

        for (int i = 0; i < usersAvatars.size(); i++) {
            Assert.assertTrue(usersAvatars.get(i).contains(usersId.get(i)));
        }
    }


}
