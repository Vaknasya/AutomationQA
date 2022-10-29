package api;

import org.testng.annotations.Test;

public class PostRegistrationUserTest {
    private final static String URL = "https://reqres.in";
    private final static String REQUEST = "api/register";

    /**
     * 1. Используя сервис https://reqres.in протестировать регистрацию пользователя в системе
     * 2. Проверить код запроса
     */
    // expected code - 200
    @Test(description = "Тест для успешной регистрации")
    public void successfulRegistration() {

    }

    /**
     * 1. Используя сервис https://reqres.in протестировать регистрацию пользователя в системе
     * 2. Проверить код запроса  api/register
     */
    // expected code - 400
    @Test(description = "Тест для неуспешной регистрации (не введен пароль)")
    public void unSuccessfulRegistration() {

    }
}
