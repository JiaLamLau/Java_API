public class WeekDo {

    public void doWhat(int day){
        if(day>7||day<1){
            System.out.println("参数错误，必须要在1-7之间");
            return;
        }
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日，请努力工作，加油");
                break;
            case 6:
                System.out.println("工作一周，幸苦了，放松一下");
                break;
            case 7:
                System.out.println("一周的最后一天，看电影吧");
                break;
        }
    }
}
