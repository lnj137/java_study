package com.powernode.wannianli;

/**
 * @author Li
 * @version 1.0
 * @date:2022-06-25 20:45
 */
/*
* 打印 2 到 10000 的所有素数
* 每行显示 8 个素数。
* */
public class Homework02 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();//从1995年到现在的时间
        System.out.println(start);
        int counts = 0;
        for (int i = 2; i < 1000; i++) {
            boolean flag = true;
            for (int j = 2; j < (int)Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                if (counts % 8 == 0) {
                    System.out.println();
                }
                counts++;
                System.out.print(i + " ");

            }
        }
        long end = System.currentTimeMillis();
    }
}
