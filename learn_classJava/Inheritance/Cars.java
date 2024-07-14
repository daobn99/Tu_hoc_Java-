package Inheritance;

import modifiers.Xe;

public class Cars extends Xe {
    private String modelName = "Mustang";
    public static void main(String[] args) {
        Cars myCar = new Cars();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}

/*
 Mustag là một tên của một loại xe hãng Ford
 */