package com.company;

public class MyMath {

    public static double calculateCos(double x) {
        // перевод в аргумента в градусы
        x = x * Math.PI / 180;

        //или кидать ошибку
        if (x == Double.POSITIVE_INFINITY ){
            return Double.POSITIVE_INFINITY;

        } else if( x == Double.NEGATIVE_INFINITY) {
            return Double.NEGATIVE_INFINITY;
        }

            double d, m, sg, e, result;
        result = 1;
        //Убираем "лишние" круги
        if (x > 0)
            while (x > 2 * Math.PI) {
                x = x - 2 * Math.PI;
            }
        else
            while (x < 2 * Math.PI) {
                x = x + 2 * Math.PI;
            }

        d = 2;
        m = 1;
        sg = -1;
        e = 0.000000000001;
        while (m > e) {
            m = m * x * x / ((d - 1) * d);
            result = result + sg * m;
            sg = -sg;
            d = d + 2;
        }
        return result;

    }
}
