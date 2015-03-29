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
        rand = gen(10, 5);
        for (int i = 0; i < rand.size(); i++) {
            System.out.print(rand.get(i));
            System.out.print(" ");
        }
    }

    public static ArrayList<Integer> gen(int size, int max) {
        ArrayList<Integer> uniquRan = new <Integer>ArrayList();
        int random = 0;
        int temp = 0;
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            uniquRan.add(i);
        }

        for (int i = 0; i < size; i++) {
            random = rand.nextInt(size);
            
            temp = uniquRan.get(i);
            uniquRan.set(i, uniquRan.get(random));
            uniquRan.set(random, temp);
        }

        return uniquRan;
    }
}
