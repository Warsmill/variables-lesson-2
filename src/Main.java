public class Main {
    public static void main(String[] args) {
        //задание 1
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
    }
}