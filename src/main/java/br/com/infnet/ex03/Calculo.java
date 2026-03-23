package br.com.infnet.ex03;

public class Calculo {
    private static final double BASE_PERCENTAGE = 1.0;
    private static final double CUSTOMER_TYPE_1_DISCOUNT = 0.10;
    private static final double CUSTOMER_TYPE_2_DISCOUNT = 0.15;
    private static final double HOLIDAY_DISCOUNT = 0.05;

    public double calculatePrice(double basePrice, int customerType, boolean isHoliday) {
        double totalDiscount = calculateTotalDiscount(customerType, isHoliday);
        return applyDiscount(basePrice, totalDiscount);
    }

    private double calculateTotalDiscount(int customerType, boolean isHoliday) {
        double discount = getCustomerDiscount(customerType);
        if (isHoliday) {
            discount += HOLIDAY_DISCOUNT;
        }
        return discount;
    }

    private double getCustomerDiscount(int customerType) {
        if (customerType == 1) return CUSTOMER_TYPE_1_DISCOUNT;
        if (customerType == 2) return CUSTOMER_TYPE_2_DISCOUNT;
        return 0;
    }

    private double applyDiscount(double basePrice, double discount) {
        return basePrice * (BASE_PERCENTAGE - discount);
    }
}