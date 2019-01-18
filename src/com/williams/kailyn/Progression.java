package com.williams.kailyn;

public class Progression {
    protected int first;
    protected int current;

    public Progression(int first){
        this.first= first;
        current= first;
    }

    public Progression(){
        first= current=1;
    }

    public int nextValue(){
        return current+=1;
    }
    public void printProgression(){
        System.out.print(first+", ");

        for(int i=first+1; i<=current; i++){
            if(i==current)
                System.out.print(i);
            else
                System.out.print(i+ ", ");
        }

    }

    public void resetProgression(){
        current=first;
    }
}
