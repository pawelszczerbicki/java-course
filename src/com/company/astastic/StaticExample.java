package com.company.astastic;

public class StaticExample {


    public static void main(String[] args) {
        //uciekanie od statica przez stworzenie niestatycznej metody i wywoanie jej
        StaticExample test = new StaticExample() ;
        test.start();
             //to wyzej i to nizej jest rownowazne
        new StaticExample().start();

        new Tree().print(10);



    }

    public int start(){
        return 1;
    }
}
