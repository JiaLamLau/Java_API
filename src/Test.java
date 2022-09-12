import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        int iNum = i;//拆箱
        System.out.println(iNum);

        int j = 90;//装箱
        Integer j1 = j;
        System.out.println(j1);


        List list = new ArrayList();
        list.add(100);//jdk会自动装箱
        //System.out.println(list.get());
    }
}
