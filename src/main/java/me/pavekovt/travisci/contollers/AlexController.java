package me.pavekovt.travisci.contollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/alex")
public class AlexController {

    @GetMapping(value = "/{number1}+{number2}")
    public Integer calc(
            @PathVariable("number1") Integer number1,
            @PathVariable("number2") Integer number2
    ) {
        return number1 + number2;
    }
}
