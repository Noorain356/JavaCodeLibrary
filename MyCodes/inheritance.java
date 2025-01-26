package MyCodes;
class base{
   public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base class and setting now! ");
        this.x = x;
    }
    public void printme(){
        System.out.println("I am a constructor ");        

    }
}
class derived extends base{
     public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}


public class inheritance {
    public static void main(String[] args) {
      
        // creating object of base class
        base b = new base();
        b.setX(7); 
        System.out.println(b.getX());
       
        // creating object of base class
        derived d = new derived();
        d.setX(90); 
        System.out.println(d.getX());

        // 

       }
}
