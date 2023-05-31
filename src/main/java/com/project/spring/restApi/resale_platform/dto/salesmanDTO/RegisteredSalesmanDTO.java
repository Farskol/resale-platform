package com.project.spring.restApi.resale_platform.dto.salesmanDTO;

public class RegisteredSalesmanDTO {
    private String firstName;
    private String secondName;
    private String email;
    private long phoneNumber;
    private String password;
    private String login;

    public RegisteredSalesmanDTO() {
    }

    public RegisteredSalesmanDTO(String firstName, String secondName, String email, long phoneNumber, String password, String login) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
