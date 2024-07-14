public class Second {
    public static void main(String[] args) {
        Main myCar = new Main(1999, "Toyota");
        System.out.println(myCar.modelName + " " + myCar.modelYear);   //Java Constructors

        myCar.fullThrottle();           //class methods
        myCar.speed(200);
    }
}
