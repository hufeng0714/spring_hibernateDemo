package com.how2java.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2java.dao.CategoryDAO;
import com.how2java.pojo.Category;
		
		/*
		 整合思路是，使DAO继承HibernateTemplate这个类 
		HibernateTemplate这个类提供了setSessionFactory()方法用于注入SessionFactory 
		通过spring获取DAO的时候，注入SessionFactory.
		 */
public class TestSpring01 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
        CategoryDAO dao = (CategoryDAO) context.getBean("dao");
        List<Category> cs= dao.find("from Category c");
        System.out.println(cs);
    }
}
