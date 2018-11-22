package com.how2java.test;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2java.dao.CategoryDAO;
import com.how2java.pojo.Category;

public class TestSpring03 {

	/*
	 * 分页
		Spring和Hibernate整合是借助HibernateTemplate进行的. 
		分页查询比起直接使用hibernate有所区别 
		主要会用到DetachedCriteria进行
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"applicationContext.xml"});
		CategoryDAO dao = (CategoryDAO) context.getBean("dao");
        
        DetachedCriteria dc = DetachedCriteria.forClass(Category.class);
        int start =5;//从多少开始查询
        int count =10;//每页显示数量
        List<Category> cs= dao.findByCriteria(dc,start,count);
        System.out.println(cs);
	}
}
