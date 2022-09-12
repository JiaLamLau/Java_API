public class Student implements Comparable {//学生类型：学好，姓名，性别
    private String name;
    private String sex;
    private int no;

    public Student(int no,String name, String sex) {
        this.name = name;
        this.sex = sex;
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Student(){}
    public Student(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //重写comparable方法
    //按照学号的方法排序
    public int compareTo(Object o) {
        Student student =(Student) o;
        if(this.no==student.no){
            return 0;
        }else if(this.no> student.no){
            return 1;
        }else{
            return -1;
        }

    }
}
