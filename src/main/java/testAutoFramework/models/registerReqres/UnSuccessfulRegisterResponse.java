package testAutoFramework.models.registerReqres;

public class UnSuccessfulRegisterResponse {
    private String error;

    public UnSuccessfulRegisterResponse(String error) {
        this.error = error;
    }

    public UnSuccessfulRegisterResponse() {
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
