public class Test2 {
    public static void main(String[] args) {


        int iNum = 9;
        Integer i = new Integer(iNum);
        double dNum = 9.9;
        Double d = new Double(dNum);

        float fNum = 9.8f;
        Float f = new Float(fNum);

        char cNum = 'v';
        Character c = new Character(cNum);

        boolean bNum = true;
        Boolean b = new Boolean(bNum);
        Integer i2 = new Integer("123");

        System.out.println(i2 + 1);
    }
}