import java.util.*;
public class Penmanufacturing{
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setcolor("Crimson Red");
        System.out.println(p1.color);
        p1.settip(7);
        System.out.println(p1.tip);
    }
}
class Pen{
    String color;
    int tip;
    void setcolor(String newcolor){
        color=newcolor;
    }
    void settip(int newtip){
        tip=newtip;
    }
}