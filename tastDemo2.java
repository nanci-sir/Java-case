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
               System.out.print(i + "\t");//101	103	107	109	113	127	131	137	139	149	151	157	163	167	173	179	181	191	193	197	199
           }
        }
    }
}
