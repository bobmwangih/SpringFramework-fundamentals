package com.bob.SpringPluralSight;

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
        SpeakerService service = new SpeakerServiceImpl();
         System.out.println(service.findAll().get(0).getName());
    }
}
