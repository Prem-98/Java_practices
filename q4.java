import java.util.*;

public class Main {
    public static void main(String[] args) {
       // To get the count of vowvels in a String
       
    String n="Prem Kumar";
   // with streams
    long count = n.chars()
    .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
    .count();
     System.out.println("Total no.of vowvels streams "+ count);
     
     // with for loop and char array
    char[] m=n.toCharArray();
    char[] l={'a','e','i','O','u'};
    int c=0;
    for(int i=0;i<m.length;i++){
      for(int j=0;j<l.length;j++){
        if(m[i]==l[j]){
          c++;
        }
      }
    }
    System.out.println("Total no.of vowvels "+ c);
    
    // without converting to char array
    
        int counts = 0;
        
        // Convert to lowercase to handle case-insensitivity easily
        n = n.toLowerCase();
        
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                counts++;
            }
        }
        
        System.out.println("Total vowels: " + counts);
    }
}