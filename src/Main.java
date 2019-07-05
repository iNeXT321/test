public class Main {

    public static void main(String[] args) {
        String str = "11";
        System.out.println(DecimaltoBinaryTo(str));
    }

    public static String DecimaltoBinaryTo(String str) {
        int num = Integer.valueOf(str);
        String strB = "";

        while (num > 0) {
            strB = num % 2 + strB;
            num = num / 2;
        }
        return strB;

    }
}


