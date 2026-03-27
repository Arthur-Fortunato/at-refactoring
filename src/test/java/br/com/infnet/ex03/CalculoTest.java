package br.com.infnet.ex03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculoTest {
    @Test
    public void deveTestarAFuncaoCalculatePriceComHolidayTrue() {
        Calculo calculo = new Calculo();
        double total = calculo.calculatePrice(10, 1, true);
        assertEquals(8.5, total);
    }

    @Test
    public void deveTestarAFuncaoCalculatePriceComHolidayFalse() {
        Calculo calculo = new Calculo();
        double total = calculo.calculatePrice(10, 1, false);
        assertEquals(9, total);
    }

    @Test
    public void deveTestarAFuncaoCalculatePriceComHolidayTrueECustomerType2() {
        Calculo calculo = new Calculo();
        double total = calculo.calculatePrice(10, 2, true);
        assertEquals(8, total);
    }

    @Test
    public void deveTestarAFuncaoCalculatePriceComHolidayFalseECustomerType2() {
        Calculo calculo = new Calculo();
        double total = calculo.calculatePrice(10, 2, false);
        assertEquals(8.5, total);
    }
}
