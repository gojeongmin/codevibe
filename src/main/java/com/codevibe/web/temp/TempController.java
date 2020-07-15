package com.codevibe.web.temp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempController {

  @GetMapping("/")
  public String showIndexPage() {
    return "temp";
  }

}
