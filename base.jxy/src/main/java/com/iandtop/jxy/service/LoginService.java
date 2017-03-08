package com.iandtop.jxy.service;

import com.iandtop.saas.smartpark.vo.SuperVO;
import com.iandtop.saas.smartpark.vo.UserVO;

import java.util.List;

public interface LoginService {
    List<SuperVO> retrieveAllWithPage(SuperVO vo) throws RuntimeException;

    Integer retrieveAllCount() throws RuntimeException;

    List<UserVO> retrieveByCodeAndPwd(String code, String password) throws RuntimeException;
}
