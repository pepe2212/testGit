import java.util.*;
import java.lang.*;

class Test
{  
    public static int maxValue=0;
    public static int[] returnNumbers(int a[]){
       if (a.length<0){
        System.out.println("El array esta sin valores!");
        }
        int maxValue=findMaxNumber(a);
        int[]array = new int[maxValue];
       
        for(int i=0; i<maxValue; i++){
         array[i]=i+1;
         
         }
        
        
     return array;
    }
    
    private static int findMaxNumber(int[]a ){
      if (a.length>0){
        maxValue=a[0];
        for(int i=0; i<a.length; i++) {
            if(a[i]> maxValue ){
            maxValue=a[i];
            }
        } }else{
        System.out.println("El array esta sin valores");
        }  
    return maxValue;
       }
    
    
    public static void main(String args[])
    {
      int []a={58,60,65};
        if(a.length>0){
           System.out.println(Arrays.toString(returnNumbers(a)));
        }else {
        System.out.println("El array esta sin valores!");
        }
    
    }
}