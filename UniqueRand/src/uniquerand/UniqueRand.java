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
        rand = gen(50, 10);// max, min -- max always has to be greater than min other wise return 0
        for (int i = 0; i < rand.size(); i++) {
            System.out.print(rand.get(i));
            System.out.print(" ");
        }
    }

    /**
     *
     * @param max the max random number that will occur
     * @param min the min random number that will occur
     * @return an ArrayList of unique numbers that are scrambled in a random
     * sequence between max and min
     */
    public static ArrayList<Integer> gen(int max, int min) {
        ArrayList<Integer> uniquRan = new <Integer>ArrayList();
        int random = 0;
        int temp = 0;
        Random rand = new Random();

        for (int i = min; i < max; i++) {
            uniquRan.add(i);
        }

        for (int i = 0; i < max - min; i++) {
            random = rand.nextInt(max - min);

            temp = uniquRan.get(i);
            uniquRan.set(i, uniquRan.get(random));
            uniquRan.set(random, temp);
        }

        return uniquRan;
    }
}
