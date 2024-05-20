package exercises.exerciseOne.products;

import exercises.exerciseOne.Product;

public class Headphones extends Product {

    private String color;
    private String type;

    public Headphones(String name, float price, String color, String type){
        super(name, price);
        this.color = checkColor(color);
        this.type =type;

    }

    public Headphones(String name, float price){
        super(name,price);
        this.color ="N.D.";
        this.type = "N.D.";
    }

    private String checkColor(String color){

        switch(color.toLowerCase()){
            case "rosso":
            case "giallo":
            case "blu":
            case "verde":
                return color;

            default: return "N.D";
        }
    }

    @Override
    public String toString(){
        return String.format("Nome prodotto: %s, Prezzo: %.2f€, Colore: %s, Tipo: %s", getName(true), getPrice(true), color, type);

    }
}
