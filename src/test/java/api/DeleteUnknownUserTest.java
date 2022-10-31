package api;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteUnknownUserTest {
    private final static String URL = "https://reqres.in/";
    private final static String REQUEST = "api/users/2";

    @Test(description = "Тет для проверки удаления пользователя")
    public void deleteUserTest() {
        given()
                .when()
                .contentType(ContentType.JSON)
                .delete(URL + REQUEST)
                .then().assertThat().statusCode(204)
                .log().all();

    }
}
