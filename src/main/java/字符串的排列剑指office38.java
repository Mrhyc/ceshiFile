import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author huangyuchen
 * @version 1.0
 * @date 2021/6/22 8:34
 */
public class 字符串的排列剑指office38 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(permutation("abc")));
    }
    static List<String> list = new ArrayList<>();
    public static String[] permutation(String s){

        backtrack(s,list);
        return null;
    }

    private static void backtrack(String s, List<String> list) {
        if(s.length() == list.size()){
            list.add(s);
            return;
        }
        String[] split = s.split("");
        for(int i = 0; i < split.length;i++){
            if(list.contains(s)){

            }
        }

    }


}
