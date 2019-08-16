package spring.webrestaurant.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.webrestaurant.Models.Fox;
import spring.webrestaurant.Repositories.Database;
import java.util.Comparator;
import java.util.stream.Collectors;

@Controller
public class homePageController {

    Database myDatabase = new Database();

//@GetMapping ("/")
//    public String homePage (){
//    return "index";
//}

    @RequestMapping(value = "/home")
    public String homePage(Model model) {
        model.addAttribute("items", myDatabase.getListOfFoxes());

        return "index";
    }

    @GetMapping("/greenfoxpage")
    public String greenfoxpage(){
        return "greenfoxpage";
    }

    @GetMapping("/redfoxpage")
    public String redfoxpage(){
        return "redfoxpage";
    }

    @GetMapping("/blackfoxpage")
    public String blackfoxpage(){
        return "blackfoxpage";
    }

    @GetMapping("/bluefoxpage")
    public String bluefoxpage(){
        return "bluefoxpage";
    }

    @GetMapping("/purplefoxpage")
    public String purplefoxpage(){
        return "purplefoxpage";
    }

    @GetMapping("/yellowfoxpage")
    public String yellowfoxpage(){
        return "yellowfoxpage";
    }

    @GetMapping("/classicfoxpage")
    public String classicfoxpage(){
        return "classicfoxpage";
    }

    @RequestMapping(value = "/only-available")
    public String onlyAvailable(Model model) {
        model.addAttribute("items", myDatabase.getListOfFoxes().stream()
                .filter(item -> item.getQuantity() > 0)
                .collect(Collectors.toList()));
        return "index";
    }

    @RequestMapping(value = "/less-valuable")
    public String cheapestFirst(Model model) {
        model.addAttribute("items", myDatabase.getListOfFoxes().stream()

                .sorted((Comparator.comparingDouble(Fox::getValue)))
                .collect(Collectors.toList()));

        return "index";
    }

    @RequestMapping(value = "/contains-good")
    public String containsGood(Model model) {
        model.addAttribute("items", myDatabase.getListOfFoxes().stream()

                .filter(item -> item.getDescription().toLowerCase().contains("good"))
                .collect(Collectors.toList()));

        return "index";
    }

    @RequestMapping(value = "/average-stock")
    public String averageStock(Model model) {
        model.addAttribute("average", myDatabase.getListOfFoxes().stream()

                .mapToDouble(item -> item.getQuantity())
                .average()
                .getAsDouble());

        return "index";
    }

    @RequestMapping(value = "/most-valuable-available")
    public String mostExpensiveAvailable(Model model) {
        model.addAttribute("items", myDatabase.getListOfFoxes().stream()

                .filter(item -> item.getQuantity() > 0)
                .max(Comparator.comparingDouble(Fox::getValue)).get());

        return "index";
    }

    @PostMapping("/search")
    public String getText(@RequestParam("keyword") String keyword, Model model){
        model.addAttribute("items", myDatabase.getListOfFoxes().stream()
                .filter(shopItem -> shopItem.getName().toLowerCase().contains(keyword) || shopItem.getDescription().toLowerCase().contains(keyword))
                .collect(Collectors.toList()));
        return "index";
    }

}
