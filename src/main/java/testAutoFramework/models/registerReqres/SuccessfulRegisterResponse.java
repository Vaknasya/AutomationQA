package testAutoFramework.models.registerReqres;

public class SuccessfulRegisterResponse {
    private Integer id;
    private String token;

    public SuccessfulRegisterResponse(Integer userId, String userToken) {
        id = userId;
        token = userToken;
    }

    public SuccessfulRegisterResponse() {
    }


    public Integer getId() {
        return id;
    }

    public String getToken() {
        return token;
    }
}
