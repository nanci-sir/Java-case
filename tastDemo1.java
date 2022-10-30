package Test;

import java.util.Scanner;

public class tastDemo1 {
    public static void main(String[] args) {
        //买飞机票
        Scanner sc = new Scanner(System.in);
        System.out.println("机票原价：");
        double price = sc.nextDouble();
        System.out.println("月份是：");
        int month = sc.nextInt();
        System.out.println("仓位类型（头等舱，经济舱）：");
        String type = sc.next();

        double rs = calc (price,month,type);
        System.out.println("您当前价格是："+rs);
    }

    public static double calc(double monkey, int month, String type) {
        if (month >= 5 && month < 10) {
            //旺季
            switch (type) {
                case "经济仓":
                    monkey *= 0.85;
                    break;
                case "头等舱":
                    monkey *= 0.9;
                    break;
                default:
                    System.out.println("您输入的仓位不正确~~");
                    monkey = -1;
            }
        } else if (month == 11 || month == 12 || month >= 1 && month <= 4) {
            //淡季
            switch (type) {
                case "经济仓":
                    monkey *= 0.65;
                    break;
                case "头等舱":
                    monkey *= 0.7;
                    break;
                default:
                    System.out.println("您输入的仓位不正确~~");
                    monkey = -1;
            }
        }else{
                System.out.println("月份有问题");
                monkey = -1;
            }

        return monkey;
    }
}
