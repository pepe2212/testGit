class Test
{  
	/*Class Name:Test
	 Purpose: This Java Class will allow 
     replace a given String with a new String composed by the next letter of each Character
     By:Jose Arana */
    
    public static final Character[] alphabet ={'a','b','c','d','e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    
    /*This is the public method called by the void main, 
     which will call the private methods findNextCharacter and 
     replaceCharacter*/   
    public static String returnNextPlace(String text){
    
    Character tempCharacter;
    StringBuilder finalText= new StringBuilder();
        
        if(text.length() > 0){
        for(int i = 0; i<text.length(); i++){
        Character lastItem= text.charAt(i);
            if(findNextCharacter(lastItem)){
                tempCharacter=replaceCharacter(lastItem);
                finalText.append(tempCharacter);
            }else {
           finalText.append(lastItem);
            }
        }
        }else
        {
        System.out.println("El array esta sin valores!");
        }
        
    return finalText.toString();
    }
    
    private static Character replaceCharacter(Character text){
        Character newCharacter = ' ';

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

        for (Character character : alphabet) {
            if (character == param) {
                return true;
            }
        }
    return false;
    }
    
    
    public static void main(String[] args)
    {
    	/*This is the main void where the input can be tested*/
        String text="123 abcd*3";
        String sample=returnNextPlace(text);  
        System.out.println(sample);
    
    }
}