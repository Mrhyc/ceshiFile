/**
 * @author huangyuchen
 * @version 1.0
 * @date 2021/6/29 8:55
 */
public class Excel表列名称168 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(52));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuffer sb = new StringBuffer();
        while (columnNumber!=0){
            columnNumber--;
            sb.append((char)(columnNumber%26+'A'));
            columnNumber=columnNumber/26;
        }
        return sb.reverse().toString();
    }
}
