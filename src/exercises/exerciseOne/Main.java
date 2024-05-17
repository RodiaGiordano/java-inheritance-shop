package exercises.exerciseOne;

public class Main {
    public static void main (String[]args) {

        Product product = new Product("ciao", 40);
        System.out.println("name: " + product.getName(false));
        System.out.println("nome completo: " + product.getName(true));
        System.out.println("Code: " + product.getPrice(false));
        System.out.println("prezzo: " + product.getPrice(true));
    }
}
