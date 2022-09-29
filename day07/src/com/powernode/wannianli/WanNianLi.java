package com.powernode.wannianli;

import java.util.Scanner;

/**
 * @author Li
 * @version 1.0
 * @date:2022-06-25 19:19
 */

/*
 * 创建一个从1900年1月1日开始，到现在的万年历  1900年1月1日时星期一
 * 1.首先需要获取到从1900到今天的总天数
 *   先获取年份的天数
 *   在获取月份的天数
 *   最后获取的天数加1为下个月1号的天数
 * 2.创建一个日历的表头  日    一   二   三   四   五   六
 * 3.判断某月的第一天是星期几
 *   利用总天数跟7进行取余，
 * 4.根据得到的这个星期值去分不同月份不同情况去打印月份的天数（2月份分闰年的和平年的）
 * */
public class WanNianLi {
    public static void main(String[] args) {
        // 创建一个死循环用来重复用户操作
        while (true) {

            //接收年份和月份的数据
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入合法的年份");
            int year = sc.nextInt();
            System.out.println("请输入合法的月份");
            int month = sc.nextInt();
            int sum = 0;
            // 计算整年的天数
            for (int i = 1900; i < year; i++) {
                if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                    sum += 366;
                } else {
                    sum += 365;
                }
            }
            // 计算整月的天数
            for (int i = 1; i < month; i++) {
                if (i == 2) {
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        sum += 29;
                    } else {
                        sum += 28;
                    }
                } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                    sum += 30;
                } else {
                    sum += 31;
                }
            }
            sum++;// 得到从1900年1月1日到year年month月的第一天的总日期。
            int weekday = sum % 7;
            //System.out.println(weekday);
            System.out.println("日\t一\t二\t三\t四\t五\t六");
            for (int i = 1; i <= weekday; i++) {
                System.out.print("\t");
            }
            // 打印对应月份的天数
            if (month == 2) {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    for (int j = 1; j <= 29; j++) {
                        weekday = sum % 7;// 需要判断每一次的日期对应的星期数
                        if (weekday == 6) {// 如果是星期六的则换行
                            System.out.print(j + "\n");
                        } else {
                            System.out.print(j + "\t");
                        }
                        sum++;// 日期每增加1，sum对应的也会增加1
                    }
                } else {
                    for (int j = 1; j <= 28; j++) {
                        weekday = sum % 7;
                        if (weekday == 6) {
                            System.out.print(j + "\n");
                        } else {
                            System.out.print(j + "\t");
                        }
                        sum++;
                    }
                }

            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                for (int j = 1; j <= 30; j++) {
                    weekday = sum % 7;
                    if (weekday == 6) {
                        System.out.print(j + "\n");
                    } else {
                        System.out.print(j + "\t");
                    }
                    sum++;
                }
            } else {
                for (int j = 1; j <= 31; j++) {
                    weekday = sum % 7;
                    if (weekday == 6) {
                    System.out.print(j + "\n");
                    } else {
                        System.out.print(j + "\t");
                    }
                    sum++;
                }
            }
            // 提示用户继续输入查询日期或者退出程序
            System.out.println();
            System.out.println("1.继续查询");
            System.out.println("2.退出程序");
            int a = sc.nextInt();
            if (a==2){
                break;
            }
        }

    }
}
