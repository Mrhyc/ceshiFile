import java.util.Arrays;

/**
 * @author huangyuchen
 * @version 1.0
 * @date 2021/6/30 10:29
 */
public class 加一66 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{8,7,6,5,4,3,2})));
    }
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            digits[i]++;
            digits[i]%=10;
            if(digits[i]!=0){
                return digits;
            }
        }
        int[] arr = new int[digits.length+1];
        arr[0]=1;
        return arr;
    }
}
