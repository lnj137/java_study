package com.powernode.wannianli;

/**
 * @author Li
 * @version 1.0
 * @date:2022-06-25 21:12
 */
/*
 *计算1！+2！+3！+4！+5！
 * */
public class Homework04 {
    public static void main(String[] args) {
        long sum = 0;
        long value;
        for (int i = 1; i <= 5; i++) {
            //外层循环让value值为1，记录从1到5，五次阶乘的各个结果。
            value = 1;
            for (int j = 1; j <= i; j++) {
                //每次循环求j的阶乘
                value *= j;
            }
            sum += value;
        }
        System.out.println(sum);
    }
}
