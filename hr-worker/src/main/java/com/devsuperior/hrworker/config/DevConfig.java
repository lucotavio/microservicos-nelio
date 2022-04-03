package com.devsuperior.hrworker.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DevConfig {

    @Autowired
    private DataBase dataBase;
    
    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String ddl;
    
    @Bean
    public boolean instanciaDB(){
        
        if(ddl.equals("update")){
            
            this.dataBase.instancia();
        }
        
        return false;
        
    }
}