package exercises.exercisesTwo;

import exercises.RandomNumb;

public class BankAccount{

    private int codeBank;
    private String name;
    private double balance;

    BankAccount(String newName){
        codeBank = RandomNumb.randomNumber();
        name = newName;
        balance = 0;
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
        String balance = Double.toString(getBalance());
        int dotIndex = balance.indexOf(".");

        if(balance.substring(dotIndex).length() > 2) {
            return getBalance() + "€";
        }else{
            return getBalance() + "0€";
        }
    }

    public boolean withdrawal(double withdrawal){
        if(withdrawal <= balance){
           balance -= withdrawal;
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

}

