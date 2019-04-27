package observerModel;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;


@Service
public class Boss implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;


    public void comeBack(){
        System.out.println("boss come back");
        applicationEventPublisher.publishEvent(new BossArrivalEvent("boss"));

    }
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;

    }
}
