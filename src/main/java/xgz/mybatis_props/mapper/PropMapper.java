package xgz.mybatis_props.mapper;

import xgz.mybatis_props.model.Prop;

public interface PropMapper {
    int deleteByPrimaryKey(String propId);

    int insert(Prop record);

    int insertSelective(Prop record);

    Prop selectByPrimaryKey(String propId);

    int updateByPrimaryKeySelective(Prop record);

    int updateByPrimaryKey(Prop record);
}