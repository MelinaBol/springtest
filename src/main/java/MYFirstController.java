import org.springframework.web.bind.annotation.RestController;

@RestController
public class MYFirstController {

    public HelloDTO hello(){
        return new HelloDTO;
    }

    public static class HelloDTO(){
        private String text;
    }
}


