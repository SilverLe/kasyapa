package com.example.firstboot.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * desc:
 *
 * @author: yangyang
 * project:cloud
 * packageName:com.example.firstboot.entity
 * date:   2018-05-31 15:43
 */
@Entity
public class Reader{

    @Id
    private Long id;
    private String username;
    private String fullname;
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

