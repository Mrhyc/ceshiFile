import java.util.HashMap;
import java.util.Map;

/**
 * @author huangyuchen
 * @version 1.0
 * @date 2021/5/15 8:20
 */
public class 罗马数字转整数 {
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }
    public static int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            sum+=(map.get(s.charAt(i))<map.get(s.charAt(i+1))?(map.get(s.charAt(i))*-1):map.get(s.charAt(i)));
        }
        sum+=map.get(s.charAt(s.length()-1));
        return sum;
    }
}
