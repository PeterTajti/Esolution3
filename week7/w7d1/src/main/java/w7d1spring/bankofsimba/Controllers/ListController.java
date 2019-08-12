package w7d1spring.bankofsimba.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import w7d1spring.bankofsimba.Models.BankAccount;
import w7d1spring.bankofsimba.Models.Database;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ListController {

  Database myDatabse = new Database();

  @GetMapping("/home")
  public String home(){
    return "index";
  }

//  List<BankAccount> accountList = new ArrayList<>();
//
//  public ListController () {
//    this.accountList.add(new BankAccount("Simba", 2000, "Lion"));
//  }

  @GetMapping("/show")
  public String show(Model model){
    model.addAttribute("accounts", myDatabse.getListOfBankAccounts());

    return "index";
  }

  @GetMapping("/twotext")
  public String twotext (Model model){
    model.addAttribute("thetexttoshow", "This is an <em class=\"redtext\">HTML</em> text. <b>Enjoy yourself!</b>");
    return "twotext";
  }


}
