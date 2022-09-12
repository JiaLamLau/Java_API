import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class NewsMgr3 {
    public static void main(String[] args) {
        NewsTitle title1 = new NewsTitle(1, "北京热门景点故宫1", "liuxu");
        NewsTitle title2 = new NewsTitle(2, "北京热门景点故宫2", "liuxu");
        NewsTitle title3 = new NewsTitle(3, "北京热门景点故宫3", "liuxu");
        NewsTitle title4 = new NewsTitle(4, "北京热门景点故宫4", "liuxu");
        NewsTitle title5 = new NewsTitle(5, "北京热门景点故宫5", "liuxu");


        Set set = new HashSet();
        set.add(title1);
        set.add(title2);
        set.add(title3);
        set.add(title4);
        set.add(title5);


        System.out.println("新闻的标题总数" + set.size());
        System.out.println("*************************");

        for (Object obj:set){
            NewsTitle title =(NewsTitle) obj;//强制类型转换
            System.out.println(title.getTitle()+"-"+title.getAuthor());
        }
        System.out.println("################################");
        Iterator itor = set.iterator();
        //首先获取迭代器对象
        //判断十分存在下一个元素
        //返回一个访问的下一个元素
        while(itor.hasNext()){
            NewsTitle title=(NewsTitle) itor.next();
            System.out.println(title.getTitle()+"-"+title.getAuthor());

        }
    }
}
