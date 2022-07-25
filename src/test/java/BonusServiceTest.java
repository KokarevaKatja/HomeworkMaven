import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {

    @Test
    public void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        //вызываем целевой метод:
        long actual = service.calculate(1_000, true);

        //производим проверку (сравниваем ожидаемый и фактический результаты):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        //вызываем целевой метод:
        long actual = service.calculate(1_000_000, true);

        //производим проверку (сравниваем ожидаемый и фактический результаты):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные:
        long amount = 1_000;
        boolean registered = false;
        long expected = 10;

        //вызываем целевой метод:
        long actual = service.calculate(1_000, false);

        //производим проверку (сравниваем ожидаемый и фактический результаты):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForUnregisteredOverLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные:
        long amount = 5_000_000;
        boolean registered = false;
        long expected = 500;

        //вызываем целевой метод:
        long actual = service.calculate(5_000_000, false);

        //производим проверку (сравниваем ожидаемый и фактический результаты):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForRegisteredAndZeroAmount() {
        BonusService service = new BonusService();

        //подготавливаем данные:
        long amount = 0;
        boolean registered = true;
        long expected = 0;

        //вызываем целевой метод:
        long actual = service.calculate(0, true);

        //производим проверку (сравниваем ожидаемый и фактический результаты):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForUnregisteredAndZeroAmount() {
        BonusService service = new BonusService();

        //подготавливаем данные:
        long amount = 0;
        boolean registered = false;
        long expected = 0;

        //вызываем целевой метод:
        long actual = service.calculate(0, false);

        //производим проверку (сравниваем ожидаемый и фактический результаты):
        Assertions.assertEquals(expected, actual);
    }

}
