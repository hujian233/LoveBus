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
    private String phonenumber;
    private Boolean role;

}
