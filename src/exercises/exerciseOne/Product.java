package exercises.exerciseOne;

import exercises.RandomNumb;
import exercises.exerciseOne.products.Headphones;
import exercises.exerciseOne.products.Smartphone;
import exercises.exerciseOne.products.Television;

// ho fatto scegiere anche lìunità di misura della memoria dello Smartphone..
// ho implementato il bonus di fretta dovendo mettere in public gli attributi necessari per la verifica
public class Product {

    protected int code; //random
    protected String name;
    protected float price;
    protected int vat;
    protected int discount;
    protected boolean loyaltyCard;

    public Product(String name, float price, boolean loyaltyCard){
        code = RandomNumb.randomNumber();
        this.name = name;
        this.price = price;
        vat = 22;
        this.discount = discount;
        this.loyaltyCard = loyaltyCard;
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

        if(loyaltyCard){


            if(this instanceof Smartphone){
                Smartphone smartphone = (Smartphone) this;
                discount = smartphone.memory < 32 ? 10 : 2;
        }else if(this instanceof Television){
                Television television = (Television) this;
                discount = television.smartTv ? 10 : 2;

            }else if(this instanceof Headphones){
                Headphones headphones = (Headphones) this;
            discount = headphones.type.equals("wireless") ? 7: 2;
        }

        }
        return price - (price * discount / 100) + (price * vat / 100);
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
