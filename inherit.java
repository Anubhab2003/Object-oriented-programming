public class inherit{
    public static void main(String args[]){
        fish tuna=new fish();
        tuna.eat();
        tuna.breath();
        tuna.sleep();
        dog dobby=new dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);

    }
}
class animal{
    String color;
    void eat(){
        System.out.println("Eating.....");

    }
    void breath(){
        System.out.println("Breathing...");
    }
}
class mammals extends animal{
    int legs;
}
class dog extends mammals{
    String breed;
}
class fish extends animal{
    int fins;
    void sleep(){
        System.out.println("Sleeping......");
    }
    
}