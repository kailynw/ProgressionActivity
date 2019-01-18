package com.williams.kailyn;

import java.util.ArrayList;

public class FibonacciProgression extends Progression {

    private int prevTemp1;
    private int prevTemp2;
    private ArrayList<Integer> fibList= new ArrayList<>();
    public FibonacciProgression(){
        prevTemp1=prevTemp2=0;
        first=current=1;

    }

    @Override
    public int nextValue() {
        if(first==current) {
            prevTemp1=1;
            prevTemp2=1;
            current++;
            fibList.add(first);
            return 1;
        }
        else{
            current=prevTemp1+prevTemp2;
            prevTemp2= prevTemp1;
            prevTemp1=current;

            fibList.add(current);
            return current;
        }

    }

    @Override
    public void printProgression() {
        System.out.print(1+", ");
        for(int i=0; i<fibList.size();i++){
            if(i==fibList.size()-1)
                System.out.print(fibList.get(i));
            else
                System.out.print(fibList.get(i)+", ");
        }
    }
}
