package com.jason.funForFido.entity;

import javax.persistence.*;

/**
 * @author jjjasonm
 *         Created on 4/14/16.
 */
@Entity
@Table(name = "user_roles", schema = "funforfido") //, catalog = ""
@IdClass(UserRolesEntityPK.class)

public class UserRolesEntity {

    private String username; //todo: serialize ?
    private String rolename = "member";

    /**
       Get method for username
       @return username the members username
    */
    @Id
    @Column(name = "username", nullable = false, length = 60)
    public String getUsername() {

        return username;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     */
    @Id
    @Column(name = "rolename", nullable = false, length = 15)
    public String getRolename() {
        return rolename;
    }
    // TODO: add default role;
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
