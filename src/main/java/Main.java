public class Main {
    public static void main(String[] args) {
        BeelineTariffs tariff1 = new BeelineTariffs();
        tariff1.id = 1;
        tariff1.name = "Близкие люди 1";
        tariff1.downloadGb = 15;
        tariff1.minutes = 400;
        tariff1.sms = 300;
        tariff1.pricemonth = 350;
        System.out.println(tariff1.name);
        System.out.println(tariff1.downloadGb);
        System.out.println(tariff1.minutes);
        System.out.println(tariff1.sms);
        System.out.println(tariff1.pricemonth);

        BeelineTariffs tariff2 = new BeelineTariffs();
        tariff2.id = 2;
        tariff2.name = "Близкие люди 2";
        tariff2.downloadGb = 30;
        tariff2.minutes = 600;
        tariff2.sms = 300;
        tariff2.oldpricemonth = 400;
        tariff2.pricemonth = 320;
        System.out.println(tariff2.name);
        System.out.println(tariff2.downloadGb);
        System.out.println(tariff2.minutes);
        System.out.println(tariff2.sms);
        System.out.println(tariff2.oldpricemonth);
        System.out.println(tariff2.pricemonth);
    }
}
