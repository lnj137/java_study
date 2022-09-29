package com.powernode.wannianli;

/**
 * @author Li
 * @version 1.0
 * @date:2022-06-25 21:03
 */
/*
* 编写程序，计算 5 的阶乘。
* */
public class Homework03 {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 5; i >= 1; i--) {
            k *= i;
            }
        System.out.println(k);
        }
}
