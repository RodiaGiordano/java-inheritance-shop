package exercises.exercisesTwo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args){

/*

        double price = 10.335;
        BigDecimal bigDecimal = new BigDecimal(price).setScale(2, RoundingMode.HALF_UP);
        System.out.println(bigDecimal);
 */

        int prova2 = 254;
        byte prova = (byte) prova2;
        System.out.println( prova);
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci il tuo nome");
        String name = scanner.nextLine();

        BankAccount account = new BankAccount(name);

        boolean choice = true;



        String result;
        do{
            System.out.println("Scegli tra: " + "prelievo,deposito o esci");
            String userChoice = scanner.nextLine();

            switch(userChoice){
                case "uscire":
                    choice = false;
                    result = "Uscita dal conto";
                break;
                case "prelievo":
                    System.out.println("quanto vuoi prelevare?");
                    double ammountW = Double.parseDouble(scanner.nextLine());
                    if(account.withdrawal(ammountW)){
                    System.out.println("Prelievo effettuato, saldo attuale: " + account.getBalance(true));
                    }else{
                        System.out.println("Non ci sono abbastanza fondi");
                    };
                    break;
                case "deposito":
                    System.out.println("quanto vuoi depositare?");
                    double ammountD = Double.parseDouble(scanner.nextLine());
                    if(account.deposit(ammountD)){
                        System.out.println("Deposito effettuato, saldo attuale: " + account.getBalance(true));
                    }else{
                        System.out.println("Non hai versato una somma valida");
                    };
                    break;

                default:
                    System.out.println("Scelta non valida");
            }


        }while(choice);
        scanner.close();

    }
}
