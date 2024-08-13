package OOPS;

 public class Classs_Object {
    String color;
    int tip;
    void setColor(String newcolor){
        color=newcolor;
    }
    void setTip(int newtip){
        tip=newtip;
    }
    public static void main(String[] args) {
        Classs_Object obj= new Classs_Object();
        obj.setColor("yellow");
        System.out.println(obj.color);
    }
}

