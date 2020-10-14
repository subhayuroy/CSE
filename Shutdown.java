import java.util.*;

class Shutdown{

  public static void main(String args[]){
  
    Runtime runtime= Runtime.getRuntime();
    int numberOfSeconds = 10;
    Process proc = runtime.exec("shutdown -s -t " + numberOfSeconds);
    System.exit(0);
    
    }
}
