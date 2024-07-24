package com.entity.model;

import com.entity.MeishizhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 美食知识
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class MeishizhishiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 美食知识名称
     */
    private String meishizhishiName;


    /**
     * 美食知识图片
     */
    private String meishizhishiPhoto;


    /**
     * 美食知识类型
     */
    private Integer meishizhishiTypes;


    /**
     * 美食知识发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 美食知识详情
     */
    private String meishizhishiContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：美食知识名称
	 */
    public String getMeishizhishiName() {
        return meishizhishiName;
    }


    /**
	 * 设置：美食知识名称
	 */
    public void setMeishizhishiName(String meishizhishiName) {
        this.meishizhishiName = meishizhishiName;
    }
    /**
	 * 获取：美食知识图片
	 */
    public String getMeishizhishiPhoto() {
        return meishizhishiPhoto;
    }


    /**
	 * 设置：美食知识图片
	 */
    public void setMeishizhishiPhoto(String meishizhishiPhoto) {
        this.meishizhishiPhoto = meishizhishiPhoto;
    }
    /**
	 * 获取：美食知识类型
	 */
    public Integer getMeishizhishiTypes() {
        return meishizhishiTypes;
    }


    /**
	 * 设置：美食知识类型
	 */
    public void setMeishizhishiTypes(Integer meishizhishiTypes) {
        this.meishizhishiTypes = meishizhishiTypes;
    }
    /**
	 * 获取：美食知识发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：美食知识发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：美食知识详情
	 */
    public String getMeishizhishiContent() {
        return meishizhishiContent;
    }


    /**
	 * 设置：美食知识详情
	 */
    public void setMeishizhishiContent(String meishizhishiContent) {
        this.meishizhishiContent = meishizhishiContent;
    }
    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
