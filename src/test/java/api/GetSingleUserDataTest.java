package api;

import com.google.gson.Gson;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;
import testAutoFramework.models.usersData.UserData;

import static io.restassured.RestAssured.given;

public class GetSingleUserDataTest extends BaseApiTest {
    private final static String REQUEST = "api/users/2";

    @Test(description = "Получение данных 1 пользователя")
    public void getSingleUserDataTest(){
    UserData expectedUserData = new UserData(2,
            "janet.weaver@reqres.in",
            "Janet",
            "Weaver",
            "https://reqres.in/img/faces/2-image.jpg");

    UserData realUser = given()
            .when()
            .contentType(ContentType.JSON)
            .get(URL + REQUEST)
            .then()
            .assertThat().statusCode(200)
            .log().all()
            .extract().body().jsonPath().getObject("data", UserData.class);

        Assert.assertEquals(expectedUserData.getId(), realUser.getId());
        Assert.assertEquals(expectedUserData.getEmail(), realUser.getEmail());
        Assert.assertEquals(expectedUserData.getAvatar(), realUser.getAvatar());
    }
}
