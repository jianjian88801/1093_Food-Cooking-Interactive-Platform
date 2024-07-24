package com.entity.vo;

import com.entity.MeishiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 美食
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("meishi")
public class MeishiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间  show1 show2 photoShow
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
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
