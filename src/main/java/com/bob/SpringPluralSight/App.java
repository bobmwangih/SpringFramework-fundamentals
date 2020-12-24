package com.bob.SpringPluralSight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bob.SpringPluralSight.service.SpeakerService;
import com.bob.SpringPluralSight.service.SpeakerServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //SpeakerService service = new SpeakerServiceImpl();
        
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	SpeakerService service = context.getBean(SpeakerService.class);
    	
    	System.out.println(service.findAll().get(0).getName());
    }
}
