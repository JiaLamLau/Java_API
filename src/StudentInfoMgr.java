import java.util.HashMap;
import java.util.Map;

public class StudentInfoMgr {
    public static void main(String[] args) {
        Student stu1 =new Student("张三","男");
        Student stu2 =new Student("李四","男");
        Student stu3 =new Student("王武","男");
        Student stu4 =new Student("张丽","女");

        Map stuMap = new HashMap();
        stuMap.put("Jack",stu1);
        stuMap.put("Tim",stu2);
        stuMap.put("Eric",stu3);
        stuMap.put("Rose",stu4);

        


    }
}
