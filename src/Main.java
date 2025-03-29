public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        /// tesk 1
        System.out.println("tesk 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "");
        }
        ///  tesk 2
        System.out.println("tesk 2");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i + "");
        }
        ///  tesk 3
        System.out.println("tesk 3");

        for (int i = 0; i < 17; i++) {
            System.out.println(i + "");
        }
        ///  tesk 4
        System.out.println("tesk 4");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i + " ");
        }
        ///  tesk 5
        System.out.println("tesk 5");

        for (int year = 1904; year <= 2096; year+=4) {
            System.out.println(year + " год являеться высокоснным");
        }
        ///  tesk 6
        System.out.println("tesk 6");

        for (int i = 7; i <= 98; i+=7) {
            System.out.println(i + " ");
        }
        /// tesk 7
        System.out.println("tesk 7");

        for (int i = 1; i <= 512; i*=2) {
            System.out.println(i + " ");
        }
        ///  tesk 8
        System.out.println("tesk 8");

        int amaunt =29000;
        int sum =0;
        for (int month = 1; month <= 12; month++) {
            sum += amaunt;
            System.out.println("Месяц " + month + " ,сумма накопелния равна" + sum + " рублей");
        }
        ///  tesk 9
        System.out.println("tesk 9");

        sum = 0;
        double percent = 1d/100;
        for (int month = 1; month <= 12; month++) {
            sum += amaunt;
            sum = (int) (sum * (1 + percent));
            System.out.println("Месяц " + month + " ,сумма накопелния равна" + sum + " рублей");
        }
        /// tesk 10
        System.out.println("tesk 10");

        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.printf("%d x %d = %d%n", 2, multiplier, 2 * multiplier);
        }
    }
}