/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threads;

/**
 *
 * @author Nimasha
 */
public class Threads {
  public static void main(String[] args) {
Threads thread = new Threads();
    thread.start();
    System.out.println("This code is outside of the thread");
  }
     public void run() {
    System.out.println("This code is running in a thread");
  }

    private void start() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
   