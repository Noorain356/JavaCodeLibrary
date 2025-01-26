package MyCodes;
class A{
   public int a;
    public int harry(){
    return 4;
}
    public void meth2(){
        System.out.println("I am in method 2 of class A! ");
    }
   }
   class B extends A{
   @Override
   public void meth2(){
    System.out.println("I am in method 2 of class B! ");
}

public void meth3(){
    System.out.println("I am in method 3 of class B! ");
}
}
public class Overriding {
    public static void main(String[] args) {
        B b = new B();
        b.meth2();
        A a = new A();
        a.meth2();
        
    }
}
