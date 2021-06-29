/**
 * @author huangyuchen
 * @version 1.0
 * @date 2021/6/21 16:44
 */
public class 数组异或操作1486 {
    public static void main(String[] args) {
        System.out.println(xorOperation(5,0));
    }
    public static int xorOperation(int n, int start) {

        int[] arr = new int[n];
        int a = start;
        for(int i =1;i<arr.length;i++){
            a ^= start+2*i;
        }
        return a;

    }
}
