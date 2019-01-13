import java.io.File;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.io.*; 
class Input3{
    public static void main(String ar[]) throws Exception{
     //   File file=new File("/home/naman/java_jobs/input3.txt");
       // Scanner sc = new Scanner(file);
        //   int i = 0;
        Scanner sc = new Scanner(System.in);
       int m = sc.nextInt();
       period(m);
      /*  try{
            while (sc.hasNext()) {
                int line = sc.nextInt();
                al.add(line);
                i++;
            }
            Collections.sort(al);
            int j=(al.size())-1;
            for (int k = 0; k < 10; k++) {
                System.out.println(al.get(k));
            }
    }
    catch(Exception e){

    }*/
        
    }
   public static void period(int m){
        int  c=1;
        int d,e;
        int i = 0;
        d = (c * c + 5 * c + 6) % m;
        c = d;
        do{
         // d= (c*c+5*c+6)%m;
         e=(c*c+5*c+6)%m;
          c=e; 
            i++;
            System.out.print("  "+e);
        } while ((e != 12));
       System.out.println(i);
    }
}