package constructor;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student(); //đây là đối tượng của hàm tạo mặc định. Khi trong lớp không có hàm tạo nào thì không cần tạo hàm tạo (vì có mặc định sẵn rồi)
        st1.describe();

        Student st2 = new Student("Dao", -20, "Bac Ninh");
        st2.describe();

        Student st3 = new Student();
        st3.name = "hehe";  
        st3.age = 25;
        st3.describe();
        /*
         cách làm này cũng đc nhưng không đảm bảo tính nhất quán vì dễ 
         xảy ra việc quên thiết lập mấy cái tên tuổi địa chỉ.
         Thứ 2 là mình có thể cài đặt thẳng age = số âm. Khi dùng constructor
         có thể cài đặt khi age < 0 thì chương trình báo lỗi   
         */
    }
}
