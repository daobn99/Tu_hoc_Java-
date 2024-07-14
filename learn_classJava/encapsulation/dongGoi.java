package encapsulation;

public class dongGoi {
    public static void main(String[] args) {
        Person myObj = new Person();
        // myobj.name = "dao";
        // System.out.println(myobj.name);
        myObj.setName();
        System.out.println(myObj.getName());

        myObj.setName2("John");
        System.out.println(myObj.getName());

    }
    
}


/*bình thường khi tạo class Person có biến String name, sang bên class dongGoi tạo object myObj
là có thể dùng được luôn bằng 2 dòng cmt bên trên.
Nhưng khi là private String name thì name đó không dùng được bên này, phải get nó ra ngoài rồi mới
set nó bằng cái mình muốn
*/