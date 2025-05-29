public class BasicLogin implements  ILogin{
    private String validPassword;
    private String validUsername;

    public BasicLogin(String username, String password) {
        this.validPassword = password;
        this.validUsername = username;
    }

    @Override
    public boolean authenticate(String username, String password) {
        return validUsername.equals(username) && validPassword.equals(password);
    }


}