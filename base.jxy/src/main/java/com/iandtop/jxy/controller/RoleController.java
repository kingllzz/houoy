package com.iandtop.jxy.controller;


import com.iandtop.jxy.service.RoleService;
import com.iandtop.jxy.util.JqueryDataTablesUtil;
import com.iandtop.jxy.vo.RoleVO;
import com.iandtop.saas.smartpark.vo.JquryDataTablesVO;
import com.iandtop.saas.smartpark.vo.RequestResultVO;
import com.iandtop.saas.smartpark.vo.SessionRootUserVO;
import com.iandtop.saas.smartpark.vo.UserVO;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author andyzhao
 */
@RestController
@RequestMapping("/api/role")
public class RoleController {
    private static final Log logger = LogFactory.getLog(RoleController.class);

    @Resource
    private RoleService roleService;

    @PostMapping("/save")
    public RequestResultVO add(@RequestBody RoleVO roleVO) {
        Integer num = 0;
        RequestResultVO resultVO = new RequestResultVO();
        if(roleVO!=null){
            if(roleVO.getPk_role()!=null){//如果前端传递过来pk,则判断为更新操作
                num = roleService.updateRoleByVO(roleVO);
            }else{
                num = roleService.saveRoleByVO(roleVO);
            }

            if(num>=1){
                resultVO.setSuccess(true);
                resultVO.setMsg("保存成功");
                resultVO.setResultData(num);
            }else{
                resultVO.setSuccess(false);
                resultVO.setMsg("保存失败");
            }
        }else{
            resultVO.setSuccess(false);
            resultVO.setMsg("参数不可为null");
        }
        return resultVO;
    }

    @PostMapping("/delete")
    public RequestResultVO delete(@RequestBody List<String> pk_roles) {
        Integer num = roleService.deleteRoles(pk_roles);
        RequestResultVO resultVO = new RequestResultVO();
        if(num>=1){
            resultVO.setSuccess(true);
            resultVO.setMsg("查询成功");
            resultVO.setResultData(num);
        }else{
            resultVO.setSuccess(false);
            resultVO.setMsg("保存");
        }

        return resultVO;
    }

    @ResponseBody
    @RequestMapping(value = "/retrieve")
    public JquryDataTablesVO<RoleVO> retrieve(RoleVO vo, HttpServletRequest request) {
        vo = (RoleVO) JqueryDataTablesUtil.filterParam(vo, request);
        List<RoleVO> result = roleService.retrieveAllWithPage(vo);
        Integer count = roleService.retrieveAllCount();
        JquryDataTablesVO rtv = JqueryDataTablesUtil.madeJqueryDatatablesVO(Long.valueOf(count), result);
        return rtv;
    }


}


