package exercises.exercisesTwo;

import java.util.Random;

public class BankAccount{

    private int codeBank;
    private String name;
    private double balance;

    BankAccount(String newName){
        codeBank = randomNumber();
        name = newName;
        balance = 110;
    }

    public int getCodeBank() {
        return codeBank;
    }

    public String getName() {

        return name.substring(0,1).toUpperCase() + name.substring(1);
    }

    public double getBalance(){
        return balance;
    }

    public void setName(String newName){
        name = newName.length() > 0 ? newName : name;
    }

    public String getBalance(boolean format){
        return getBalance() + "€";
    }

    public boolean withDrawal(double withDrawal){
        if(withDrawal <= balance){
           balance -= withDrawal;
           return true;
        }else{
            return false;
        }
    }

    public boolean deposit(double deposit){
        if(deposit > 0) {
            balance += deposit;
            return true;
        }else{
            return false;
        }
    }



    @Override
    public String toString(){
        return "{code=" + codeBank + ",name=" + name + ",price=" + balance + "}";
    }

    private int randomNumber(){
        Random random = new Random();
        return random.nextInt(1000)+1;
    }
}

