import java.util.Scanner;
class CPU{
    int Price;
    CPU(int Price){
        this.Price=Price;
    }
    class Processor{
        int Cores;
        String Manufacturer;
        Processor(int Cores,String Manufacturer){
            this.Cores=Cores;
            this.Manufacturer=Manufacturer;
        }
        void display(){
            System.out.println("_________Processor Informations___________");
            
            System.out.println("Number of cores:"+Cores);
            System.out.println("Manufacturer:"+Manufacturer);
            
        }
    }
    static class RAM{
        static int Memory;
        static String Manufacturer;
        static void get(int Mem,String Man){ 
            Memory=Mem;
            Manufacturer=Man;
        }
        static void display(){
            System.out.println("__________RAM Informations_________");
            
            System.out.println("Memory:"+Memory+"GB");
            System.out.println("Manufacturer:"+Manufacturer);
           
        }
    }
    void display(){
        System.out.println("________Price Information________");
        System.out.println("Price:"+"Rs"+Price);
    }
    
}
class Main11{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Price of cpu:");
        int p=sc.nextInt();
       
        System.out.println("Enter Number of Cores:");
        int c=sc.nextInt();
        System.out.println("Enter name of Manufacturer:");
        String pm=sc.next();
      
        System.out.println("Enter Memory size:");
        int s=sc.nextInt();
        System.out.println("Enter name of Manufacturer:");
        String rm=sc.next();
        CPU obj1=new CPU(p);
        CPU.Processor obj2=obj1.new Processor(c, pm);
        obj2.display();
        CPU.RAM.get(s, rm);
        CPU.RAM.display();
        obj1.display();
    }
}