package api;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;
import testAutoFramework.models.UserData;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class GetUserDataListTest {
    private final static String URL = "https://reqres.in";
    private final static String REQUEST = "/api/users?page=2";

    /**
     * 1. Получить список пользователей со второй страница на сайте https://reqres.in/
     * 2. Убедиться что id пользователей содержаться в их avatar;
     * 3. Убедиться, что email пользователей имеет окончание reqres.in;
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
        Assert.assertTrue(userDataApiList.stream().allMatch(x -> x.getEmail().endsWith("@regres.in")));

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
