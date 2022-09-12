public class MainThread {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        String name =thread.getName();
        System.out.println(name);

         thread.setName("MyName");
        name =thread.getName();
        System.out.println(name);
    }
}
