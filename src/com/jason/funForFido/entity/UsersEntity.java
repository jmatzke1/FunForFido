package com.jason.funForFido.entity;

import javax.persistence.*;

/**
 * @author jjjasonm
 *         Created on 4/14/16.
 */
@Entity
@Table(name = "users", schema = "funforfido")

public class UsersEntity {
    private String username;
    private String password;
    private int memberID;

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public UsersEntity() {

    }

    /**
     *
     * @param username
     * @param password
     * @param memberId
     */
    public UsersEntity(String username, String password, int memberId) {
        this.username = username;
        this.password = password;
        this.memberID = memberId;
    }

    /**
     *
     * @return
     */
    @Basic
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
    @Basic
    @Column(name = "password", nullable = true, length = 30)
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return
     */
    @Id
    @Column(name = "memberID", nullable = false)
    public int getMemberId() {
        return memberID;
    }

    /**
     *
     * @param memberId
     */
    public void setMemberId(int memberId) {
        this.memberID = memberID;
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (memberID != that.memberID) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;

        return true;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + memberID;
        return result;
    }
}
