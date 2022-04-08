/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newclass;

/**
 *
 * @author Nimasha
 */
public class Newclass  implements Runnable {


  public static void main(String[] args) {
  Newclass obj = new Newclass();
    Thread thread = new Thread(obj);
    thread.start();
    System.out.println("implement thread 1");
  }
  public void run() {
    System.out.println("implement thread 2");
  }
}

