package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

abstract class Segma {
    private String mName;
    public Segma(String name){
        mName = name;
        System.out.print(mName);
    }
}

public class Main extends Segma{

    public Main(){
        super(">from super<");
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        List<String> myList = new ArrayList<String>();
        myList.add("alpha");
        System.out.println(myList.get(0));
        Main a = new Main();
    }


    interface OrderCounter {
        // Name maps to list of order numbers
        int totalOrders(Map<String, List<String>> orders);
        // Name maps to total orders made so far
//        int totalOrders(Map<String, Integer> orders);
    }
}
