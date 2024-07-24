package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 美食
 *
 * @author 
 * @email
 */
@TableName("meishi")
public class MeishiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public MeishiEntity() {

	}

	public MeishiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 美食编号
     */
    @TableField(value = "meishi_uuid_number")

    private String meishiUuidNumber;


    /**
     * 美食名称
     */
    @TableField(value = "meishi_name")

    private String meishiName;


    /**
     * 美食照片
     */
    @TableField(value = "meishi_photo")

    private String meishiPhoto;


    /**
     * 美食做法
     */
    @TableField(value = "meishi_video")

    private String meishiVideo;


    /**
     * 赞
     */
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩
     */
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 美食类型
     */
    @TableField(value = "meishi_types")

    private Integer meishiTypes;


    /**
     * 游览量
     */
    @TableField(value = "meishi_clicknum")

    private Integer meishiClicknum;


    /**
     * 相关食材
     */
    @TableField(value = "meishi_shicai_text")

    private String meishiShicaiText;


    /**
     * 美食详情
     */
    @TableField(value = "meishi_content")

    private String meishiContent;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "meishi_delete")

    private Integer meishiDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：美食编号
	 */
    public String getMeishiUuidNumber() {
        return meishiUuidNumber;
    }
    /**
	 * 获取：美食编号
	 */

    public void setMeishiUuidNumber(String meishiUuidNumber) {
        this.meishiUuidNumber = meishiUuidNumber;
    }
    /**
	 * 设置：美食名称
	 */
    public String getMeishiName() {
        return meishiName;
    }
    /**
	 * 获取：美食名称
	 */

    public void setMeishiName(String meishiName) {
        this.meishiName = meishiName;
    }
    /**
	 * 设置：美食照片
	 */
    public String getMeishiPhoto() {
        return meishiPhoto;
    }
    /**
	 * 获取：美食照片
	 */

    public void setMeishiPhoto(String meishiPhoto) {
        this.meishiPhoto = meishiPhoto;
    }
    /**
	 * 设置：美食做法
	 */
    public String getMeishiVideo() {
        return meishiVideo;
    }
    /**
	 * 获取：美食做法
	 */

    public void setMeishiVideo(String meishiVideo) {
        this.meishiVideo = meishiVideo;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }
    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }
    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：美食类型
	 */
    public Integer getMeishiTypes() {
        return meishiTypes;
    }
    /**
	 * 获取：美食类型
	 */

    public void setMeishiTypes(Integer meishiTypes) {
        this.meishiTypes = meishiTypes;
    }
    /**
	 * 设置：游览量
	 */
    public Integer getMeishiClicknum() {
        return meishiClicknum;
    }
    /**
	 * 获取：游览量
	 */

    public void setMeishiClicknum(Integer meishiClicknum) {
        this.meishiClicknum = meishiClicknum;
    }
    /**
	 * 设置：相关食材
	 */
    public String getMeishiShicaiText() {
        return meishiShicaiText;
    }
    /**
	 * 获取：相关食材
	 */

    public void setMeishiShicaiText(String meishiShicaiText) {
        this.meishiShicaiText = meishiShicaiText;
    }
    /**
	 * 设置：美食详情
	 */
    public String getMeishiContent() {
        return meishiContent;
    }
    /**
	 * 获取：美食详情
	 */

    public void setMeishiContent(String meishiContent) {
        this.meishiContent = meishiContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getMeishiDelete() {
        return meishiDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setMeishiDelete(Integer meishiDelete) {
        this.meishiDelete = meishiDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Meishi{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", meishiUuidNumber=" + meishiUuidNumber +
            ", meishiName=" + meishiName +
            ", meishiPhoto=" + meishiPhoto +
            ", meishiVideo=" + meishiVideo +
            ", zanNumber=" + zanNumber +
            ", caiNumber=" + caiNumber +
            ", meishiTypes=" + meishiTypes +
            ", meishiClicknum=" + meishiClicknum +
            ", meishiShicaiText=" + meishiShicaiText +
            ", meishiContent=" + meishiContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", meishiDelete=" + meishiDelete +
            ", createTime=" + createTime +
        "}";
    }
}
