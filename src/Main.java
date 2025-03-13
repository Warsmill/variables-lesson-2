public class Main {
    public static void main(String[] args) {
        // задание 1
        byte number1 = 127;
        short number2 = 128;
        int number3 = 33_000;
        long number4 = 1_000_000_000_000L;
        float number5 = 1.000001f;
        double number6 = 1.0000000000001;
        //задание 2
        float floatingPoint = 27.12f;
        long largeNumber = 987_678_965_549L;
        double exactNumber = 2.786;
        short number7 = 569;
        short number8 = -159;
        int regularNumber = 27897;
        byte smallNumber = 67;
        //задание 3
        byte ClassLudmila = 23;//учеников в классе Людмилы Павловны
        byte ClassAnna = 27;//учеников в классе Анны Сергеевны
        byte ClassEkaterina = 30;//учеников в классе Екатерины Андреевны
        short sheetsPaper = 480;//листов бумаги заказано
        int studentsInThreeClasses = ClassLudmila + ClassAnna + ClassEkaterina; //всего учеников в клвссе
        int sheetsEach = sheetsPaper/studentsInThreeClasses;//итог
        System.out.println("На каждого ученика расчитано " + sheetsEach + " листов бумаги.");
        //задание 4
        byte bottles = 16; // производит бутылок за 2 минуты
        byte inMinute = (byte) (bottles / 2);//бутылок за 1 минуту
        byte twentyMinutes = 20;
        byte perDay = 1;
        byte threeDays = 3;
        byte  month = 1;
        System.out.println("за " + twentyMinutes + " минут машина произвела " + (inMinute * twentyMinutes) + " штук бутылок");
        System.out.println("за " + perDay + " сутки машина произвела " + (inMinute * 60 * 24) + " штук бутылок");
        System.out.println("за " + threeDays + " суток машина произвела " + (inMinute * 60 * 24 *3) + " штук бутылок");
        System.out.println("за " + month + " месяц машина произвела " + (inMinute * 60 * 24 * 30) + " штук бутылок");
        //задание 5
        byte totalCans = 120;
        byte whitePaintCabinet = 2;//белой краски на 1 кабинет
        byte brownPaintCabinet = 4;//коричневой краски на 1 кабинет
        byte paintsOneOffice = (byte) (whitePaintCabinet + brownPaintCabinet);//всего краски на один кабинет
        byte totalOffices = (byte) (totalCans/paintsOneOffice);//всего кабинетов в школе
        byte allWhitePaint = (byte) (totalOffices * whitePaintCabinet);//всего белой краски
        byte allBrownPaint = (byte) (totalOffices * brownPaintCabinet);//всего коричневой краски
        System.out.println("В школе, где " + totalOffices + " классов, нужно " + allWhitePaint + " банок белой краски и " + allBrownPaint + " банок коричневой краски.");
        //задание 6
        byte bananas = 5;
        byte weightOneBanana = 80;//масса одного банана
        byte milk = 2;
        byte mlMilkGrams = 105;//100 милиграмм в граммах
        byte iceCream = 2;
        byte massOneIceCream = 100;
        byte eggs = 4;
        byte weightOneEgg = 70;
        short massGram = (short) ( bananas * weightOneBanana + milk * mlMilkGrams + iceCream * massOneIceCream + eggs * weightOneEgg);//в граммах
        float massKg = (float)  massGram / 1000 ;//в килограммах
        System.out.println("вес спортзавтрака "+ massGram + " грамм");
        System.out.println("вес спортзавтрака "+ massKg + "  килограмма");
        //задание 7
        byte masse = 7;
        short loseWeight1 = 250;
        short loseWeight2 = 500;
        short kilogramsGrams = 1000;
        short massGrams = (short) ((short)masse * kilogramsGrams);//потерять вес в граммах
        short option1 = (short) ((short)massGrams / loseWeight1);//если терять по 250 грамм в день
        short option2 = (short) ((short)massGrams / loseWeight2);
        System.out.println("что бы потерять " + masse + " кг,теряя по 250 грамм в день, потребуется " + option1 + " дней.");
        System.out.println("что бы потерять " + masse + " кг,теряя по 250 грамм в день, потребуется " + option2 + " дней.");
        //задание 8
        int masha = 67_760;
        int denis = 83_690;
        int kristina = 76_230;
        float raiseSalary = 0.1f;
        float raiseSalaryMasha = masha * raiseSalary;//годовой доход маши на 10%
        float salaryMashaNow = masha + raiseSalaryMasha;//месячная зп маши стала
        float raiseSalaryDenis = denis * raiseSalary;//годовой доход дениса на 10%
        float salaryDenisNow = denis + raiseSalaryDenis;//месячная зп дениса сталаraiseSalaryMasha
        float raiseSalaryKristina = kristina * raiseSalary;
        float salaryKristinaNow = kristina + raiseSalaryKristina;
        System.out.println("Маша теперь получает " + salaryMashaNow + " рублей. Годовой доход вырос на " + raiseSalaryMasha * 12 + " рублей.");
        System.out.println("Денис теперь получает " + salaryDenisNow + " рублей. Годовой доход вырос на " + raiseSalaryDenis * 12 + " рублей.");
        System.out.println("Кристина теперь получает " + salaryKristinaNow + " рублей. Годовой доход вырос на " + raiseSalaryKristina * 12 + " рублей.");
    }
}