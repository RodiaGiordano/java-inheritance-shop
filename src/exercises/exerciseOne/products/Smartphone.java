package exercises.exerciseOne.products;

import exercises.exerciseOne.Product;

public class Smartphone extends Product {

    protected String imeiCode;
    public int memory;
    protected String storageUnit;

    public Smartphone(String name, float price,String _imeiCode, int _memory, String _storageUnit,boolean loyaltyCard){
        super(name, price, loyaltyCard);
        imeiCode = checkImeiCode(_imeiCode);
        memory = checkMemory(_memory);
        storageUnit = _storageUnit;

    }

    public Smartphone(String name, float price,String _imeiCode, int _memory,boolean loyaltyCard){
        super(name, price, loyaltyCard);
        imeiCode = checkImeiCode(_imeiCode).toUpperCase();
        memory = _memory;
        storageUnit = "N.D.";
    }

    public Smartphone(String name, float price,String _imeiCode,boolean loyaltyCard){
        super(name, price, loyaltyCard);
        imeiCode = checkImeiCode(_imeiCode);
        storageUnit = "N.D.";
    }


    private String checkImeiCode(String _imeiCode){
        if(_imeiCode.length() != 15){
            return "000000000000000";
        }else{
            return _imeiCode.toUpperCase();
        }
    }

    private int checkMemory(int _memory){
       return _memory >= 0 ? _memory : 0;
    }

    public String getFullParams(){

        String makeDescription = String.format("Nome prodotto: %s, Prezzo: %.2f€, Memoria: %s, IMEI: %s", getName(true), getPrice(true), getStorageUnit(), imeiCode);
        return makeDescription;
    }

    public String getImeiCode(){
        return imeiCode;
    }

    public String getStorageUnit(){
        return String.valueOf(memory).concat(storageUnit);
    }

    @Override
    public String toString(){
        return getFullParams();
    }


}
