package app.vercel.kaiowsz.frstspring.ioc_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/component")

public class MyControllerComponent {

    // inversão de controle -> o controle sai do programador e vai pro spring. !!! por isso se chama ioc porra!!!!!!!!

    // di é inversão de dependencia. MESMA COISAAAAAAAAAAAAAA A AA A AA AA só que com dependência.

    // autowired é uma anotation pro spring gerenciar o ciclo de vida do component "myComponent". Com isso, você não precisa instanciar o método.

    @Autowired
    MyComponent myComponent;

    @GetMapping("/")
    public String first() {
        return myComponent.callMyComponent();
    }
}
