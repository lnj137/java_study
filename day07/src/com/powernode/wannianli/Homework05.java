package com.powernode.wannianli;

/**
 * @author Li
 * @version 1.0
 * @date:2022-06-25 21:16
 */
/*
* 篮球从 5 米高的地方掉下来，每次弹起的高度是原来的 30%，经过几次弹起，篮
球的高度是 0.1 米，篮球共经过了多少距离。
* */
public class Homework05 {
    public static void main(String[] args) {
        double hight = 5.0;
        double sum = 0;
        int counts=0;
        while (true){
            if (hight * 0.3 ==0.1){
                break;
            }else {
                sum += hight*0.3;
                counts++;
            }
            hight = hight*0.3;
        }
        System.out.println(counts+1);
        System.out.println(sum);
    }
}
