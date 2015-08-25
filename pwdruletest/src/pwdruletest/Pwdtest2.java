package pwdruletest;

import java.io.FileInputStream;
import java.io.IOException;
//都是baic中的错误
public class Pwdtest2 {

    public static void main(String[] args) {
        
    }
    //EmptyCatchBlock
    public void doSomething() {
        try {
          FileInputStream fis = new FileInputStream("/tmp/bugger");
        } catch (IOException ioe) {
            // not good
        }
     }
    public class Foo {
        void bar(int x) {
         if (x == 0) {
          // empty!
         }
        }
       }
    //EmptyTryBlock
    public void bar() {
        try {
        } catch (Exception e) {
          e.printStackTrace();
        }
       }
    //UnnecessaryConversionTemporary
    public String convert(int x) {
        // this wastes an object
        String foo = new Integer(x).toString();
        // this is better
        return Integer.toString(x);
      }

}
