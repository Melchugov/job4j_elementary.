package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rs1 = value / 70;
        return rs1;
    }

    public static float rubleToDollar(float value) {
        float rs2 = value / 60;
        return rs2;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(210);
        float dollar = Converter.rubleToDollar(210);
        System.out.println("210" + " rubles are " + euro + " euro.");
        System.out.println("210" + " rubles are " + dollar + " dollar.");
    }
}