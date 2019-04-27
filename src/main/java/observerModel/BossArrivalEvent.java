package observerModel;

import javafx.application.Application;
import org.springframework.context.ApplicationEvent;

public class BossArrivalEvent extends ApplicationEvent {

    public BossArrivalEvent(String name) {
        super(name);
    }
}
