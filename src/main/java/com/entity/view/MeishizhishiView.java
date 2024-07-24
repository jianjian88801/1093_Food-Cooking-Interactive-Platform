package com.entity.view;

import com.entity.MeishizhishiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 美食知识
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("meishizhishi")
public class MeishizhishiView extends MeishizhishiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 美食知识类型的值
		*/
		private String meishizhishiValue;



	public MeishizhishiView() {

	}

	public MeishizhishiView(MeishizhishiEntity meishizhishiEntity) {
		try {
			BeanUtils.copyProperties(this, meishizhishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 美食知识类型的值
			*/
			public String getMeishizhishiValue() {
				return meishizhishiValue;
			}
			/**
			* 设置： 美食知识类型的值
			*/
			public void setMeishizhishiValue(String meishizhishiValue) {
				this.meishizhishiValue = meishizhishiValue;
			}










}
