package wxx.entity;

public class ManagerEntity {
    private String managerID;
    private String managerName;
    private String password;

    public String getId() {
        return managerID;
    }

    public void setId(String id) {
        this.managerID = id;
    }

    public String getName() {
        return managerName;
    }

    public void setName(String name) {
        this.managerName = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
