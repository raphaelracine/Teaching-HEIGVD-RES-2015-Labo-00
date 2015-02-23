package ch.heigvd.res.lab00;

public class Flute implements IInstrument {
   @Override
   public String play() {
      return "whistle";
   }
   
   @Override
   public int getSoundVolume() {
      return 20;
   }
   
   @Override
   public String getColor() {
      return "brown";
   }
}
