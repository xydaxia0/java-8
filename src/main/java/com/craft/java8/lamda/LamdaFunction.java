package com.craft.java8.lamda;

/**
 * Created by Xavier on 2016/6/2.
 */
public class LamdaFunction {


    public static void main() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t");
            }
        }).start();
    }



}
