package models;

public class User extends BaseModel {
    private String name;
    private String address;
    private String email;
    public User(String name, String address, String email) {
				super();
        this.name = name;
        this.address = address;
        this.email = email;
    }
    public User(User user) {
        this.name = user.name;
        this.address = user.address;
        this.email = user.email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
