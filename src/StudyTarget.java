import java.util.logging.Level;

public class StudyTarget {
    public enum Level{
        L1,L2,L3
    }
    public void showTarget(Level level){
        switch(level){
            case L1:
                System.out.println("学习阶段：Java开发工程师");
                break;
            case L2:
                System.out.println("学习阶段：大数据开发工程师");
                break;
            case L3:
                System.out.println("学习阶段：大数据架构师");
                break;
        }
    }

    public static void main(String[] args) {
        StudyTarget target =new StudyTarget();
        target.showTarget(Level.L1);
        //System.out.println(target.showTarget(Level.L1));
    }

}
