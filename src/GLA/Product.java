package GLA;

import java.util.Date;
import java.util.Objects;

public class Product {
    String name ;
    float price;
    String Exp_date;

    public Product(String name, float price, String exp_date) {
        this.name = name;
        this.price = price;
        Exp_date = exp_date;
    }

    @Override
    public boolean equals(Object o) {
        Product p = (Product)o;
        return this.price == p.price;
    }

    public static void main(String[] args) {
        Product p1 = new Product("jim jam",10.0f,"2025-12");
        Product p2 = new Product("little hearts",20.0f,"2024-12");
        Product p3 = new Product("Maggie",14.0f,"2025-08");
        Product p4 = new Product("Hide and seek",200.0f,"2024-09");
        Product [] products = {p1,p2,p3,p4};
        System.out.println(finfProduct(products,new Product("vicks",10.0f,"2024-07")));

    }
    public static boolean finfProduct(Product[] products , Product p){
        for (int i=0;i<products.length;i++){
            if(products[i].equals(p)){
                return true;
            }
        }
        return false;
    }
}
