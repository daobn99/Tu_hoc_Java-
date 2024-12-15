public class App {
    public static void main(String[] args) throws Exception {
        Student st1 = new Student(1, "dao");
        Student st2 = new Student(2, "Jack");
        System.out.println(st1); // Student [id=1, name=dao]
        System.out.println(st2); // Student [id=2, name=Jack]
    }
}
