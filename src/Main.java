//Creare una classe Fruit che accenti nel costruttore il parametro name (String)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un LinkedList con elementi e stamparlo in console.
//Aggiungere un elemento al primo posto della lista e uno all'ultimo
//Stampare la collezione aggiornata

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Creo un LinkedList con elementi
        LinkedList<Fruit> fruits = new LinkedList<>();

        //Aggiungo tutti elementi

        fruits.add(new Fruit("Mango"));
        fruits.add(new Fruit("Parchita"));
        fruits.add(new Fruit("Mamon"));
        fruits.add(new Fruit("Lechoza"));


        //Facciamo un ciclo for
        System.out.println("LinkedList:");
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
            System.out.println();

        }
        //Aggiungo elemento al primo posto della lista
        fruits.addFirst(new Fruit("Jobito"));

        // //Aggiungo elemento al primo posto della lista
        fruits.addLast(new Fruit("Guayaba "));

        // facciamo altro ciclo for e mandamo a stampare

        for (Fruit fruit : fruits) {
            System.out.println( "LinkedList"  + fruit);
            System.out.println();
        }


    }


    }
