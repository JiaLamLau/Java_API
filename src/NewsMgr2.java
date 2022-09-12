import java.util.ArrayList;
import java.util.LinkedList;

public class NewsMgr2 {
    public static void main(String[] args) {
        NewsTitle title1 =new NewsTitle(1,"北京热门景点故宫","liuxu");
        NewsTitle title2 =new NewsTitle(2,"北京热门景点故宫","liuxu");
        NewsTitle title3 =new NewsTitle(3,"北京热门景点故宫","liuxu");
        NewsTitle title4 =new NewsTitle(4,"北京热门景点故宫","liuxu");
        NewsTitle title5 =new NewsTitle(5,"北京热门景点故宫","liuxu");


        LinkedList list =new LinkedList();
        list.add(title1);
        list.add(title2);
        list.add(title3);
        list.add(title4);
        list.add(title5);
        System.out.println("新闻的标题总数"+list.size());
        for (int i=0;i<list.size();i++){
            NewsTitle title= (NewsTitle)list.get(i);
            System.out.println("biaotu"+title.getTitle());//返回的是Object对象
        }

        for (Object obj:list){
            NewsTitle title= (NewsTitle)obj;
            System.out.println("biaotu"+title.getTitle());
        }
    }
}
