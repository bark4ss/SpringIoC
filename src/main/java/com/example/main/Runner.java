package com.example.main;

import com.example.config.ApplicationConfig;
import com.example.model.Message;
import com.example.model.OperationModel;
import com.example.service.CalculateSimple;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);

        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }

        Message message = context.getBean(Message.class);

        message.setMessage("This is simple message.");
        System.out.println(message);

        //OperationModel model = context.getBean("operationalModel", OperationModel.class);
        OperationModel model = context.getBean("getOperationModel",OperationModel.class);
        CalculateSimple simple = context.getBean(CalculateSimple.class);
        int addResult = simple.add(model);
        int fibonacciResult = simple.fibonacci(model);
        double sqrtResult = simple.sqrt(model);
        int powerResult = simple.power(model);
        System.out.println(addResult);
        System.out.println(fibonacciResult);
        System.out.println(sqrtResult);
        System.out.println(powerResult);

        context.close();

    }
}
