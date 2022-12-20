package co.develhope.deploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/somma")
public class BasicController {
    @GetMapping
    public double sum(){
        return (Math.random()*100) + (Math.random()*100);
    }
}