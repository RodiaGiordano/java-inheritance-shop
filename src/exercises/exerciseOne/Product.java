package exercises.exerciseOne;

import exercises.RandomNumb;

public class Product {

    protected int code; //random
    protected String name;
    protected float price;
    protected int vat;

    public Product(String name, float price){
        code = RandomNumb.randomNumber();
        this.name = name;
        this.price = price;
        vat = 22;
    }

    public String getCode(){
       return String.format("%06d", code);
    }

    public String getName(){

      return name;

    }

    public String getName(boolean complete){
        return getCode() + "-" + name;
    }



    public float getPrice(boolean whitVat){

        return price + (price * vat / 100);
    }

    public int getVat(){
        return vat;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setPrice(float newPrice){
        price = newPrice > 0 ? newPrice : price;
    }

    public void setVat(int newVat){
        vat = newVat > 0 ? newVat : 22;
    }


    @Override
    public String toString(){
        return "{code=" + code + ",name=" + name + ",price=" + price + ",vat=" + vat + "}";
    }


}
