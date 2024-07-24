package com.entity.model;

import com.entity.MeishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 美食
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class MeishiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 美食编号
     */
    private String meishiUuidNumber;


    /**
     * 美食名称
     */
    private String meishiName;


    /**
     * 美食照片
     */
    private String meishiPhoto;


    /**
     * 美食做法
     */
    private String meishiVideo;


    /**
     * 赞
     */
    private Integer zanNumber;


    /**
     * 踩
     */
    private Integer caiNumber;


    /**
     * 美食类型
     */
    private Integer meishiTypes;


    /**
     * 游览量
     */
    private Integer meishiClicknum;


    /**
     * 相关食材
     */
    private String meishiShicaiText;


    /**
     * 美食详情
     */
    private String meishiContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer meishiDelete;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：美食编号
	 */
    public String getMeishiUuidNumber() {
        return meishiUuidNumber;
    }


    /**
	 * 设置：美食编号
	 */
    public void setMeishiUuidNumber(String meishiUuidNumber) {
        this.meishiUuidNumber = meishiUuidNumber;
    }
    /**
	 * 获取：美食名称
	 */
    public String getMeishiName() {
        return meishiName;
    }


    /**
	 * 设置：美食名称
	 */
    public void setMeishiName(String meishiName) {
        this.meishiName = meishiName;
    }
    /**
	 * 获取：美食照片
	 */
    public String getMeishiPhoto() {
        return meishiPhoto;
    }


    /**
	 * 设置：美食照片
	 */
    public void setMeishiPhoto(String meishiPhoto) {
        this.meishiPhoto = meishiPhoto;
    }
    /**
	 * 获取：美食做法
	 */
    public String getMeishiVideo() {
        return meishiVideo;
    }


    /**
	 * 设置：美食做法
	 */
    public void setMeishiVideo(String meishiVideo) {
        this.meishiVideo = meishiVideo;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 设置：赞
	 */
    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 设置：踩
	 */
    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：美食类型
	 */
    public Integer getMeishiTypes() {
        return meishiTypes;
    }


    /**
	 * 设置：美食类型
	 */
    public void setMeishiTypes(Integer meishiTypes) {
        this.meishiTypes = meishiTypes;
    }
    /**
	 * 获取：游览量
	 */
    public Integer getMeishiClicknum() {
        return meishiClicknum;
    }


    /**
	 * 设置：游览量
	 */
    public void setMeishiClicknum(Integer meishiClicknum) {
        this.meishiClicknum = meishiClicknum;
    }
    /**
	 * 获取：相关食材
	 */
    public String getMeishiShicaiText() {
        return meishiShicaiText;
    }


    /**
	 * 设置：相关食材
	 */
    public void setMeishiShicaiText(String meishiShicaiText) {
        this.meishiShicaiText = meishiShicaiText;
    }
    /**
	 * 获取：美食详情
	 */
    public String getMeishiContent() {
        return meishiContent;
    }


    /**
	 * 设置：美食详情
	 */
    public void setMeishiContent(String meishiContent) {
        this.meishiContent = meishiContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getMeishiDelete() {
        return meishiDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setMeishiDelete(Integer meishiDelete) {
        this.meishiDelete = meishiDelete;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
