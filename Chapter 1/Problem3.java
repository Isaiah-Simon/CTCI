import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.StringBuilder;

public class Problem3 {
    
    public static String urlify(String s, int n){
       int spaceCount = 0, i;
       char[] chars = s.toCharArray();  
       
       for(i = 0; i<s.length(); i++){
         if(chars[i] == ' '){
            spaceCount++;
         }
       }
       
       System.out.println(spaceCount);
       
       return s;
    }  
    
    public static void main(String[] args) {
    
    System.out.println(urlify("This is a string", 16));

    }
}
