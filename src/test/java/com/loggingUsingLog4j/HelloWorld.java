package com.loggingUsingLog4j;
import org.apache.log4j.BasicConfigurator;  
import org.apache.log4j.LogManager;  
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;  
   
public class HelloWorld {  
   
  private static final Logger logger = LogManager.getLogger(HelloWorld.class);  
 public static void main(String[] args) {  
  // basic log4j configurator  
	 
 // BasicConfigurator.configure();  
  PropertyConfigurator.configure("C:\\Users\\Sunil.more\\eclipse-workspace\\RestAssuredProject\\Properties\\log4j.properties");
  logger.info("Hello world");  
  logger.info("we are in logger info mode");  
   
 }  
   
}