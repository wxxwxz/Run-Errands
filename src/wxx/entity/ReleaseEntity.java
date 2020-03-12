package wxx.entity;

public class ReleaseEntity {
    private Integer releaseID;
    private String userID;
    private String description;
    private String price;
    private boolean isChecked;

    public Integer getReleaseID() {
        return releaseID;
    }

    public void setReleaseID(Integer id) {
        this.releaseID = id;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }

}
