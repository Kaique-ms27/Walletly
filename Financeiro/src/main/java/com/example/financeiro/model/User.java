package com.example.financeiro.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private int idUser;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password_hash")
    private String passawordHash;

    @Column(name = "creation_date")
    private Date crateionDate;

    public User(int idUser, String username, String passawordHash, String email, Date crateionDate) {
        this.idUser = idUser;
        this.username = username;
        this.passawordHash = passawordHash;
        this.email = email;
        this.crateionDate = crateionDate;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassawordHash() {
        return passawordHash;
    }

    public void setPassawordHash(String passawordHash) {
        this.passawordHash = passawordHash;
    }

    public Date getCrateionDate() {
        return crateionDate;
    }

    public void setCrateionDate(Date crateionDate) {
        this.crateionDate = crateionDate;
    }
}
