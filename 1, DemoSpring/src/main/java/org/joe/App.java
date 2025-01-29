package org.joe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    ApplicationContext Context = new ClassPathXmlApplicationContext("spring.xml");
    Dev dev = (Dev) Context.getBean("dev");
    dev.build();
  }
}
