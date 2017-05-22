package com.pad.service;

import com.pad.dao.TestDao;
import com.pad.entity.Person;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by pad on 17-5-21.
 */
@Service
public class TestService {
    @Resource
    private TestDao testDao;

    @Transactional
    public boolean test(){
        System.out.println(testDao.addPerson("test"));
        Person p=testDao.queryById(2);
        System.out.println(p.getP_name());
        return true;
    }

    @Test
    public void testM(){
        TestService t=new TestService();
        System.out.println(t.testDao);
    }
}
