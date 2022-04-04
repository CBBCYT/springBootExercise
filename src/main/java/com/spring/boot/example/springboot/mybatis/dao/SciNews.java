package com.spring.boot.example.springboot.mybatis.dao;

public class SciNews {
    /*
    `id` VARCHAR(32) NOT NULL  COMMENT '新闻ID',
    `title` VARCHAR(255) NOT NULL  COMMENT '新闻标题',
	`type` VARCHAR(24) NOT NULL  COMMENT '新闻类型',
	`user_id` VARCHAR(32) NOT NULL  COMMENT '作者ID',
	`link` VARCHAR(255) COMMENT '新闻链接',
	`cover` VARCHAR(255) NOT NULL  COMMENT '新闻封面链接',
	`downloads` INTEGER(0) NOT NULL  COMMENT '下载量',
	`gmt_create` TIMESTAMP(0) NOT NULL  DEFAULT CURRENT_TIMESTAMP() COMMENT '创建时间',
	`create_by` VARCHAR(24) NOT NULL  COMMENT '创建操作人',
	`gmt_update` TIMESTAMP(0) NOT NULL  DEFAULT CURRENT_TIMESTAMP() ON UPDATE CURRENT_TIMESTAMP() COMMENT '更新时间',
	`update_by` VARCHAR(24) NOT NULL  COMMENT '更新操作人',
	PRIMARY KEY (`id`),
	UNIQUE KEY `news_title_index` (`title`)*/



    private Integer id;
    private String title;
    private String type;
    private String userId;
    private String link;
    private String cover;
    private Integer downloads;
    private String gmtCreate;
    private String createBy;
    private String gmtUpdate;
    private String updateBy;

    public SciNews()
    {

    }

    public SciNews(Integer id, String title, String type, String userId, String link, String cover, Integer downloads, String gmtCreate, String createBy, String gmtUpdate, String updateBy) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.userId = userId;
        this.link = link;
        this.cover = cover;
        this.downloads = downloads;
        this.gmtCreate = gmtCreate;
        this.createBy = createBy;
        this.gmtUpdate = gmtUpdate;
        this.updateBy = updateBy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(String gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    public String toString() {
        return "SciNews{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", userId='" + userId + '\'' +
                ", link='" + link + '\'' +
                ", cover='" + cover + '\'' +
                ", downloads=" + downloads +
                ", gmtCreate='" + gmtCreate + '\'' +
                ", createBy='" + createBy + '\'' +
                ", gmtUpdate='" + gmtUpdate + '\'' +
                ", updateBy='" + updateBy + '\'' +
                '}';
    }
}
