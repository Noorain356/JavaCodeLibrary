package MyCodes;
class A{
    public void show1(){
       System.out.println("In A show");
    }
 }
    class B extends A{
        public void show2(){
            System.out.println("In B show");
        }
    }
    
    public class UpandDown_casting {
        public static void main(String[] args) {
            // typecasting
            /*double d = 4.5;
            int i = (int)d;
            System.out.println(i);*/
            
             // Upcasting
            A obj = (A)new B();
            obj.show1();
            // downcasting
            B obj1 = (B) new B();
             obj1.show2();
    }
}
