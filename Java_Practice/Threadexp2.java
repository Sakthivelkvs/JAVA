class Three implements Runnable{
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

class Four implements Runnable{
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


public class Threadexp2 {

    public static void main(String[] args){

        Runnable ob1=new Three();
        Runnable ob2=new Four();

        Thread t1=new Thread();
        Thread t2=new Thread();


        t1.start();
        t2.start();
    }
    
}
