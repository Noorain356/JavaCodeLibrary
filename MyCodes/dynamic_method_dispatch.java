package MyCodes;
class phone{
    public void ShowTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("turning on phone  ");
    }
}
class  smartphone  extends phone{
    public void music(){
        System.out.println("playing music... ");
    }
    public void on(){
         System.out.println("turning on smartphone... ");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
        phone obj = new smartphone();//allowed
        //smartphone obj = new phone();//not allowed
        obj.ShowTime();
        obj.on();
        // obj.music(); //not allowed
    }
}
