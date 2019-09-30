package FoundationExam.OnlineBettingSystem;

public class Contestant {

  private String name;
  private Integer placement;

  public Contestant() {

  }

  public Contestant(String name, Integer placement) {

    this.name = name;
    this.placement = placement;

  }

  public void setPlacement(Integer placementValue) {

    this.placement = placementValue;

  }

  public int getPlacement() {

    return placement;

  }

  public String toString() {

    System.out.println(name + " has finished on place: " + placement);
    return name + " has finished on place: " + placement;
  }
}
