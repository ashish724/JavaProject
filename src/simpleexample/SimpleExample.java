/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexample;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author admin
 */
public class SimpleExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hey!");
        list.add("how");
        list.add("are");
        list.add("you?");
        ListIterator it = list.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " ");//you print all the elements
        }
        //Now you go back. You can encapsulate this while sentence into a void reset method.
        while (it.hasPrevious()) {
            it.previous();
        }
        //Now you check that you've reached the beginning of the list
        while (it.hasNext()) {
            System.out.println("back " + it.next() + " ");//you print all the elements
        }
         while (it.hasPrevious()) {
            it.previous();
        }
        //Now you check that you've reached the beginning of the list
        while (it.hasNext()) {
            System.out.println("back " + it.next() + " ");//you print all the elements
        }
    }
    
}
