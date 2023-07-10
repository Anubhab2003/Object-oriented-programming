import java.util.*;
public class Penmanufacturing{
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setcolor("Crimson Red");
        System.out.println(p1.getcolor());
        p1.settip(7);
        System.out.println(p1.gettip());
    }
}
class Pen{
    String color;
    int tip;
    //Getters
    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }
    //setters
    void setcolor(String newcolor){
        color=newcolor;
    }
    void settip(int newtip){
        tip=newtip;
    }
}