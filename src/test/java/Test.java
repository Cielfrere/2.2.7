import org.example.TipService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    private final TipService tipService = new TipService();

    @ParameterizedTest(name = "{index} => сумма={0}, expected={1}")
    @CsvSource({
            "900, 990.0",
            "1000, 1050.00",
            "1500, 1575.00",
            "999.99, 1099.989",
            "1000.01, 1050.0105"
    })
    void testRoundTips(String amountStr, String expectedStr) {
        BigDecimal amount = new BigDecimal(amountStr);
        BigDecimal expected = new BigDecimal(expectedStr);

        BigDecimal expectedCalculated = amount.multiply(new BigDecimal("1.10"));

        BigDecimal result = tipService.roundTips(amount);

        assertEquals(expected, result, "Ожидаемый результат: " + expectedCalculated + ", Фактический результат: " + result);
    }
}