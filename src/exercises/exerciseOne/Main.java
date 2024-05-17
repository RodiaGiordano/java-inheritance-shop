package exercises.exerciseOne;

public class Main {
    public static void main (String[]args) {

        Product product = new Product("ciao", 40);

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


    }
}
