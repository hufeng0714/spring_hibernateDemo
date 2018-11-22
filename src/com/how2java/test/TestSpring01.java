package com.how2java.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2java.dao.CategoryDAO;
import com.how2java.pojo.Category;
		
		/*
		 ����˼·�ǣ�ʹDAO�̳�HibernateTemplate����� 
		HibernateTemplate������ṩ��setSessionFactory()��������ע��SessionFactory 
		ͨ��spring��ȡDAO��ʱ��ע��SessionFactory.
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
