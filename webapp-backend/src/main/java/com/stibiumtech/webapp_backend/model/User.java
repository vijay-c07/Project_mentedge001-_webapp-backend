package com.stibiumtech.webapp_backend.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    @Column(unique = true)
    private String email;

    private String phone;

    private String password_hash;

    private String gender;

    private String state;

    private int country_code;

    private String username;

    private int age;
    

    // getters and setters


    public int getUser_id() {
        return user_id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public String getGender() {
        return gender;
    }

    public String getState() {
        return state;
    }

    public int getCountry_code() {
        return country_code;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry_code(int country_code) {
        this.country_code = country_code;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    
}
