package com.pad.dao;

import com.pad.entity.Person;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by pad on 17-5-21.
 */
@Repository
public interface TestDao {

    //这里的Param注解在只有一个参数时不需要，但是在多个参数时起到标识的作用
    Person queryById(@Param("p_id")int p_id);

    int addPerson(@Param("p_name")String p_name);
}
