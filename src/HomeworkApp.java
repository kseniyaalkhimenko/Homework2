public class HomeworkApp {

    public static void main(String[] args) {

        sumCheck();
        numberCheck();
        numberCheck2();
        test();
        year();

    }

    public static void sumCheck() {

        int a = 1;
        int b = 5;
        int sum = a + b;

        boolean sumCheck = sum >= 10 && sum <= 20;
        System.out.println(sumCheck);

    }

    public static void numberCheck() {

        int a = -5;

        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

    }

    public static void numberCheck2() {

        int a = -6;

        boolean numberCheck2 = a < 0;
        System.out.println(numberCheck2);

    }

    public static void test() {

        int a = 3;
        String txt = "Hello";
        if (a <= 0) {
            System.out.println("Enter positive number");
        } else {
            for (int i = 0; i < a; i++) {

                System.out.println(txt);

            }

        }
    }

    public static void year() {

        int a = 2022;
        if (a<=0) {
            System.out.println("Enter a positive number");
        }
        else {
        boolean year = ((a % 4) == 0 ^ (a % 400) == 0) ^ (a % 100) == 0;
        System.out.println(year);
        }


    }



}