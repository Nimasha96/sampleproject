/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newclass2;

/**
 *
 * @author Nimasha
 */
public class Newclass2 extends Thread {
public static void main(String[] args) {
   Newclass2 thread = new Newclass2();
    thread.start();
    System.out.println("extend thread 1 ");
  }
  public void run() {
    System.out.println("extend thread 2");
  }
}

