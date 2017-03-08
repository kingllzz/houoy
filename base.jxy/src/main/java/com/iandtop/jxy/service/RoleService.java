package com.iandtop.jxy.service;

import com.iandtop.jxy.vo.RoleVO;

import java.util.List;

public interface RoleService {
    List<RoleVO> retrieveAllWithPage(RoleVO vo) throws RuntimeException;

    Integer retrieveAllCount() throws RuntimeException;

    Integer saveRoleByVO(RoleVO vo);

    Integer updateRoleByVO(RoleVO vo);

    Integer deleteRoles(List<String> pk_roles);
}
