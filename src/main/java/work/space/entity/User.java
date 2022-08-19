package work.space.entity;

import java.io.Serializable;

/**
 * 
 * @TableName user
 */
public class User implements Serializable {
    /**
     * 
     */
    private String uid;

    /**
     * 
     */
    private String role;

    /**
     * 用户状态：在线，忙碌，离开
     */
    private String status;

    /**
     * 
     */
    private String password;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public String getUid() {
        return uid;
    }

    /**
     * 
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * 
     */
    public String getRole() {
        return role;
    }

    /**
     * 
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * 用户状态：在线，忙碌，离开
     */
    public String getStatus() {
        return status;
    }

    /**
     * 用户状态：在线，忙碌，离开
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     */
    public String getPassword() {
        return password;
    }

    /**
     * 
     */
    public void setPassword(String password) {
        this.password = password;
    }
}