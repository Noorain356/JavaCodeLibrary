package MyCodes;
class MyEmloyee{  
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getid(){
        return id;
    }
    public void setid(int i){
        this.id = i;
    }
}
    public class Access_modifier_privarte {
      public static void main(String[] args) {
        MyEmloyee harry = new MyEmloyee();
        
        harry.setName("noorain");
        System.out.println(harry.getName());
        harry.setid(34);
        System.out.println(harry.getid());
    }
}


