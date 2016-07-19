package ua.goit.com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.goit.com.calc_library.Calculator;
import ua.goit.com.calc_library.mainLogic.Executor;
import ua.goit.com.calc_library.mainLogic.TaskParser;

@Configuration
public class AppConfig {

    @Bean
    public Calculator calculator(TaskParser taskParser, Executor executor){
        Calculator calculator = new Calculator(executor);
        calculator.setTaskParser(taskParser);
        return calculator;
    }

    @Bean
    public TaskParser taskParser (){
        return new TaskParser();
    }

    @Bean
    public Executor executor (){
        return new FinalExecutor();
    }

}
