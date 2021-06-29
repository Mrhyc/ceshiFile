/**
 * @author huangyuchen
 * @version 1.0
 * @date 2021/6/21 16:56
 */
public class 最富有客户的资产总量1672 {
    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{}));
    }
    public static  int maximumWealth(int[][] accounts) {
        int max = 0;
        int temp = 0;
        for (int i = 0; i < accounts.length; i++) {
            temp = 0;
            for (int i1 : accounts[i]) {
                temp +=i1;
            }
            max = Math.max(temp,max);
        }
        return max;
    }
}
