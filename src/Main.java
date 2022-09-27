import java.util.Scanner;

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
        System.out.println(compare(99, 98));
       // System.out.println(getSum());
        System.out.println("length ist größer als 20 " + checkLength(" a ")+ " contains fancy " + containsFancy("this is suit super fancy"));
        System.out.println(peopleInShop(30));
        System.out.println(peopleInShop(31));
        System.out.println(customerInShop(4,"yellow"));


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
        return Value1 > 100 || Value2 > 100;
    }

    public static int getSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein und drücken Sie ENTER:");
        int Value1 = scanner.nextInt();
        System.out.println("Geben Sie eine Zahl ein und drücken Sie ENTER:");
        int Value2 = scanner.nextInt();

        return sum(Value1, Value2);
    }

    public static boolean checkLength(String input){
        return  input.length() > 20;

    }

    public static boolean containsFancy(String input){

        return   input.contains("fancy");

    }

    public static String peopleInShop(int people){
        if(people > 30){
            return "Too many people";
        } else {
           return "limit not exceeded";
        }
    }

    public static String customerInShop(int customers, String level){
        int limit;
        switch(level){
            case "red":
                limit = 0;
                break;
            case "yellow":
                limit = 30;
                break;
            case "green":
                limit = 60;
                break;
            default:
                limit = 0;
                break;
        }
        if (customers >= limit){
            return "Entry Stop";
        } else return "Come in and find out";
    }

}