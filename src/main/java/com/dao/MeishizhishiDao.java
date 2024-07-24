package com.dao;

import com.entity.MeishizhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.MeishizhishiView;

/**
 * 美食知识 Dao 接口
 *
 * @author 
 */
public interface MeishizhishiDao extends BaseMapper<MeishizhishiEntity> {

   List<MeishizhishiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
