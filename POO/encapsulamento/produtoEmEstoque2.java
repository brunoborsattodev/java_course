package POO.encapsulamento;

import POO.encapsulamento.Product2;
import java.util.Locale;
import java.util.Scanner;

public class produtoEmEstoque2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price:");
        double price = sc.nextDouble();

        Product2 product = new Product2(name, price);

        product.setName("Computer");
        System.out.println("\nUpdated data: " + product.getName());
        product.setPrice(1200.00);
        System.out.println("\nUpdated price: " + product.getPrice());

        System.out.println("\nProduct data: " + product);

        System.out.println("Enter the number of products to be added in stock = ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("\nUpdated data: " + product);

        System.out.println("Enter the number of products to be removed from stock = ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("\nUpdated data: " + product);

        sc.close();
    }
}
