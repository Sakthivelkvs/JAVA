class One extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hai");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class Two extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class Threadexp {

    public static void main(String[] args) {

        One obj1 = new One();
        Two obj2 = new Two();

        obj1.start();  
        try{
            Thread.sleep(10);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        obj2.start();  
    }
}
