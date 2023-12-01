package app.vercel.kaiowsz.frstspring.ioc_di;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    public String callMyComponent() {
        Number myNumber = 51;

        return myNumber.toString();
    }
}
