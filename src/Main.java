public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        ///  tesk 1
        System.out.println("tesk 1");

        int desiredSum = 2_459_000;
        int sum = 0;
        int amount = 15_000;
        double percent = 1d / 100;
        int month = 0;
        while (sum < desiredSum) {
            sum += amount;
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + " ,сумма накопленых равна" + sum + " рублей");
        }
        /// tesk 2
        System.out.println("tesk 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + "");
        }
        System.out.println();
        for (; number > 0; number--) {
            System.out.print(number + "");
        }
        /// tesk 3
        System.out.println("tesk 3");
        int pepulation = 12_000_000;
        int fertilityPerThousand = 17;
        int mortalityPerThousand = 8;
        int currenlYear = 2024;
        for (int year = currenlYear; year < currenlYear + 10; year++) {
            pepulation += pepulation * fertilityPerThousand / 1000 - pepulation * mortalityPerThousand / 1000;
            System.out.println("Год " + year + " ,численость населения составляет" + pepulation);
        }
        /// tesk 4
        System.out.println("tesk 4");
        percent = 7d / 100;
        desiredSum = 12_000_000;
        sum = amount;
        while (sum < desiredSum) {
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + " ,сумма накопленых равна" + sum + " рублей");
        }
        ///  tesk 5
        System.out.println("tesk 5");
        sum = amount;
        month = 0;
        while (sum < desiredSum) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " ,сумма накопленых равна" + sum + " рублей");
            }
            ///  tesk 6
            System.out.println("tesk 6");
            sum = amount;
            month = 0;
            int months = 12 * 9;
            while (month < months) {
                sum = (int) (sum * (1 + percent));
                month++;
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + " ,сумма накопленых равна" + sum + " рублей");
                }
            }
        }
        /// tesk 7
        System.out.println("tesk 7");
        int firstFriday =3;
        for (int day = firstFriday; day <= 31; day +=7){
            System.out.println("Сегодня пятница " + day + "-е число. Необходимо подготовить отчет");
        }
        /// tesk 8
        System.out.println("tesk 8");
        int period = 79;
        int startSeeing = 0;
        int start = currenlYear - 200;
        int end = currenlYear + 100;
        for (int year = startSeeing; year < end; year +=period){
            if (year > start){
                System.out.println(year);
            }
        }
    }
}