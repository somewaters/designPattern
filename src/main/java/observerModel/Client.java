package observerModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Client {

    public static void main(String[] args){
        SpringApplication.run(Client.class,args);
        Boss boss = (Boss)SpringUtil.getBean("boss");
        boss.comeBack();

    }


}
