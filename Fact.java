import java.io.*;
import java.util.*;
  public class Fact{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int input=sc.nextInt();
	  int ans=1;
      if(input==0){
          System.out.println("1");
        }
       else{
        for(int i=input;i>=1;i--){
          ans=ans*(i);
          }
		  System.out.println(ans);
        }
        
     }
   }  
