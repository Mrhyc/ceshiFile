import java.util.ArrayList;
import java.util.List;

/**
 * @author huangyuchen
 * @version 1.0
 * @date 2021/6/21 14:33
 */
public class 二进制手表 {
    public static void main(String[] args) {
        System.out.println(readBinaryWatch(9));
    }

    public static  List<String> readBinaryWatch(int turnedOn) {
        List<String> list = new ArrayList<>();
        for(int h=0;h<12;h++){
            for(int m=0;m<60;m++){
                if(Integer.bitCount(h)+Integer.bitCount(m)==turnedOn){
                    list.add(h+":"+(m<10?"0"+m:m));
                }
            }
        }
        return list;
    }
}
