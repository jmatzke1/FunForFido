package com.jason.funForFido.entity;

import javax.persistence.*;

/**
 * @author jjjasonm
 *         Created on 4/5/16.
 */
@Entity
@Table(name = "user_roles", schema = "funforfido") //, catalog = ""
@IdClass(UserRolesEntityPK.class)
public class UserRolesEntity {
    private String username;
    private String rolename;

    @Id
    @Column(name = "username", nullable = false, length = 15)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Id
    @Column(name = "rolename", nullable = false, length = 15)
    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRolesEntity that = (UserRolesEntity) o;

        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (rolename != null ? !rolename.equals(that.rolename) : that.rolename != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (rolename != null ? rolename.hashCode() : 0);
        return result;
    }
}