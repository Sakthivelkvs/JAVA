public class Main {
  public static void main(String[] args) {


    for(int i = 0; i < 5; i++) {          
      for(int j = 0; j < i + 1; j++) {  
          System.out.print("@  ");     
      }
      System.out.println();            
  }

  // 1st Iteration--> i=0 ; 0<5; Satisfied; Increment i now i=1 (i=0; 0<5; i=1): 
  // goto inner loop --> j=0; 0<0+1-->0<1 Satisfied; Increment j now j=1 (j=0; 0<1; j=1) Print 1 '@'
  // 2nd Iteration--> i=1 ; 1<5; Satisfied; Increment i now i=2 (i=1; 1<5; i=2): 
  // goto inner loop --> j=1; 1<1+1-->1<2 Satisfied; Increment j now j=2 (j=1; 1<2; j=2) Print 2 '@@'
  // 5th Iteration--> i=4 ; 4<5; Satisfied; Increment i now i=5 (i=4; 4<5; i=5): 
  // goto inner loop --> j=4; 4<4+1-->4<5 Satisfied; Increment j now j=5 (j=4; 4<5; j=5) Print 5 '@@@@@'  
  
  
  for(int i=0; i<5; i++){
      
    for(int j=i+1; j<=5; j++){
      System.out.print("@  ");
    }
  System.out.println();
  }

  // 1st Iteration--> i=0 ; 0<5; Satisfied; Increment i now i=1 (i=0; 0<5; i=1): 
  // goto inner loop --> j=0+1-->j=1; 1<=5 Satisfied; Increment j now j++ (j=1; 1<=5; 1++) 
  // it will print 5 '@' because the condition is until j becomes 5 1<=5 so, @@@@@

  // 2nd Iteration--> i=1 ; 1<5; Satisfied; Increment i now i=2 (i=1; 1<5; i=2): 
  // goto inner loop --> j=1+1-->j=2; 2<=5 Satisfied; Increment j now j++ (j=2; 2<=5; 2++) 
  // it will print 2 '@' because the condition is until j becomes 5 2<=5 so, @@@@



}




  }
