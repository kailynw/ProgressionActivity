package com.williams.kailyn;

public class MultProgression extends Progression {

    int mult;
    public MultProgression(int first, int mult){
        super(first);
        current= first;
        this.mult= mult;
    }

    public MultProgression(){
        first= current=1;
        mult=1;
    }

    @Override
    public int nextValue() {
       int currentMultVal= current*mult;
       current++;
       return currentMultVal;
    }

    @Override
    public void printProgression() {

        System.out.print(first+", ");

        for(int i=first; i<current; i++){
            if(i==current-1)
                System.out.print(i*mult);
            else
                System.out.print(i*mult+", ");
        }
    }
}
