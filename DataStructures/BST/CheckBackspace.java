package DataStructures.BST;
import java.util.*;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class CheckBackspace {
      public static String backspace(String s){
         for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='#'){
                s = s.substring(0,i-1)+s.substring(i+1);
                i-=2;
            }
        }
        return s;
  }
}


