package wxx.entity;

public class UserEntity {
    private String userID;
    private String userName;
    private String password;

    public String getId() {
        return userID;
    }

    public void setId(String id) {
        this.userID = id;
    }

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
