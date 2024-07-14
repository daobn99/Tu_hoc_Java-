package encapsulation;
public class Person {
    private String name;
    
    public String getName(){
        return this.name;           //lấy thằng name ở private bên trên và return nó ra ngoài 
    }                           
    public void setName(){
        this.name = "dao";      //name vừa được trả ra ngoài sẽ setting nó bằng thứ mình muốn
    }
    public void setName2(String name){
        this.name = name;    
    }

}


//this nó ám chỉ đang truy cập class hiện tại (Person), và dùng thuộc tính name của class này 