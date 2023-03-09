package com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.entity.Subject;
import com.entity.Trainer;
@Configuration
public class DependencyConfig {

	@Bean
	public Subject subject ()
	{
       return new Subject (100 , "java");
  
    }
	
	@Bean
	public Trainer trainer ()
	{
       return new Trainer ("Monalisa Chakroborty", subject());
  
    }

}

