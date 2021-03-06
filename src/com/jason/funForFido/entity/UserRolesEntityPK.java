package com.jason.funForFido.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author jjjasonm
 *         Created on 4/14/16.
 */
public class UserRolesEntityPK implements Serializable {
    private String username; //todo: unserialize ?
    private String rolename;

    @Column(name = "username", nullable = false, length = 60)
    @Id
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "rolename", nullable = false, length = 15)
    @Id
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

        UserRolesEntityPK that = (UserRolesEntityPK) o;

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
