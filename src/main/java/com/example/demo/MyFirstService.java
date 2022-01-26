package com.example.demo;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {


//gibt aus wann der constuctor immer aufgerufen wird.
    public MyFirstService(){
        System.out.println("My first service constuctor called");
    }


    //
    @EventListener(classes = ApplicationReadyEvent.class)
    public void init(){
        System.out.println( "My first service is ready. Application has been started.");
    }
}
