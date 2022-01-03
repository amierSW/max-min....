
package lec3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Lec3 {


    public static void main(String[] args) {
Scanner a = new Scanner(System.in);
      
      ArrayList amir = new ArrayList(3);  
        
        while(a.hasNextLine()){
            
            amir.add(a.nextLine());
     
            if (amir.size()==3){break;}
        }
        
               System.out.println("أكبر نص هو :"+Collections.max(amir));
            System.out.println("أصغر نص هو :"+Collections.min(amir));
        
Collections.sort(amir,Collections.reverseOrder());
        System.out.println("ترتيب من الاكبر للاصغر : "+amir);
        Collections.reverse(amir);
        System.out.println("ترتيب من الصغر للاكبر : "+amir);
        }
        
////////////////By amir///////////////By amir////////////////By amir////////////////////
        
       
    }
    

