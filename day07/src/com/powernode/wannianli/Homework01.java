package com.powernode.wannianli;

/**
 * @author Li
 * @version 1.0
 * @date:2022-06-25 20:23
 */
/*
* 1、编写java程序，用循环结构打印如下的数值列表：
1 10 100 1000
2 20 200 2000
3 30 300 3000
4 40 400 4000
5 50 500 5000
* */
public class Homework01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 13; j++) {
                if (j==2||j==5||j==9){
                    System.out.print(" ");
                }else if (j==1||j==3||j==6||j==10){
                    System.out.print(i);
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        ////////////////////////////////////////////
        for (int i = 1; i <= 5; i++) {
            int value = 1;
            System.out.print(i+" ");
            for (int j = 1; j < 4; j++) {
                value*=10;
                System.out.print(i*value+" ");
            }
            System.out.println();
        }



    }
}
