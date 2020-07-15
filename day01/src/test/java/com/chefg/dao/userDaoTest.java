package com.chefg.dao;

import com.chefg.pojo.user;
import com.chefg.utils.mybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.chefg.dao.userDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class userDaoTest {


    @Test
    public void getUserList(){
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        userDao mapper = sqlSession.getMapper(userDao.class);
        mapper.getUserList();




        sqlSession.close();
    }
    @Test
    public void getUser(){
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        userDao mapper = sqlSession.getMapper(userDao.class);
        mapper.getUser();
        System.out.println(mapper.getUser());




        sqlSession.close();
    }


}
