package MyCodes;
class ekclass{
    int a;
    public int getA() {
        return a;
    }
    ekclass(int a) {
        this.a = a;
    }
    public int returnone(){
        return 1;
    }
}
class doclass extends ekclass{
   doclass(int c){
    super(c);
    System.out.println("i am a constructor ");
   }
}

public class super_this_keywords {
    public static void main(String[] args) {
        ekclass e = new ekclass(45);
        System.out.println(e.getA());
        doclass d = new doclass(4);
        System.out.println(d.getA());
        
        }
    }

