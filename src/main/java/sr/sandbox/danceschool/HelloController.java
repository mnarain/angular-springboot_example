package sr.sandbox.danceschool;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "{\"message\": \"Hello World!!! " +
                "from the hello controller\"}";
    }
}
