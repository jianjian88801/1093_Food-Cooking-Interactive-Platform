package com.entity.vo;

import com.entity.MeishizhishiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 美食知识
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("meishizhishi")
public class MeishizhishiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 美食知识名称
     */

    @TableField(value = "meishizhishi_name")
    private String meishizhishiName;


    /**
     * 美食知识图片
     */

    @TableField(value = "meishizhishi_photo")
    private String meishizhishiPhoto;


    /**
     * 美食知识类型
     */

    @TableField(value = "meishizhishi_types")
    private Integer meishizhishiTypes;


    /**
     * 美食知识发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 美食知识详情
     */

    @TableField(value = "meishizhishi_content")
    private String meishizhishiContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：美食知识名称
	 */
    public String getMeishizhishiName() {
        return meishizhishiName;
    }


    /**
	 * 获取：美食知识名称
	 */

    public void setMeishizhishiName(String meishizhishiName) {
        this.meishizhishiName = meishizhishiName;
    }
    /**
	 * 设置：美食知识图片
	 */
    public String getMeishizhishiPhoto() {
        return meishizhishiPhoto;
    }


    /**
	 * 获取：美食知识图片
	 */

    public void setMeishizhishiPhoto(String meishizhishiPhoto) {
        this.meishizhishiPhoto = meishizhishiPhoto;
    }
    /**
	 * 设置：美食知识类型
	 */
    public Integer getMeishizhishiTypes() {
        return meishizhishiTypes;
    }


    /**
	 * 获取：美食知识类型
	 */

    public void setMeishizhishiTypes(Integer meishizhishiTypes) {
        this.meishizhishiTypes = meishizhishiTypes;
    }
    /**
	 * 设置：美食知识发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：美食知识发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：美食知识详情
	 */
    public String getMeishizhishiContent() {
        return meishizhishiContent;
    }


    /**
	 * 获取：美食知识详情
	 */

    public void setMeishizhishiContent(String meishizhishiContent) {
        this.meishizhishiContent = meishizhishiContent;
    }
    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
