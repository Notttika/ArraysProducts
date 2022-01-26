package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Chair chair = new Chair("chair", ProductType.furniture, 500, 2);
        Pullover pullover = new Pullover("pullover", ProductType.clothes, 200, 1);
        Meat meat = new Meat("meat", ProductType.food, 65, 0100);
        Coat coat = new Coat("coat", ProductType.clothes, 120, 3);
        Sofa sofa = new Sofa("sofa", ProductType.furniture, 980, 20);
        Sausage sausage = new Sausage("sausage", ProductType.food, 110, 5);
        Skirt skirt = new Skirt("skirt", ProductType.clothes, 250, 1);
        Table table = new Table("table", ProductType.furniture, 400, 12);
        Vegetables vegetables = new Vegetables("vegetables", ProductType.food, 60, 2);


        Product[] products = {chair, pullover, meat, coat, sofa, sausage, skirt, table, vegetables};
        Product[] clothes = new Product[products.length];
        Product[] furniture = new Product[products.length];
        Product[] food = new Product[products.length];


        int price = 0;
        int withAt = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getType().equals(ProductType.clothes)) {
                clothes[i] = products[i];
            }
            if (products[i].getType().equals(ProductType.food)) {
                food[i] = products[i];
            }
            if (products[i].getType().equals(ProductType.furniture)) {
                furniture[i] = products[i];
            }
            if (products[i].getPrice() < 200) {
                price = price + 1;
            }
            if (products[i].getName().matches("(.*)at(.*)")) {
                withAt = withAt + 1;
            }
        }
            System.out.println("all products" + Arrays.toString(products));
            System.out.println("clothes" + Arrays.toString(clothes));
            System.out.println("food" + Arrays.toString(food));
            System.out.println("furniture" + Arrays.toString(furniture));
            System.out.println();
            System.out.println("price is lower 200 -  " + price);
            System.out.println("at in the text - " + withAt);


            //     for (int i = 0; i < 9; i++) {
            //    System.out.println(products[i]);

        /*for (int i = 0; i < prods.length; i++) {
                for (int j = 0; j < prods[i].length; j++) {
                    System.out.print(prods[i][j] + "\t");
              }
               System.out.println();*/
        }
    }











