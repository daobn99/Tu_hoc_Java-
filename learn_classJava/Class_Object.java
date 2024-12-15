
class Class_Object {

    int x = 1;

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.age = 16;
        st1.fisrtName = "Dao";
        st1.lastName = "Nguyen";
        st1.gender = "Male";

        System.out.println(st1.fisrtName + " " + st1.lastName);

        Class_Object myobj = new Class_Object();
        myobj.x = 20;
        System.out.println(myobj.x);

    }

}