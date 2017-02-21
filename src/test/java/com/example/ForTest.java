package com.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class ForTest {
	
	static Log log = LogFactory.getLog(ForTest.class);
	@Test
	public void test01(){
		log.info("#######");
		log.info("test01");
		log.info("#######");
		
		String[] name = {"shin", "han" , "na"};
		
		if(name != null){
			for(String s : name){
				System.out.println(s);
				log.info(s);
			}
		}
		
	}

}
