package com.example.config;

import com.example.model.Message;
import com.example.model.OperationModel;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.example")
public class ApplicationConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Message printMessage(){
        return new Message();
    }

    @Bean
    public OperationModel getOperationModel() {
        System.out.println("Initialize Bean");
        return new OperationModel(3,4,8);
    }

    @Bean(initMethod = "initialize")
    public OperationModel operationModel() {
        return new OperationModel(6,7,9);
    }
}
