package com.theta.designpatterns.creational.builder;

public class User {
    private String name;
    private String email;
    private String telephone; // optional field
    private String address; // optional field
    public User(UserBuilder userBuilder) {
        this.name = userBuilder.getName();
        this.email = userBuilder.getEmail();
        this.telephone = userBuilder.getTelephone();
        this.address = userBuilder.getAddress();

    }
    @Override
    public String toString() {
        return "User: " +
                "name= " + name + ", " +
                "email= " + email + "," +
                " telephone= " + telephone+", "+
                "address= " + address;
    }
    public static UserBuilder builder(String name, String email) {
        return new UserBuilder(name, email);
    }
}
class UserBuilder{
    private String name;
    private String email;
    private String telephone = "unknown";
    private String address = "unknown";

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getAddress() {
        return address;
    }

    public UserBuilder(String name, String email){
        this.name = name;
        this.email = email;
    }
    public UserBuilder name(String name){
        this.name = name;
        return this;
    }
    public UserBuilder email(String email){
        this.email = email;
        return this;
    }
    public UserBuilder telephone(String telephone){
        this.telephone = telephone;
        return this;
    }
    public UserBuilder address(String address){
        this.address = address;
        return this;
    }
    public User build(){
        return new User(this);
    }
}



