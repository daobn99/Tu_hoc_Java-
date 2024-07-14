package modifiers3;


class A{
    protected int c1 = 2;
}

public class P3 extends A {
        public static void main(String[] args) {

            A obj2 = new A();
            System.out.println(obj2.c1);

    }
}
