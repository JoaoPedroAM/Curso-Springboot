package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv",99.00));
        list.add(new Product("PS5",6000.00));
        list.add(new Product("S21",4599.99));

        list.removeIf(Product::staticProductPredicate);

        for (Product p :list){
            System.out.println(p);
        }



    }



}
