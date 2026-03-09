import java.util.*;

public class Main {
    public static void main(String[] args) {
      //arange the words in desnding order and pring
      String l="Java is a programming language to";
      String[] k=l.split("\\s+");
      // if you want assnding order just change s2 to s1 and vise versa
       Arrays.sort(k,(s1,s2)->Integer.compare(s2.length(),s1.length()));
      System.out.println(Arrays.toString(k));
      
    // with out inbuild methods
     String sp[]="Java is a programming language to".split(" ");
    
    for(int i=0;i<sp.length-1;i++)
    {
        for(int j=i+1;j<sp.length;j++)
        {
            if(sp[i].length()>sp[j].length())
            {
                String temp=sp[i];
                sp[i]=sp[j];
                sp[j]=temp;
            }
        }
    }
     System.out.println(String.join(" ",sp));
    }
}