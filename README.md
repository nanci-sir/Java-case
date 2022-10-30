# Java-case
# 1.买飞机票

 需求: 机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。

 按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7 折，经济舱6.5折。

```java
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
```

1. 遇到判断值匹配的时选择什么结构实现？ 

使用switch分支结构实现。

 2.遇到判断区间范围的时候选择什么结构实现？ 

 使用if分支结构实现



#  2.找素数

 101-200之间的数据可以采用循环依次拿到; 每拿到一个数，判断该数是否是素数。 

判断规则是：从2开始遍历到该数的一半的数据，看是否有数据可以整除它，有则不是素数，没有则是素数。

```java
package Test;

public class tastDemo2 {
    public static void main(String[] args) {
        //找素数
       // 101-200之间的数据可以采用循环依次拿到; 每拿到一个数，判断该数是否是素数
        for (int i = 100; i <=200 ; i++) {
            boolean flag = true;
            //判断是否是素数
            for (int j = 2; j <i/2; j++) {
                if (i%j == 0){
                    flag = false;
                    break;
                }
            }
           if(flag){
               System.out.print(i + "\t");//101    103    107    109    113    127    131    137    139    149    151    157    163    167    173    179    181    191    193    197    199    
           }
        }
    }
}
```

历2开始到该数的一半的数据去判断是否有整除它的

# 3.开发验证码 

需求：  定义方法实现随机产生一个5位的验证码，每位可能是数字、大写字母、小写字母。

 分析： ① 定义一个方法，生成验证码返回：方法参数是位数、方法的返回值类型是String。 ② 在方法内部使用for循环生成指定位数的随机字符，并连接起来。 ③ 把连接好的随机字符作为一组验证码进行返回

```java
package Test;

import java.util.Random;

public class tastDemo3 {
    public static void main(String[] args) {
       String code = createCode(5);
        System.out.println(code);

    }
    public static String createCode(int n){
        //定义一个字符串生随机字符
        String code = "";
        Random r = new Random();
        for (int i = 0; i <n; i++) {
            //生成一个随机字符 随机数
            int type =r.nextInt(3);
            switch (type){
                case 0:
                    //大写字符（A 65 -Z 65+25）（0-25）+65
                    char ch = (char) (r.nextInt(26)+65);
                    code +=ch;//累加
                    break;
                case 1:
                    //小写字符（a 97 -z 97+25）（0-25）+97
                    char ch1 = (char) (r.nextInt(26)+65);
                    code +=ch1;//累加
                    break;
                    case 2:
                        //数字
                        code +=r.nextInt(10);
                    break;
            }
        }
    return code;
    }
}
```

随机验证码的核心实现逻辑是如何进行的？ ① 定义一个String类型的变量存储验证码字符。 ② 定义一个for循环，循环5次。 ③ 随机生成0|1|2的数据，依次代表当前位置要生成数字|大写字母|小写字母。 ④ 把0、1、2交给switch生成对应类型的随机字符，把字符交给String变量。 ⑤ 循环结束后，返回String类型的变量即是所求的验证码结果

# 4.数组元素复制 

需求：  把一个数组中的元素复制到另一个新数组中去。

```java
package Test;

public class tastDemo4 {
    public static void main(String[] args) {

                int[] arr1 = {11, 22, 33, 44};
                // int[] arr2 = arr1; // 没有完成了数组复制。
                int[] arr2 = new int[arr1.length];

                copy(arr1 , arr2);

                printArray(arr1);
                printArray(arr2);
            }

            public static void printArray(int[] arr){
                System.out.print("[");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
                }
                System.out.println("]");
            }


            public static void copy(int[] arr1, int[] arr2){
                // 正式完成元素的复制
                for (int i = 0; i < arr1.length; i++) {
                    arr2[i] = arr1[i];
                }
            }
        }
```

