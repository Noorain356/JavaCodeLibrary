package MyCodes;
  interface Bicycle{
    int a = 45;
    void applyBreak(int decreament);
    void speedUp(int increament);
}  
interface hornbicycle{
    int x = 45;
    void blowhornk3g();
    void blowhornhorn();
}   
class AvonCycle implements Bicycle, hornbicycle{
    
    public void blowhorn(){
        System.out.println("pee pee po poo ");
    }
    public void applyBreak(int decreament){
      System.out.println("appling brake");
    }
    public void speedUp(int increament){
        System.out.println("applying speed up ");
    }
    
    public void blowhornk3g(){
            System.out.println("kabhi khushi kabhi gum pee pee ");
    }
    public void blowhornhorn(){
      System.out.println("mai hoon na pee pe poo po ");
    }
}

public class Interface{
    public static void main(String[] args) {
        AvonCycle Cycleharry = new AvonCycle();
        //System.out.println(Cycleharry.a);
        //System.out.println(Cycleharry.x);
        Cycleharry.blowhornk3g();
        Cycleharry.blowhornhorn();
    }

} 

