abstract class Animal{
    
    public void animalsound(){
        System.out.println("Zzzr");
    }
}

class Bird extends Animal{
    public void sound(){
        System.out.println("Kaakakaa");
    }
}




public class Abstraction {
    
    public static void main(String[] args) {
        Bird snd=new Bird();
        snd.animalsound();
        snd.sound();
    }
}
