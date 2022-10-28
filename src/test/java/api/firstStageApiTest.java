package api;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;
import testAutoFramework.models.UserDataApi;

import java.util.List;

import static io.restassured.RestAssured.given;

public class firstStageApiTest {
    private final static String URL = "https://reqres.in";
    private final static String REQUEST = "/api/users?page=2";


    // expected ten-code: 200
    @Test
    public void checkIdAndMailApiTest() {
        List<UserDataApi> userDataApiList = given()
                .when()
                .contentType(ContentType.JSON)
                .get(URL + REQUEST)
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserDataApi.class);

        userDataApiList.forEach(x-> Assert.assertTrue(x.getAvatar().contains(x.getId().toString())));

    }


}
