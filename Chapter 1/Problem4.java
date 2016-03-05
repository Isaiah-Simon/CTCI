import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.StringBuilder;

public class Problem4 {
     
    public static boolean palindromePermutation(String s){
      int[] arr = new int[128]; //Assume a-Z
      
      for(int i = 0; i < s.length(); i++){
         arr[s.charAt(i)]++;
      }
      
      int oddCount = 0;
      for(int i = 0; i < arr.length; i++){
         if(arr[i] % 2 != 0){
            oddCount++;
         }
         
         if(oddCount > 1){
            return false;
         }   
      }
      
      return true;
    } 
        
    public static void main(String[] args) {
    
    System.out.println(palindromePermutation("abab"));
    System.out.println(palindromePermutation("abac"));
    System.out.println(palindromePermutation("livci"));
    System.out.println(palindromePermutation("ivicc"));
    }
}
