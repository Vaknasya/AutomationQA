package api;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;
import testAutoFramework.models.usersData.ResourceUserData;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class GetResourceListFilterTest extends BaseApiTest {
    private final static String REQUEST = "api/unknown";

    /**
     * Используя сервис https://reqres.in/ убедиться, что операция LIST<RESOURCE> возвращает данные,
     * отсортированные по годам.
     */
    @Test(description = "Тест для проверки правильности сортировки года")
    public void correctYearFilterCheckTest() {
        List<ResourceUserData> resourceUsers = given()
                .when()
                .contentType(ContentType.JSON)
                .get(URL + REQUEST)
                .then().assertThat().statusCode(200)
                .log().all()
                .extract().body().jsonPath().getList("data", ResourceUserData.class);

        List<Integer> dataList = resourceUsers.stream()
                .map(ResourceUserData::getYear)
                .collect(Collectors.toList());

        List<Integer> sortedDataList = dataList.stream()
                .sorted()
                .collect(Collectors.toList());

        for (int i = 0; i < dataList.size(); i++) {
            Assert.assertEquals(dataList.get(i), sortedDataList.get(i));
        }

    }
}
