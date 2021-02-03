package com.rivetlogic.blog;

import jfortune.Fortune;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
import java.util.Map;


@RestController()
public class FortuneService {

    @RequestMapping(path = "/fortune", produces = "application/json")
    @ResponseBody()
    public Map<String, String> fortune() {
        return Map.of("fortune",new Fortune(Locale.ENGLISH).getCookie().getText());
    }
}
