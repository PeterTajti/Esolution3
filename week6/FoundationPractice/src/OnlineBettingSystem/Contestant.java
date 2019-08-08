package OnlineBettingSystem;

public class Contestant {
   private String name;
   private int placement = -1;

   Contestant(int placement, String name){
      this.name = name;
      this.placement = placement;
   }

   public void setPlacement(int newPlacement){
      this.placement = newPlacement;
   }

   @Override
   public String toString(){
      return name+" has finished on the place: "+placement;
   }

   public String getName() {
      return name;
   }

   public int getPlacement() {
      return placement;
   }
}

