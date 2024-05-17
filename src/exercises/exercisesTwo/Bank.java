package exercises.exercisesTwo;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci il tuo nome");
        String name = scanner.nextLine();

        BankAccount account = new BankAccount(name);

        System.out.println(account.getCodeBank());
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
                    if(account.withDrawal(ammountW)){
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
