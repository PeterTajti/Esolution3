package w7d3.coloring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Exercise1Application {

  private MyColor myColor;

  @Autowired
  Exercise1Application(MyColor myColor) {
    this.myColor = myColor;
    this.myColor.printColor();
  }

  public static void main(String[] args) {

    SpringApplication.run(Exercise1Application.class, args);
  }


}
