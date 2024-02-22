package DB_info;

public class DatabaseInfo {
    private String url;
    private String user_name;
    private  String password;
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public DatabaseInfo(String url, String user_name, String password) {
        this.url = url;
        this.user_name = user_name;
        this.password = password;
    }
    public DatabaseInfo() {
        super();
    }

    
}
