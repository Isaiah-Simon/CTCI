import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.StringBuilder;

public class Problem3 {
    
    public static String urlify(String s, int length){
       int spaceCount = 0, i, newLength;
       char[] chars = s.toCharArray();  
       
       for(i = 0; i < length; i++){
         if(chars[i] == ' '){
            spaceCount++;
         }
       }
       
       newLength = length + (spaceCount * 2);
       System.out.println(newLength);
       
       for(i = length - 1; i >= 0; i--){
         if(chars[i] == ' '){ 
            chars[newLength - 1] = '%';
            chars[newLength - 2] = '0';
            chars[newLength - 3] = '2';
            newLength = newLength - 3;
         }else{
            chars[newLength - 1] = chars[i];
            newLength--;
         }
       }
       
       for(i = 0; i <chars.length; i++){
         System.out.println(chars[i]);
       }
       
       String rString = new String(chars);
       System.out.println(rString);
       return srString;
    }  
    
    public static void main(String[] args) {
    
    System.out.println(urlify("Mr John Smith    ", 13));

    }
}
