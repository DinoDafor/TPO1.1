
import com.company.MyMath;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyMathTest {
    //Проверка табличных значений
    @ParameterizedTest
    @CsvFileSource(resources="/dataTableMath.csv")
    void testTableValues(double expected, double grades) {
        assertEquals(expected, MyMath.calculateCos(grades), 0.00000000001);
    }
    //Тест периодичности
    @ParameterizedTest
    @CsvFileSource(resources="/dataPeriodCos.csv")
    void testPeriodValues(double expected, double grades) {
        assertEquals(expected, MyMath.calculateCos(grades), 0.00000000001);
    }

    //Тесты на точность
    @ParameterizedTest
    @CsvFileSource(resources="/dataGoodPrecisionMath.csv")
    void testGoodPrecisionValues(double expected, double grades) {
        assertEquals(expected, MyMath.calculateCos(grades), 0.00000000000001);
    }
    @ParameterizedTest
    @CsvFileSource(resources="/dataBadPrecisionMath.csv")
    void testBadPrecisionValues(double expected, double grades) {
        assertEquals(expected, MyMath.calculateCos(grades), 0.000000000000001);
    }

    // Тест на бесконечности
    @Test
    void testMinValues(){
        assertEquals(Double.NEGATIVE_INFINITY, MyMath.calculateCos(-Double.MAX_VALUE), 0.00000000001);
    }
    @Test
    void testMaxValues(){
        assertEquals(Double.POSITIVE_INFINITY, MyMath.calculateCos(Double.MAX_VALUE), 0.00000000001);
    }
    //Тест на ошибки
    @Test
    void testErrorValues(){
        assertEquals(Double.NaN, MyMath.calculateCos(Double.NaN), 0.00000000001);
    }
    


}