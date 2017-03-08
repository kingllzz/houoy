package com.iandtop.jxy.mapper;

import com.iandtop.saas.smartpark.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author andyzhao
 */
@Mapper
public interface LoginMapper {
    //select:单表

    //select:多表关联查询

    //insert 增加

    //update

    //delete

    Integer retrieveAllCount() throws RuntimeException;

    List<UserVO> retrieveByCodeAndPwd(@Param("code") String code, @Param("password") String password) throws RuntimeException;

    List<UserVO> retrieveByCode(@Param("code") String code) throws RuntimeException;

}
