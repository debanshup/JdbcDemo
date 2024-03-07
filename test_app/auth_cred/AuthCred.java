package test_app.auth_cred;

public class AuthCred {
    private String url = "jdbc:mysql://localhost:3306/ testjdbc";
    private String user = "root";
    private String password = "qwerty";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
