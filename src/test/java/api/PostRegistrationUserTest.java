package api;

import com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;
import testAutoFramework.models.registerReqres.RegisterRequest;
import testAutoFramework.models.registerReqres.SuccessfulRegisterResponse;
import testAutoFramework.models.registerReqres.UnSuccessfulRegisterResponse;

import static io.restassured.RestAssured.given;

public class PostRegistrationUserTest {
    private final static String URL = "https://reqres.in/";
    private final static String REQUEST = "api/register";

    /**
     * 1. Используя сервис https://reqres.in протестировать регистрацию пользователя в системе
     * 2. Проверить код запроса
     */
    @Test(description = "Тест для успешной регистрации")
    public void successfulRegistrationTest() {
//         JsonObject jsonObject = new JsonObject()
//                .add("expectedId", 4)
//                .add("expectedToken", "QpwL5tke4Pnpja7X4");
        Integer expectedId = 4;
        String expectedToken = "QpwL5tke4Pnpja7X4";
        RegisterRequest firstUser = new RegisterRequest("eve.holt@reqres.in", "pistol");
        SuccessfulRegisterResponse successfulRegisterResponse = given()
                .body(firstUser)
                .contentType(ContentType.JSON)
                .post(URL + REQUEST)
                .then()
                .assertThat().statusCode(200)
                .log().all()
                .extract().as(SuccessfulRegisterResponse.class);

        Assert.assertNotNull(successfulRegisterResponse.getId());
        Assert.assertNotNull(successfulRegisterResponse.getToken());

        Assert.assertEquals(expectedId, successfulRegisterResponse.getId());
        Assert.assertEquals(expectedToken, successfulRegisterResponse.getToken());

//        Assert.assertEquals(jsonObject.get("expectedId"), successfulRegisterResponse.getId());
//        Assert.assertEquals(jsonObject.get("expectedToken"), successfulRegisterResponse.getToken());
    }

    /**
     * 1. Используя сервис https://reqres.in протестировать регистрацию пользователя в системе
     * 2. Проверить код запроса  api/register
     */
    @Test(description = "Тест для неуспешной регистрации (не введен пароль)")
    public void unSuccessfulRegistrationTest() {
        RegisterRequest secondUser = new RegisterRequest("sydney@fife", "");
        UnSuccessfulRegisterResponse unSuccessfulRegisterResponse = given()
                .body(secondUser)
                .when()
                .contentType(ContentType.JSON)
                .post(URL + REQUEST)
                .then()
                .assertThat().statusCode(400)
                .log().all()
                .extract().as(UnSuccessfulRegisterResponse.class);

        Assert.assertNotNull(unSuccessfulRegisterResponse.getError());
        Assert.assertEquals("Missing password", unSuccessfulRegisterResponse.getError());
    }
}
