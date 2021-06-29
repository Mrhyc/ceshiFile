import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author huangyuchen
 * @version 1.0
 * @date 2021/4/23 13:52
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *示例 1：
 *
 * 输入: s = "abcdefg", k = 2
 * 输出:"cdefgab"
 * 示例 2：
 *
 * 输入: s = "lrloseumgh", k = 6
 * 输出:"umghlrlose"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class lecode1 {
    public static void main(String[] args) {
//        System.out.println(reverseLeftWords("lrloseumgh", 6));
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i=0;i<100;i++){
            executorService.execute(new runlog());
        }
        for(int i=0;i<10;i++){
            executorService.execute(new runlog());
        }
        executorService.shutdown();

    }


    public static String reverseLeftWords(String s, int n) {
        return s.substring(n)+s.substring(0,n);
    }

    public void deleteNode(ListNode node) {
        
    }
}


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
class runlog implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
