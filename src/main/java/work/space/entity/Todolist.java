package work.space.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName todolist
 */
public class Todolist implements Serializable {
    /**
     * id自增
     */
    private Integer id;

    /**
     * 
     */
    private String content;

    /**
     * 
     */
    private String mark;

    /**
     * 自动填充，默认0 ，true保存为1
     */
    private Integer oksign;

    /**
     * 自动填充，默认0 ，true保存为1
     */
    private Integer delsign;

    /**
     * 更新时间，随数据更新
     */
    private Date updatetime;

    /**
     * 创建时间
     */
    private Date createtime;

    private static final long serialVersionUID = 1L;

    /**
     * id自增
     */
    public Integer getId() {
        return id;
    }

    /**
     * id自增
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     */
    public String getContent() {
        return content;
    }

    /**
     * 
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 
     */
    public String getMark() {
        return mark;
    }

    /**
     * 
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * 自动填充，默认0 ，true保存为1
     */
    public Integer getOksign() {
        return oksign;
    }

    /**
     * 自动填充，默认0 ，true保存为1
     */
    public void setOksign(Integer oksign) {
        this.oksign = oksign;
    }

    /**
     * 自动填充，默认0 ，true保存为1
     */
    public Integer getDelsign() {
        return delsign;
    }

    /**
     * 自动填充，默认0 ，true保存为1
     */
    public void setDelsign(Integer delsign) {
        this.delsign = delsign;
    }

    /**
     * 更新时间，随数据更新
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 更新时间，随数据更新
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}