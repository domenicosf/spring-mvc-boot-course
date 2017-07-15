package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by domenico on 15/07/2017.
 */
@Component
public class InjectedByConstructorService {
    private HelloWorldService helloWorldService;

    @Autowired
    public InjectedByConstructorService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void getMessage(){
        helloWorldService.sayHello();
    }
}
