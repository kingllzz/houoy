package com.iandtop.jxy.service.impl;

import com.iandtop.jxy.mapper.LoginMapper;
import com.iandtop.jxy.service.LoginService;
import com.iandtop.saas.smartpark.utils.Encode;
import com.iandtop.saas.smartpark.vo.SuperVO;
import com.iandtop.saas.smartpark.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author andyzhao
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    public List<SuperVO> retrieveAllWithPage(SuperVO vo) throws RuntimeException {
        // List<Map> datas = loginMapper.retrieveCountWithPage(vo);
        //List<RoleVO> result = BaseUtils.mapToBean(RoleVO.class, datas);
        return null;
    }

    public Integer retrieveAllCount() throws RuntimeException {
        return loginMapper.retrieveAllCount();
    }

    public List<UserVO> retrieveByCodeAndPwd(String code, String password) throws RuntimeException {
        String encrypted_password = Encode.encode(password);
        return loginMapper.retrieveByCodeAndPwd(code, encrypted_password);
    }

}
