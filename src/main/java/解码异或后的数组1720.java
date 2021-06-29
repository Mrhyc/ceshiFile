import java.util.Arrays;

/**
 * @author huangyuchen
 * @version 1.0
 * @date 2021/6/21 16:35
 */
public class 解码异或后的数组1720 {
    public static void main(String[] args) {
        int[] encoded = {6,2,7,3};
        System.out.println(Arrays.toString(decode(encoded, 4)));
    }
    public static int[] decode(int[] encoded, int first) {
        int[] a = new int[encoded.length+1];
        a[0] = first;
        for(int i = 1;i <= encoded.length; i++){
            a[i] = a[i-1]^encoded[i-1];
        }
        return a;
    }
}
