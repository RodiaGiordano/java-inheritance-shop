package exercises.exerciseOne.products;

import exercises.exerciseOne.MakeDecFormat;
import exercises.exerciseOne.Product;

public class Television extends Product {
    public boolean smartTv;
    protected double width;
    protected double height;
    protected double depth;
    protected String screenSizeIn;

    public Television(String name, float price, boolean smartTv, double width, double height, double depth, String screenSizeIn, boolean loyaltyCard){
        super(name, price, loyaltyCard);
        this.smartTv = smartTv;
        this.width = checkMeasures(width, 'x');
        this.height = checkMeasures(height, 'y');
        this.depth = checkMeasures(depth, 'z');
        this.screenSizeIn = checkScreenMeasures(screenSizeIn);
    }

    public Television(String name, float price, boolean smartTv, String screenSizeIn, boolean loyaltyCard){
        super(name, price, loyaltyCard);
        this.smartTv = smartTv;
        this.screenSizeIn = checkScreenMeasures(screenSizeIn);

    }

    private double checkMeasures(double measures, char axis){
    // prese in onsiderazione 16:9 16''
           switch(axis){
               case 'x':
                  measures = measures < 36 ? 36 : measures;
                  return MakeDecFormat.formatDecNumb(measures);

               case 'y':
                   measures = measures < 20 ? 20 : measures;
                   return MakeDecFormat.formatDecNumb(measures);

               case 'z':
                   measures = measures < 1 ? 1 : measures;
                   return  MakeDecFormat.formatDecNumb(measures);

               default:
                   return MakeDecFormat.formatDecNumb(0);
           }

    }

    private String checkScreenMeasures(String measures){
        return Double.parseDouble(measures) < 16 ? "16''" : measures.concat("''");
    }

    @Override
    public String toString(){
        return String.format("Nome prodotto: %s, Prezzo: %.2f€, SmartTv: %s, Larghezza: %.1f cm, Altezza: %.1f cm, Profondità: %.1f cm, Schermo: %s", getName(), getPrice(true), smartTv ? "si": "no",width, height, depth, screenSizeIn );

    }

}
