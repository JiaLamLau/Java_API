import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUseDemo {
    public static void main(String[] args) {
        List<Student> list =new ArrayList<Student>();
        Student stu1=new Student(1,"张三","男");
        Student stu2=new Student(2,"李四","男");
        Student stu3=new Student(3,"王武","男");
        Student stu4=new Student(4,"赵六","男");
        Student stu5=new Student(5,"张玮玮","女");
        list.add(stu3);
        list.add(stu4);
        list.add(stu2);
        list.add(stu1);
        System.out.println("************");
        for (Student stu:list){
            System.out.println(stu.getName()+"-"+stu.getSex()+"-"+stu.getNo());
        }
        System.out.println("$$$$$$$$$$$$$$$$$$");
        Collections.sort(list);
        for (Student stu:list){
            System.out.println(stu.getName()+"-"+stu.getSex()+"-"+stu.getNo());
        }
    }
}
