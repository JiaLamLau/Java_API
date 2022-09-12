//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Scanner;

public class Counter {
    public int counter(String info, String find) {
        int count = 0;
        String[] chars = new String[info.length()];
        for(int i=0;i<chars.length;i++){
            chars[i] = info.substring(i,i+1);
            if(chars[i].equals(find)){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String info = input.next();
        System.out.println("请输入要查找的字符：");
        String find = input.next();

        Counter c = new Counter();
        int count = c.counter(info,find);
        System.out.println(count);

    }
}