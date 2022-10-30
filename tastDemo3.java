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
