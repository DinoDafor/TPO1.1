import com.company.Human;
import com.company.Planet;
import org.junit.jupiter.api.Test;
import com.company.Human;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HumanTest {

    @Test
    void weightReturn() {
        Planet betsalamin = new Planet("betsalamin", 100,1900000);
        Human misha = new Human("Misha", 20,95,15,6);
        assertEquals(1900009, misha.weightReturn(misha, betsalamin));

        misha.setAllocateKG(15);
        assertEquals(1900009, misha.weightReturn(misha, betsalamin));

        misha.setAllocateKG(16);
        assertEquals(1900009, misha.weightReturn(misha, betsalamin));

    }
}