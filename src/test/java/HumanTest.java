import com.company.Human;
import com.company.Planet;
import org.junit.jupiter.api.Test;
import com.company.Human;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HumanTest {

    @Test
    void testWeightReturn() {
        Planet betsalamin = new Planet("betsalamin", 100, 1900000);
        Human misha = new Human("Misha", 20, 95, 15, 6);
        assertEquals(1900009, misha.weightReturn(betsalamin));

        misha.setAllocateKG(15);
        assertEquals(1900009, misha.weightReturn(betsalamin));

        misha.setAllocateKG(16);
        assertEquals(1900009, misha.weightReturn(betsalamin));

    }

    @Test
    void testErrorsWeightReturn() {
        //Тестовый сценарий, если можно так сказать конечно
        Planet betsalamin = new Planet("betsalamin", 100, -1);
        Human misha = new Human("Misha", 20, 95, 15, 6);
        assertThrows(ArithmeticException.class, () -> misha.weightReturn(betsalamin));

        betsalamin.setWeight(1900000);
        misha.setWeight(-1);
        assertThrows(ArithmeticException.class, () -> misha.weightReturn(betsalamin));

        misha.setWeight(95);
        misha.setAllocateKG(-1);
        assertThrows(ArithmeticException.class, () -> misha.weightReturn(betsalamin));

        misha.setAllocateKG(6);
        misha.setEatKG(-1);
        assertThrows(ArithmeticException.class, () -> misha.weightReturn(betsalamin));

        misha.setEatKG(15);
        assertEquals(1900009, misha.weightReturn(betsalamin));



    }

}