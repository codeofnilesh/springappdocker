package in.nilesh.appcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/hello")
    public String getMsg(){
        return "Hello Nilesh";
    }
    @GetMapping(path = "/greet")
    public String getGreet(){
        return "Good Morning!!";
    }
}
