package exercises.exerciseOne;

import exercises.exerciseOne.products.Headphones;
import exercises.exerciseOne.products.Smartphone;
import exercises.exerciseOne.products.Television;

public class Main {
    public static void main (String[]args) {

        /* Product product = new Product("ciao", 40);

        System.out.println("name: " + product.getName(false));
        System.out.println("nome completo: " + product.getName(true));

        product.setName("giorgio");
        System.out.println("change nome completo: " + product.getName(true));

        System.out.println("prezzo: " + product.getPrice(false));
        System.out.println("prezzo + vat: " + product.getPrice(true));

        product.setPrice(10.30F);
        product.setVat(10);
        System.out.println("change prezzo: " + product.getPrice(false));
        System.out.println("change prezzo + vat: " + product.getPrice(true));

        IMEI: 490154203237518
*/
        Smartphone smartphoneOne = new Smartphone("galaxy", 190.50F, "490154203237518", 256, "gb" );

       // System.out.println(smartphoneOne.getFullParams());

       // Television television = new Television("SmartTv", 382, true, 10,10,0.5,"15");
       // System.out.println(television.toString());

        Television television = new Television("Samsung", 5500 , false, "48");
       // System.out.println(television.toString());

        Headphones headphones = new Headphones("cuffie", 18, "ROSSO", "wireless");
        System.out.println(headphones);
    }
}
