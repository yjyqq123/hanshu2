import java.security.PrivilegedAction;

public class Function {
    public static void main(String[] args) {
        String s = "ad js mm qi aaa abs adas asasa mka";


        PrivilegedAction privilegedAction1 = () -> {
            String str = s;
            //把所有单词按照空格分隔成一个数组
            String[] arr = str.split(" ");
            //把单词按照长度排序
            for (int j = 0; j < arr.length - 1; j++) {
                for (int k = 0; k < arr.length - 1; k++) {
                    if (arr[k].length() < arr[k + 1].length()) {
                        String temp = arr[k + 1];
                        arr[k + 1] = arr[k];
                        arr[k] = temp;
                    }
                }
            }
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j]);
                if (j == 4) {
                    break;
                }
            }
            return null;
        };
    }
}
