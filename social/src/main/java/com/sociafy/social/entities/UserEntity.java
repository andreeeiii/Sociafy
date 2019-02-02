package com.sociafy.social.entities;


import javax.persistence.*;

@Entity
@Table(name = "\"User\"")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class UserEntity {

    @Id
    @Column(name = "Id")
    @GeneratedValue
    private String id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "is_admin")
    private Boolean isAdmin;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }
}