package com.houoy.cms.service;

import com.houoy.cms.vo.EssayVO;

import java.util.List;

/**
 * Created by andyzhao on 2017-02-20.
 */
public interface EssayService {

    EssayVO save(EssayVO essayVO);

    EssayVO update(EssayVO essayVO);

    public void delete(List<EssayVO> ids) ;

    Long count();

    EssayVO findByTitle(String title);

    List<EssayVO> findBySubTitle(String subTitle);

    List<EssayVO> findAll();
}
