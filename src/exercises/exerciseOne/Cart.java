package exercises.exerciseOne;

import exercises.exerciseOne.products.Headphones;
import exercises.exerciseOne.products.Smartphone;
import exercises.exerciseOne.products.Television;

import java.util.Scanner;

public class Cart {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);



        boolean addProduct = true;
        System.out.println("Hai una tessera fedeltà? si/no");
        String loyaltyCarduser = scanner.nextLine().toLowerCase();
        boolean loyaltyCard;
        if(loyaltyCarduser.equals("si")){
            loyaltyCard = true;
        }else{
            loyaltyCard = false;
        }
        System.out.println("quanti prodotti vuoi inserire?");
        int counter = Integer.parseInt(scanner.nextLine());
        Product[] productArray = new Product[counter];


        for(int i = 0; i < productArray.length; i++){
            System.out.println("che tipo di prodotto vuoi inserire? Tv/Smartphone/Cuffie");
            String productType = scanner.nextLine().toLowerCase();
            switch (productType){
                case "tv":
                    productArray[i] = new Television("samsungTv", 5500, true, 50, 50,2,"45", loyaltyCard);
                    break;
                case "smartphone":
                    productArray[i] = new Smartphone("Samsung Galaxy", 800, "490154203237518", 256, "gb", loyaltyCard);
                case "cuffie":
                    productArray[i] = new Headphones("cuffie", 18, "blu", "wireless", loyaltyCard);
            }
        }
        scanner.close();

        for(int i = 0; i < productArray.length; i++){
            System.out.println(productArray[i].toString());
        }
    }
}
