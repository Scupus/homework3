public class Main {
    public static void main(String[] args) {
       byte crocodile = 88;
        short amu = 15246;
        int mosquitos = 5000000;
        long molecules = 150000000000L;
        float quantity = 5.25324f;
        double quantity2 = 3.142;
        System.out.println("Значение переменной crocodile с типом byte равно " + crocodile);
        System.out.println("Значение переменной amu с типом short равно " + amu);
        System.out.println("Значение переменной mosquitos с типом int равно " + mosquitos);
        System.out.println("Значение переменной molecules с типом long равно " + molecules);
        System.out.println("Значение переменной quantity с типом float равно " + quantity);
        System.out.println("Значение переменной quantity2 с типом double равно " + quantity2);
        System.out.println("____________________________________________________________________________________");
        float n1 = 27.12f;
        long n2 = 987678965549L;
        float n3 = 2.786f;
        short n4 = 569;
        short n5 = 159;
        short n6 = 27897;
        byte n7 = 67;
        var w = false;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
        System.out.println(n7);
        System.out.println(w);
        System.out.println("____________________________________________________________________________________");
        byte ludPav = 23;
        byte annSerg =27;
        byte ekAndr = 30;
        short listQnty = 480;
        short onePuppleQnty = (short) (listQnty / (ludPav + annSerg + ekAndr));
        System.out.println("На каждого ученика рассчитано " + onePuppleQnty + " листов бумаги");
        System.out.println("____________________________________________________________________________________");
        byte machSpeed = 8;
        byte time = 20;
        short time2 = (short) (time * 24 * 3);
        short time3 = (short) (time2 * 3);
        int time4 = (time2 * 30);
        short botQnty = (short) (time * machSpeed);
        short botQnty2 = (short) (time2 * machSpeed);
        int botQnty3 = (time3 * machSpeed);
        int botQnty4 = (time4 * machSpeed);
        System.out.println("За " + time + " минут работы машина произвела " + botQnty + " штук бутылок.");
        System.out.println("За " + time2 + " минут работы машина произвела " + botQnty2 + " штук бутылок.");
        System.out.println("За " + time3 + " минут работы машина произвела " + botQnty3 + " штук бутылок.");
        System.out.println("За " + time4 + " минут работы машина произвела " + botQnty4 + " штук бутылок.");
     System.out.println("____________________________________________________________________________________");
     short allQnty = 120;
     byte oneClass = 6;
     short classes = (short) (allQnty / oneClass);
     short white = (short) (classes * 2);
     short brown = (short) (classes * 4);





    }
}