package com.iandtop.jxy.service.impl;


import com.iandtop.jxy.mapper.RoleMapper;
import com.iandtop.jxy.service.RoleService;
import com.iandtop.jxy.vo.RoleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author andyzhao
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    public List<RoleVO> retrieveAllWithPage(RoleVO vo) throws RuntimeException {
        List<RoleVO> datas = roleMapper.retrieveAllWithPage(vo);
//        List<Map> datas = roleMapper.retrieveCountWithPage(vo);
//        List<RoleVO> result = BaseUtils.mapToBean(RoleVO.class, datas);
        return datas;
    }

    public Integer retrieveAllCount() throws RuntimeException {
        return roleMapper.retrieveAllCount();
    }

    public Integer saveRoleByVO(RoleVO vo) {
        return roleMapper.saveRoleByVO(vo);
    }

    public Integer updateRoleByVO(RoleVO vo) {
        return roleMapper.updateRoleByVO(vo);
    }

    public Integer deleteRoles(List<String> pk_roles) {
        return roleMapper.deleteRoles(pk_roles);
    }
}
