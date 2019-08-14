package w7d3.usefulutilities.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListOfControllers {
  @GetMapping("/useful")
  public String home(){
    return "mainpage";
  }
}
