package com.bjprowernode;

import com.bjpowernode.vo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tests {
    @Test
    public void one(){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        Student myStudent = applicationContext.getBean("myStudent", Student.class);
//        System.out.println("容器对象："+myStudent);
        String config="beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ctx.getBean(Student.class);
        System.out.println("容器中的对象："+student);


    }
}
