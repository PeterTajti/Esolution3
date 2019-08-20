package w7d3.coloring.Models;
import org.springframework.stereotype.Service;
import w7d3.coloring.MyColor;
import w7d3.coloring.Services.Printer;


public class Red implements MyColor {

  private Printer printer;

  public Red(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor () {
    printer.log("This is the red color.");
  }
}
