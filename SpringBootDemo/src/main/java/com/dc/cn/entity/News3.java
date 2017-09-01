package com.dc.cn.entity;



import javax.persistence.*;
import java.util.Date;

/**
 * Created by wenxye on 2017/8/21.
 */
@Entity
@Table(name = "news4dcone")
public class News3 {
    private int id;
    private String title;
    private String content;
    private String creater;
    private Date createdate;
    private String link;
    private String dept;
    private String type;
    private String firstpic;
    private String company;
    private String firstpic_big;
    private String content_big;
    private Date modifydate;
    private String modifier;
    private String newtype;
    private String platformtype;
    private String contenttype;
    private String uuid;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "TITLE",length=100)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Column(name = "CONTENT",length = 1000)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    @Column(name = "CREATER",length = 100)
    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }
    @Column(name = "CREATEDATE")
    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
    @Column(name = "LINK",length = 500)
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    @Column(name = "DEPT",length = 100)
    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    @Column(name = "TYPE",length = 100)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Column(name = "FIRSTPIC",length = 200)
    public String getFirstpic() {
        return firstpic;
    }

    public void setFirstpic(String firstpic) {
        this.firstpic = firstpic;
    }
    @Column(name = "COMPANY",length = 100)
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    @Column(name = "FIRSTPIC_BIG",length = 1000)
    public String getFirstpic_big() {
        return firstpic_big;
    }

    public void setFirstpic_big(String firstpic_big) {
        this.firstpic_big = firstpic_big;
    }
    @Column(name = "CONTENT_BIG",length = 1000)
    public String getContent_big() {
        return content_big;
    }

    public void setContent_big(String content_big) {
        this.content_big = content_big;
    }
    @Column(name = "MODIFYDATE")
    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }
    @Column(name = "MODIFIER",length = 100)
    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }
    @Column(name = "NEWTYPE",length = 100)
    public String getNewtype() {
        return newtype;
    }

    public void setNewtype(String newtype) {
        this.newtype = newtype;
    }
    @Column(name = "PLATFORMTYPE",length = 100)
    public String getPlatformtype() {
        return platformtype;
    }

    public void setPlatformtype(String platformtype) {
        this.platformtype = platformtype;
    }
    @Column(name = "CONTENTTYPE",length = 200)
    public String getContenttype() {
        return contenttype;
    }

    public void setContenttype(String contenttype) {
        this.contenttype = contenttype;
    }
    @Column(name = "UUID",length = 200)
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
