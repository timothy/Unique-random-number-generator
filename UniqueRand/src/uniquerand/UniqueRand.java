/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquerand;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author H_H
 */
public class UniqueRand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> rand = new <Integer>ArrayList();
        rand = gen(10, 20);
        for (int i = 0; i < rand.size(); i++) {
            System.out.print(rand.get(i));
            System.out.print(" ");
        }
    }

    public static ArrayList<Integer> gen(int min, int max) {
        ArrayList<Integer> Arand = new <Integer>ArrayList();
        ArrayList<Integer> Brand = new <Integer>ArrayList();
        ArrayList<Integer> Crand = new <Integer>ArrayList();
        Random rand = new Random();

        for (int i = min; i < max; i++) {
            Arand.add(i);
            Brand.add(rand.nextInt((min)));
        }

        for (int i = 0; i < (max - min); i++) {
            Crand.add(Arand.get(Brand.get(i)));
        }

        return Crand;
    }
}
