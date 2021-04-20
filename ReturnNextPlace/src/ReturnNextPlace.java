import java.util.*;
import java.lang.*;

class Test
{  // “123 abcd*3” 
    
    public static final  Character alphabet[]={'a','b','c','d','e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
       
    public static String returnNextPlace(String text){
        Character tempCharacter;
        String finalText="";
        if(text.length() > 0){
        for(int i = 0; i<text.length(); i++){
        Character lastItem= text.charAt(i);
            if(findNextCharacter(lastItem)==true){
                tempCharacter=replaceCharacter(lastItem);
            finalText+=String.valueOf(tempCharacter);
            }else {
           finalText+=String.valueOf(lastItem);
            }
           
            
            
        }
        }else
        {
        System.out.println("El array esta sin valores!");
        
        }
    return finalText;
    }
    
    private static Character replaceCharacter(Character text){
        Character newCharacter=' '; 
        
        for(int i = 0; i<alphabet.length; i++){
            if(alphabet[i]==text){
                if(i<=25){
                  newCharacter=alphabet[i+1];
                }else if(i==26){
                 newCharacter=alphabet[0];
                }
            }
        
        }
    
    return newCharacter;
    }
    
    private static boolean findNextCharacter(Character param){
  
        for(int i = 0; i<alphabet.length; i++){
            if(alphabet[i]==param){
            return true;
            }
        }
    return false;
    
    }
    
    
    public static void main(String args[])
    {
        String text="123 abcd*3";
        String sample=returnNextPlace(text);  
        System.out.println(sample);
    
    }
}