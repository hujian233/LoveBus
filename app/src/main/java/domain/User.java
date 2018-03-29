package domain;

import android.provider.ContactsContract;

import java.io.Serializable;

public class User implements Serializable{
    /**
     * Serializable 提供对象序列化的功能
     */

    private int userId;
    private String username;
    private String password;
    private String nickname;
    private String phoneNumber;
    private Boolean role;

    public User(int userId, String username, String password, String nickname, String phoneNumber, Boolean role) {
        super();
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.phoneNumber = phoneNumber;
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getRole() {
        return role;
    }

    public void setRole(Boolean role) {
        this.role = role;
    }
}
