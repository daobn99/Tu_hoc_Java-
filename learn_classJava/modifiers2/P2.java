package modifiers2;

import modifiers.P;
public class P2 {
    public static void main(String[] args) {
        P obj1 = new P();
        obj1.a = 10;       //a là public nên truy cập ở đâu cũng đc
        obj1.b = 10;       // b là default chỉ có thể truy cập trong cùng package 
        obj1.c = 10;       // c là protected 
        obj1.d = 10;        // d là private chỉ có thể truy cập trong cùng một class (cùng 1 file)


    }
}
