package com.houoy.cms.controller;

import com.houoy.cms.config.CommonConfig;
import com.houoy.cms.config.JqueryDataTablesUtil;
import com.houoy.cms.service.EssayService;
import com.houoy.cms.vo.EssayVO;
import com.iandtop.saas.smartpark.vo.JquryDataTablesVO;
import com.iandtop.saas.smartpark.vo.RequestResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by andyzhao on 2017-02-20.
 */
@RestController
public class EssayController {

    @Autowired
    private CommonConfig commonConfig;

    @Autowired
    private EssayService essayService;

    @DeleteMapping("/delete")
    public RequestResultVO deletes(@RequestBody List<EssayVO> _ids) {
        RequestResultVO resultVO = new RequestResultVO();
        if (_ids != null) {
            essayService.delete(_ids);
            resultVO.setSuccess(true);
            resultVO.setMsg("删除");
            resultVO.setResultData(_ids.size());

        } else {
            resultVO.setSuccess(false);
            resultVO.setMsg("参数不可为null");
        }
        return resultVO;
    }

    @PostMapping("/essay")
    public RequestResultVO essayAdd(@RequestBody EssayVO essayVO) {
        EssayVO num = null;
        RequestResultVO resultVO = new RequestResultVO();
        if (essayVO != null) {
            if (essayVO.getId() != null) {//如果前端传递过来pk,则判断为更新操作
                num = essayService.update(essayVO);
            } else {
                num = essayService.save(essayVO);
            }
            if (num != null) {
                resultVO.setSuccess(true);
                resultVO.setMsg("保存成功");
                resultVO.setResultData(num);
            } else {
                resultVO.setSuccess(false);
                resultVO.setMsg("保存失败");
            }
        } else {
            resultVO.setSuccess(false);
            resultVO.setMsg("参数不可为null");
        }
        return resultVO;
    }

    @CrossOrigin
    @GetMapping("/essay")
    public JquryDataTablesVO<EssayVO> retrieve(EssayVO vo, HttpServletRequest request) {
        vo = (EssayVO) JqueryDataTablesUtil.filterParam(vo, request);
        List<EssayVO> result = essayService.findAll();
        Long count = essayService.count();

        JquryDataTablesVO rtv = JqueryDataTablesUtil.madeJqueryDatatablesVO(count, result);
        return rtv;
    }
}


