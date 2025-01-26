package MyCodes;
public class metho_doverloading {
    static void foo(){
        System.out.println("good morning bro");
    }
    static void foo(int a){
        System.out.println("good morning " +a+ " bro");
    }
      // () mai parameters hai
    static void foo(int a, int b){
        System.out.println("good morning " +a+ " bro");
        System.out.println("good morning " +a+ " bro");
        
    }


      public static void main (String[] args){
        // argument are actual
        foo();
        foo(900);
        foo(33, 899);
}

}