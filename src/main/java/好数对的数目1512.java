/**
 * @author huangyuchen
 * @version 1.0
 * @date 2021/6/21 17:01
 */
public class 好数对的数目1512 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }
    public static int numIdenticalPairs(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    num++;
                }
            }
        }
        return num;
    }
}
