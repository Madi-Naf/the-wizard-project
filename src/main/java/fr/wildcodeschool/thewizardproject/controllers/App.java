package fr.wildcodeschool.thewizardproject.controllers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.wildcodeschool.thewizardproject.models.Dumbledore;
import fr.wildcodeschool.thewizardproject.models.Gandalf;
import fr.wildcodeschool.thewizardproject.models.WizardInterface;

public class App {
	public void start() {
//    	COMPATIBLE AVEC LES 2 SOLUTIONs ###############################################
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
    	WizardInterface personage1 = context.getBean("personage", WizardInterface.class);
        context.close();

		  
//	   	OUTPUT     ###############################################
        System.out.println("");
        System.out.println("******************");
        System.out.println(personage1.giveAdvice());
        System.out.println("******************");
        
        WizardInterface personage2 = new Dumbledore();
        System.out.println("");
        System.out.println("******************");
        System.out.println(personage2.giveAdvice());
        System.out.println("******************");
	}
}
