package net.runnerdave;

import org.springframework.beans.factory.BeanFactory;  

import org.springframework.beans.factory.xml.XmlBeanFactory;  

import org.springframework.core.io.*;  

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Resource r=new ClassPathResource("applicationContext.xml");  

        BeanFactory factory=new XmlBeanFactory(r);  

        Book b=(Book)factory.getBean("book");  

        b.display();  
    }
}
