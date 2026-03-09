import java.util.*;

public class q3 {
    public static void main(String[] args) {
      
      //  expected output string without numbers and special chars
     String k="Iam56att@#$ending677@@interview" ,l="",p="";
     p=k.replaceAll("[^a-zA-Z+]","");  // here it replaces are the chars which are not b/w a-zA-Z. ^ at the start of the brancket mean not
     System.out.println("Numbers and special chars are remvoed:"+k);
     l=k.replaceAll("[0-9a-zA-Z]","");
     System.out.println("Only Special Chars:"+l);
     
     
    }
}