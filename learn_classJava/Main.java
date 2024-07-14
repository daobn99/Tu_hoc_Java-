public class Main {
    int modelYear;
    String modelName;
    public Main(int year, String name){
        this.modelYear = year;
        this.modelName = name;
    }
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed){
        System.out.println("Max speed is " + maxSpeed + " km/h");
    }

    // public static void main(String[] args) {
    //     Main myCar = new Main(1999, "toyota");
    //     myCar.fullThrottle();
    //     myCar.speed(600);
        
    // }
}
