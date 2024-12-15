package basic_java;

public class array {
    public static void main(String[] args) {
        String cars[] = { "Volvo", "BMW", "Ford", "Mazda" };
        System.out.println(cars);

        // // int cars_length = cars.length;
        // // System.out.println(cars_length);
        // System.out.println(cars); //dòng này chạy bị lỗi
        // System.out.println(Arrays.toString(cars)); //in ra chuỗi

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
            System.out.println(cars[i].getClass().getSimpleName());
        }
        // for (String i : cars){
        // // System.out.println(i);
        // System.out.println(i.getClass().getSimpleName());
        // }

        int ages[] = { 20, 22, 18, 35, 48, 26, 87, 70 };
        float ave, sum = 0;
        int length = ages.length;
        for (int i = 0; i < length; i++) {
            sum = sum + ages[i];
            // System.out.println(ages[i]);
        }
        System.out.println(sum);
        ave = sum / length;
        System.out.println(ave);
        // for (int age : ages){
        // sum = sum + age;
        // System.out.println(age);
        // System.out.println(sum);
        // }
    }

}
