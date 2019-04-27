package observerModel;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class StockEmployeer implements ApplicationListener<BossArrivalEvent> {
    public void onApplicationEvent(BossArrivalEvent bossArrivalEvent) {
        System.out.println(bossArrivalEvent.getSource()+" come back ,close stock website");

    }
}
