public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        boolean  registered = true;
        long amount = 1_000_000;

        long actual =  service.calculate(amount, registered);

        long years1 = service.calculate(amount, registered);
        System.out.println(years1);

        amount = 1_000_000;

        long years2 = service.calculate(amount, registered);
        System.out.println(years2);

        amount = 1_000_000;

        long years3 = service.calculate(amount, registered);
        System.out.println(years3);
    }
}
