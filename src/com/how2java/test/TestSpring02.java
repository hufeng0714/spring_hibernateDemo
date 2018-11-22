package com.how2java.test;
 
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2java.dao.CategoryDAO;
import com.how2java.pojo.Category;
 
		/*
		 因为CategoryDAO 继承了HibernateTemplate,所以可以直接使用
		1. save 增加
		2. get 获取
		3. update 修改
		4. delete 删除
		 */
public class TestSpring02 {
 
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
        CategoryDAO dao = (CategoryDAO) context.getBean("dao");
        Category c = new Category();
        c.setName("category yyy");
        
        //增加
        dao.save(c);
        
        //获取
        Category c2 = dao.get(Category.class, 3);
        
        //修改
        c2.setName("category zzz");
        dao.update(c2);
        
        //删除
        dao.delete(c2);
        
        

    }
}