import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Problem1 {

   public static boolean allUnique(String s){
      HashSet set = new HashSet();
      
      for (int i = 0; i < s.length(); i++){
         if(set.contains(s.charAt(i))){
            return false;
         }else{
            set.add(s.charAt(i));
         }
      }
      
      return true;
   }

    public static void main(String[] args) {
      System.out.println(allUnique("abcde"));
      System.out.println(allUnique("abbcde"));
    }
}
