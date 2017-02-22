package com.houoy.cms.service.impl;

import com.houoy.cms.dao.EssayRepository;
import com.houoy.cms.service.EssayService;
import com.houoy.cms.vo.EssayVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017-02-21.
 */
@Service("essayService")
@Transactional
public class EssayServiceImpl implements EssayService {
    @Autowired
    private EssayRepository essayRepository;

    public void iiiii(){
        essayRepository.deleteAll();

        // save a couple of customers
        //essayRepository.save(new EssayVO("Alice", "Smith"));
        //essayRepository.save(new EssayVO("Bob", "Smith"));

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (EssayVO customer : essayRepository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();

        // fetch an individual customer
//        System.out.println("Customer found with findByFirstName('Alice'):");
//        System.out.println("--------------------------------");
//        System.out.println(essayRepository.findByFirstName("Alice"));
//
//        System.out.println("Customers found with findByLastName('Smith'):");
//        System.out.println("--------------------------------");
//        for (EssayVO customer : essayRepository.findByLastName("Smith")) {
//            System.out.println(customer);
//        }

    }

    public EssayVO save(EssayVO essayVO) {
        return essayRepository.save(essayVO);
    }

    public EssayVO update(EssayVO essayVO) {
        return essayRepository.save(essayVO);
    }

    public void delete(List<EssayVO> ids) {
        essayRepository.delete(ids);
    }

    public Long count() {
        return essayRepository.count();
    }

    //自动加入事务 Transactional
    @Transactional
    public EssayVO findByTitle(String title) {
        return essayRepository.findByTitle(title);
    }

    public List<EssayVO> findBySubTitle(String subTitle) {
        return essayRepository.findBySubTitle(subTitle);
    }

    public List<EssayVO> findAll() {
        return essayRepository.findAll();
    }
}
