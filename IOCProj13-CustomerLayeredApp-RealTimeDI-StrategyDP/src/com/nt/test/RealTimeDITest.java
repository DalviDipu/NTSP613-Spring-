package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.BankController;
import com.nt.vo.CustomerVO;

public class RealTimeDITest {

	public static void main(String[] args) {
		//create ioc container
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		//get controller class obj
		BankController controller=factory.getBean("controller",BankController.class);
		
		//read the inputs from end user
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter customer name::");
		String cname=scn.next();
		
		System.out.println("Enter customer address::");
		String cadd=scn.next();
		
		System.out.println("Enter principle amount::");
		String pAmt=scn.next();
		
		System.out.println("Enter rate of interest::");
		String rate=scn.next();
		
		System.out.println("Enter time of interest::");
		String time=scn.next();
		
		//create CustomerVO class obj having all inputs
		CustomerVO vo=new CustomerVO();
		
		vo.setCname(cname); 
		vo.setCadd(cadd);
		vo.setpAmt(pAmt);
		vo.setRate(rate);
		vo.setTime(time);
		
		//invoke method
		try {
			String result=controller.processController(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			System.out.println("Problem in Customer Registration...!");
			e.printStackTrace();
		}

	}//main method
}//class
