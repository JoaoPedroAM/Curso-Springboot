package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv",1000.00));
        list.add(new Product("PS5",6000.00));
        list.add(new Product("S21",4599.99));

        Comparator<Product> comp = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        list.sort(comp);
        for (Product p : list){
            System.out.println(p);
        }


    }



}
