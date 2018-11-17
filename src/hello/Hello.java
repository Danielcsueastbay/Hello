/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Daniel
 */
public class Hello {
    /**
     * @param args the command line arguments
     */
    public static <T> int linearSearch(List<T> list, Predicate<T> check) {
        for(int i = 0; i < list.size(); i++){
            if(check.test(list.get(i)))
                return i;
        }     
        return -1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ///System.out.println("Hello World!");
        List<String> str = new ArrayList();
        List<Integer> num = new ArrayList();
        String sss = "Green";
        String sss2 = "Blue";
        int iii = 2;
        str.add("Travis");
        str.add("Red");
        str.add("Blue");
        num.add(2);
        num.add(6);
        num.add(7);
        Hello h = new Hello();
        int found;
        found = h.linearSearch(str, s -> s.equals(sss));    //not found
        System.out.println("Index " + found);
        found = h.linearSearch(num, i -> i.equals(iii));    //found at position 0
        System.out.println("Index " + found);
        found = h.linearSearch(str, s -> s.equals(sss2));    //found at position 2
        System.out.println("Index " + found);
    }
    
}