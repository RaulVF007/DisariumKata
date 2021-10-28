package es.ulpgc.dis.kataDisarium;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DisariumTest {

    @Test
    public void test_Disarium_between_0_150(){
        Integer[] disariumBetween0And150 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 89, 135};
        List<Integer> list = Arrays.asList(disariumBetween0And150);

        Disarium disarium = new Disarium();
        List<Integer> listCalculated = disarium.calculateDisarium(0,150);

        assertEquals(true, listCalculated.equals(list));
    }
    @Test
    public void test_Disarium_between_151_550(){
        Integer[] disariumBetween151And550 = {175,518};
        List<Integer> list = Arrays.asList(disariumBetween151And550);

        Disarium disarium = new Disarium();
        List<Integer> listCalculated = disarium.calculateDisarium(0,150);

        assertEquals(true, listCalculated.equals(list));
    }
}
