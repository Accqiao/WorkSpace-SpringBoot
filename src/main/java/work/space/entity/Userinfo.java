package work.space.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName userinfo
 */
public class Userinfo implements Serializable {
    /**
     * 
     */
    private String uid;

    /**
     * 
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 
     */
    private String phone;

    /**
     * 
     */
    private String email;

    /**
     * 状态：开心，失望，玩乐
     */
    private String status;

    /**
     * 签名
     */
    private String signature;

    /**
     * 简介
     */
    private String introduction;

    /**
     * 
     */
    private Date updatetime;

    /**
     * 
     */
    private Date createtime;

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
    public String getName() {
        return name;
    }

    /**
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 状态：开心，失望，玩乐
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态：开心，失望，玩乐
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 签名
     */
    public String getSignature() {
        return signature;
    }

    /**
     * 签名
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * 简介
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * 简介
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    /**
     * 
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * 
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}