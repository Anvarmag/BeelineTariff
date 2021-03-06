public class Main {
    public static void main(String[] args) {
        BeelineTariff tariff1 = new BeelineTariff();
        tariff1.id = 1;
        tariff1.name = "Близкие люди 1";
        tariff1.downloadGb = 15;
        tariff1.minutes = 400;
        tariff1.sms = 300;
        tariff1.pricemonth = 350;
        System.out.println(tariff1.eSim);
        System.out.println(tariff1.name);
        System.out.println(tariff1.downloadGb);
        System.out.println(tariff1.minutes);
        System.out.println(tariff1.sms);
        System.out.println(tariff1.pricemonth);
        System.out.println(tariff1.url);

        BeelineTariff tariff2 = new BeelineTariff();
        tariff2.id = 2;
        tariff2.name = "Близкие люди 2";
        tariff2.downloadGb = 30;
        tariff2.minutes = 600;
        tariff2.sms = 300;
        tariff2.oldpricemonth = 400;
        tariff2.pricemonth = 320;
        tariff2.discount = "-20% на год";
        System.out.println(tariff2.eSim);
        System.out.println(tariff2.name);
        System.out.println(tariff2.downloadGb);
        System.out.println(tariff2.minutes);
        System.out.println(tariff2.sms);
        System.out.println(tariff2.oldpricemonth);
        System.out.println(tariff2.discount);
        System.out.println(tariff2.pricemonth);
        System.out.println(tariff2.url);
    }
}
