package MyCodes;
class MyMainEmloyee{  
    private int id;
    private String name;
    @SuppressWarnings("unused")
    private int rollno;

    /*public MyEmloyee(){
        id = 45;
        name = "Your-Name-Here";
    }*/
    public MyMainEmloyee(String myName, int myid, int myrollno){
        id = myid ;
        name = myName;
        rollno = myrollno; 
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public String getrollno(){
        return name;
    }
    public void setrollno(int n){
        this.rollno = n;
    }
    public int getid(){
        return id;
    }
    public void setid(int i){
        this.id = i;
    }
    
}

public class Constructor {
    public static void main(String[] args) {

        MyMainEmloyee harry = new MyMainEmloyee("codewitheharry", 67, 678);
        System.out.println(harry.getid());
        System.out.println(harry.getName());
        
    }
}
