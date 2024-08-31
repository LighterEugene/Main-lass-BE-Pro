package Donuts;

import model.*;

public class DonutsMachine {
    public void printAllDonutsType(){
        for (DonutsType type : DonutsType.values()){
        System.out.println("" + (type.ordinal() + 1) + " : " + type.getDescription());
         }
     }
     public Donut makeDonut(int chooseOption) {
        DonutsType chooseDonut = null;
        for(DonutsType type : DonutsType.values()){
            int ordinal = type.ordinal();
            if (ordinal ==  (chooseOption-1)) {
                chooseDonut = type;
                break;
            }
        }
         System.out.println("Ready to make " + chooseDonut);
        switch (chooseDonut) {
            case MOCHI :
                return new DonutMochi(DonutsType.MOCHI);
            case FRENCH:
                return new DonutFrench(DonutsType.FRENCH);
            case BRIOCHE:
                return new DonutBrioche(DonutsType.BRIOCHE);
            case CLASSIC:
                return new DonutClassic(DonutsType.CLASSIC);
            case AMERICAIN:
                return new DonutAmericain(DonutsType.AMERICAIN);
            default:
        }
return null;
     }
}