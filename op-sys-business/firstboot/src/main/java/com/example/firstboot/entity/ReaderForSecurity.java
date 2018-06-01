package com.example.firstboot.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

/**
 * desc:
 *
 * @author: yangyang
 * project:cloud
 * packageName:com.example.firstboot.entity
 * date:   2018-05-31 15:43
 */
/*@Entity
public class ReaderForSecurity implements UserDetails {

    @Id
    private Long id;
    private String username;
    private String fullname;
    private String password;

    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("READER"));
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;

} }*/
