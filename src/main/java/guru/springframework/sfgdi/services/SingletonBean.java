package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Create a Singleton bean..");
    }

    public String getMyScope() {
        return "I'm a Singleton!";
    }

}
