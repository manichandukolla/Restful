package com.transport.boot;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.transport.railTicket.RailTicketService;


public class SingleObjectPerApplication extends Application{

   private Set<Class<?>> classes;
   private Set<Object> obj;
   
   
public SingleObjectPerApplication(){
	   classes=new HashSet<>();
	   obj=new HashSet<>();
	   obj.add(new RailTicketService());
   }
	@Override
	public Set<Class<?>> getClasses() {
		// TODO Auto-generated method stub
		return classes;
	}

	@Override
	public Set<Object> getSingletons() {
		// TODO Auto-generated method stub
		return obj;
	}

	
}
