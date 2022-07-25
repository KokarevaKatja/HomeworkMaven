public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(1_000, true);

       amount = 1_000_000;
       registered = true;
       expected = 500;
       actual = service.calculate(1_000_000, true);

        amount = 1_000;
        registered = false;
        expected = 10;
        actual = service.calculate(1_000, false);

        amount = 5_000_000;
        registered = false;
        expected = 500;
        actual = service.calculate(5_000_000, false);

        amount = 0;
        registered = true;
        expected = 0;
        actual = service.calculate(0, true);

        amount = 0;
        registered = false;
        expected = 0;
        actual = service.calculate(0, false);

    }
}
