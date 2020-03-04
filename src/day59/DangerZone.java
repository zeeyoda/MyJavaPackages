package day59;

import java.io.IOException;

public class DangerZone {
    public static void main(String[] args) {
      try {
          playWithFire();
      }catch(Exception e){
          System.out.println("I handled the playWithFire method.");
      }

    }
    public static void playWithFire() throws IOException {
        System.out.println("You might burn yourself.");
        throw new IOException("Now you might get burned.");
    }
}
