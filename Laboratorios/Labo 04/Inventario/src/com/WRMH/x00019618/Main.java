package com.WRMH.x00019618;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Item> inventory = new ArrayList<>();

        inventory.add(new Weapon());
        inventory.add(new Potion());
        inventory.add(new Elixir());

        inventory.forEach(s -> System.out.println(s.getClass().getName()));

        System.out.println();

        inventory.forEach(s -> {
            if(s instanceof Weapon)
                System.out.println("Weapon");
            else if (s instanceof Potion)
                System.out.println("Potion");
            else if(s instanceof Elixir)
                System.out.println("Elixir");
        });
    }
}
