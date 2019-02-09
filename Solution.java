import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    
     private static ArrayList<String> strings;
    

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
         
         for (int i = 0; i < 5; i++){
            String s = reader.readLine();
            strings.add(i, s); 
              //System.out.println(strings.get(i));
            }
       
            
      int min = strings.get(0).length(); 
       
       for (int k = 0; k < strings.size();k++ ) {
             
        if (strings.get(k).length() < min) 
            {
            min = strings.get(k).length(); 
            System.out.println(strings.get(k));
                    }
        
            }
        
    
        }
       
    }
