package com.how2java.test;
 
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2java.dao.CategoryDAO;
import com.how2java.pojo.Category;
 
		/*
		 ��ΪCategoryDAO �̳���HibernateTemplate,���Կ���ֱ��ʹ��
		1. save ����
		2. get ��ȡ
		3. update �޸�
		4. delete ɾ��
		 */
public class TestSpring02 {
 
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
        CategoryDAO dao = (CategoryDAO) context.getBean("dao");
        Category c = new Category();
        c.setName("category yyy");
        
        //����
        dao.save(c);
        
        //��ȡ
        Category c2 = dao.get(Category.class, 3);
        
        //�޸�
        c2.setName("category zzz");
        dao.update(c2);
        
        //ɾ��
        dao.delete(c2);
        
        

    }
}