import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem2 {

    public static boolean isPermutationSort(String s1, String s2){
      if(s1.length() != s2.length()){
         return false;
      }
      
      char[] s1Array = s1.toCharArray();
      char[] s2Array = s2.toCharArray();
      
      Arrays.sort(s1Array);
      Arrays.sort(s2Array);
      
      for(int i = 0; i < s1Array.length; i++){
         if(s1Array[i] != s2Array[i]){
            return false;
         }
      }
      
      return true;
    
    }
    
    public static boolean isPermutationCount(String s1, String s2){
      if(s1.length() != s2.length()){
         return false;
      }
    
      int[] arr = new int[128]; //assume only characters a-Z
    
      for(int i = 0; i < s1.length(); i++){
         arr[s1.charAt(i)]++;
      }
      
      for(int i = 0; i < s2.length(); i++){
         arr[s2.charAt(i)]--;
         if(arr[s2.charAt(i)] < 0){
            return false;
         }
      }
      
      return true;
    
    }
    
    public static void main(String[] args) {
    System.out.println(isPermutationSort("abc","cba"));
    System.out.println(isPermutationSort("abc","bcd"));
    System.out.println(isPermutationSort("abc","abcd"));
    
    System.out.println(isPermutationCount("abc","cba"));
    System.out.println(isPermutationCount("abc","bcd"));
    System.out.println(isPermutationCount("abc","abcd"));
    }
}
