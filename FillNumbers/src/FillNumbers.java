import java.util.Arrays;

class Test
{ 
	/*Class Name:Test
	 Purpose:This class will allow to return an order array based on a given unordered array as input
	 By:Jose Arana*/
    public static int maxValue=0;
   
    /*This is the void called by the main void which will call the private method findMaxNumber,
     which will return the max number in the array*/
    public static int[] returnNumbers(int[] a){
  
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
          for (int j : a) {
              if (j > maxValue) {
                  maxValue = j;
              }
          }
      }else{
    	  	System.out.println("El array esta sin valores!");
        }  
    return maxValue;
       }
    
    
    public static void main(String[] args)
    {
    	/*This is the input to test the code*/
      int []a={58,60,65};
        
      if(a.length>0){
           System.out.println(Arrays.toString(returnNumbers(a)));
        }else {
           System.out.println("El array esta sin valores!");
        }
    
    }
}