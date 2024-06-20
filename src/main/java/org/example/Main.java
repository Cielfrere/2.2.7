package org.example;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        TipService tipService = new TipService();

        BigDecimal amount1 = BigDecimal.valueOf(900);
        BigDecimal result1 = tipService.roundTips(amount1);
        System.out.println("Сумма: " + amount1 + " итого с чаевыми: " + result1);

        BigDecimal amount2 = BigDecimal.valueOf(1000);
        BigDecimal result2 = tipService.roundTips(amount2);
        System.out.println("Сумма: " + amount2 + " итого с чаевыми: " + result2);

        BigDecimal amount3 = BigDecimal.valueOf(1500);
        BigDecimal result3 = tipService.roundTips(amount3);
        System.out.println("Сумма: " + amount3 + " итого с чаевыми: " + result3);
    }
}

