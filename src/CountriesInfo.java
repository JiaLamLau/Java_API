
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountriesInfo {
    public static void main(String[] args) {
        Map coun =new HashMap();
        coun.put("China","中国");
        coun.put("Japan","日本");
        coun.put("USA","美国");
        coun.put("Canand","加拿大");
        coun.put("Franch","法国");
        System.out.println(coun.size());//返回键值对的对数
        String country =(String)coun.get("China");
        System.out.println(country);
        //System.out.println(coun.get("China"));//返回的是Object对象
        System.out.println(coun.containsKey("China"));

        //删除某个国家对应的名称
        coun.remove("China");
        System.out.println(coun.containsKey("China"));
        System.out.println(coun.size());
        System.out.println(coun);


        System.out.println("################");
        //遍历Map
        Set keys =coun.keySet();
        for(Object obj:keys){
            String key =(String)obj;
            String value =(String)coun.get(key);//根据key区获取对应的values
            System.out.println(key+"--"+value);
        }
        System.out.println("************************");
        //Iterator迭代器遍历key
        Iterator itor =keys.iterator();
        while(itor.hasNext()){
            String key =(String)itor.next();
            String value =(String)coun.get(key);
            System.out.println(key+"--"+value);
        }
        System.out.println("&&&&&&&&&&&&&&&");
        //遍历键值对
        Set set =coun.entrySet();//键值对是Map.Entry
        for (Object obj:set){
            Map.Entry me =(Map.Entry)obj;
            String key =(String)me.getKey();
            String value =(String)me.getValue();
            System.out.println(key+"--"+value);
        }
    }
}
