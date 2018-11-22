package com.how2java.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2java.dao.CategoryDAO;

//通过find方法执行select(*)，接着会返回一个List里面第一个元素即总数
public class TestSpring04 {

	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
        CategoryDAO dao = (CategoryDAO) context.getBean("dao");
         
        List<Long> l =dao.find("select count(*) from Category c");
        long total = l.get(0);
        System.out.println(total);
	}
}
