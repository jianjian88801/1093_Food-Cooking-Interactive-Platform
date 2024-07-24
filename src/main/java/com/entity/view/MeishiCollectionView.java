package com.entity.view;

import com.entity.MeishiCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 美食收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("meishi_collection")
public class MeishiCollectionView extends MeishiCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String meishiCollectionValue;



		//级联表 meishi
			/**
			* 美食 的 用户
			*/
			private Integer meishiYonghuId;
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
				* 美食类型的值
				*/
				private String meishiValue;
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
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer meishiDelete;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public MeishiCollectionView() {

	}

	public MeishiCollectionView(MeishiCollectionEntity meishiCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, meishiCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getMeishiCollectionValue() {
				return meishiCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setMeishiCollectionValue(String meishiCollectionValue) {
				this.meishiCollectionValue = meishiCollectionValue;
			}










				//级联表的get和set meishi

					/**
					* 获取：美食 的 用户
					*/
					public Integer getMeishiYonghuId() {
						return meishiYonghuId;
					}
					/**
					* 设置：美食 的 用户
					*/
					public void setMeishiYonghuId(Integer meishiYonghuId) {
						this.meishiYonghuId = meishiYonghuId;
					}


					/**
					* 获取： 美食编号
					*/
					public String getMeishiUuidNumber() {
						return meishiUuidNumber;
					}
					/**
					* 设置： 美食编号
					*/
					public void setMeishiUuidNumber(String meishiUuidNumber) {
						this.meishiUuidNumber = meishiUuidNumber;
					}

					/**
					* 获取： 美食名称
					*/
					public String getMeishiName() {
						return meishiName;
					}
					/**
					* 设置： 美食名称
					*/
					public void setMeishiName(String meishiName) {
						this.meishiName = meishiName;
					}

					/**
					* 获取： 美食照片
					*/
					public String getMeishiPhoto() {
						return meishiPhoto;
					}
					/**
					* 设置： 美食照片
					*/
					public void setMeishiPhoto(String meishiPhoto) {
						this.meishiPhoto = meishiPhoto;
					}

					/**
					* 获取： 美食做法
					*/
					public String getMeishiVideo() {
						return meishiVideo;
					}
					/**
					* 设置： 美食做法
					*/
					public void setMeishiVideo(String meishiVideo) {
						this.meishiVideo = meishiVideo;
					}

					/**
					* 获取： 赞
					*/
					public Integer getZanNumber() {
						return zanNumber;
					}
					/**
					* 设置： 赞
					*/
					public void setZanNumber(Integer zanNumber) {
						this.zanNumber = zanNumber;
					}

					/**
					* 获取： 踩
					*/
					public Integer getCaiNumber() {
						return caiNumber;
					}
					/**
					* 设置： 踩
					*/
					public void setCaiNumber(Integer caiNumber) {
						this.caiNumber = caiNumber;
					}

					/**
					* 获取： 美食类型
					*/
					public Integer getMeishiTypes() {
						return meishiTypes;
					}
					/**
					* 设置： 美食类型
					*/
					public void setMeishiTypes(Integer meishiTypes) {
						this.meishiTypes = meishiTypes;
					}


						/**
						* 获取： 美食类型的值
						*/
						public String getMeishiValue() {
							return meishiValue;
						}
						/**
						* 设置： 美食类型的值
						*/
						public void setMeishiValue(String meishiValue) {
							this.meishiValue = meishiValue;
						}

					/**
					* 获取： 游览量
					*/
					public Integer getMeishiClicknum() {
						return meishiClicknum;
					}
					/**
					* 设置： 游览量
					*/
					public void setMeishiClicknum(Integer meishiClicknum) {
						this.meishiClicknum = meishiClicknum;
					}

					/**
					* 获取： 相关食材
					*/
					public String getMeishiShicaiText() {
						return meishiShicaiText;
					}
					/**
					* 设置： 相关食材
					*/
					public void setMeishiShicaiText(String meishiShicaiText) {
						this.meishiShicaiText = meishiShicaiText;
					}

					/**
					* 获取： 美食详情
					*/
					public String getMeishiContent() {
						return meishiContent;
					}
					/**
					* 设置： 美食详情
					*/
					public void setMeishiContent(String meishiContent) {
						this.meishiContent = meishiContent;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getMeishiDelete() {
						return meishiDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setMeishiDelete(Integer meishiDelete) {
						this.meishiDelete = meishiDelete;
					}













				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}



}
