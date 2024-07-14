public class Class_method {
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed){
        System.out.println("Max speed is " + maxSpeed + " km/h");
    }

    public static void main(String[] args) {
        Class_method myObj = new Class_method();
        myObj.fullThrottle();
        myObj.speed(400);
    }
}
