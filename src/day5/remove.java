package day5;
import java.util.*;
public class remove  {    
 public static void main(String[] args) {  
              String str ;  
              Scanner sc=new Scanner(System.in);
              str=sc.nextLine();
              System.out.println(charRemoveAt(str, 7));  
           }  
           public static String charRemoveAt(String str, int p) {  
              return str.substring(0, p) + str.substring(p + 1);  
           }  
}  