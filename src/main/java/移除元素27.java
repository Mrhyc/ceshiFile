/**
 * @author huangyuchen
 * @version 1.0
 * @date 2021/6/28 17:16
 */
public class 移除元素27 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        System.out.println(removeElement(nums, 3));
    }
    public static int removeElement(int[] nums, int val) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                nums[c++] = nums[i];
            }
        }
        return c;
    }
}
