import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        FileOutputStream fos =null;
        try{
            fos =new FileOutputStream("/Users/liuxu/Desktop/test.txt");
            String info = "好好学习Java";
            byte[] infos = info.getBytes();
            fos.write(infos,0,infos.length);
            System.out.println("内容被更新");
        } catch (FileNotFoundException e) {
            e.fillInStackTrace();
        } catch (IOException e) {
            e.fillInStackTrace();
        }finally {
            try{
                fos.close();
            } catch (IOException e) {
                e.fillInStackTrace();
            }
        }
    }
}
