public class Main {
    public static void main(String[] args) {
        System.out.println("Hi!");
        System.out.println("test");
        System.out.println("Goodbye");
        System.out.println("hat geklappt 'lol' :D");
        System.out.println("??");
        System.out.println("git test");
        System.out.println("Moin");
        System.out.println(subtract(9, 4));
        System.out.println(sum(9, 4));
        System.out.println(sumString(5, 16));
        System.out.println(compare(99,98));

    }

    public static int subtract(int value1, int value2) {
        return value1 - value2;
    }

    public static int sum(int value1, int value2) {
        return value1 + value2;


    }


    public static String sumString(int value1, int value2) {
        int result = value1 + value2;


        return "Summe: " + result;
    }

    public static boolean compare(int Value1, int Value2) {
        return Value1>100 || Value2>100;
    }
}