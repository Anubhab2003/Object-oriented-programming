public class inherit{
    public static void main(String args[]){
        fish tuna=new fish();
        tuna.eat();
        tuna.breath();
        tuna.sleep();

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
class fish extends animal{
    int fins;
    void sleep(){
        System.out.println("Sleeping......");
    }
    
}