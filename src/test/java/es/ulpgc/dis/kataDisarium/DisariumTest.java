package es.ulpgc.dis.kataDisarium;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DisariumTest {

    @Test
    public void return_true_with_number_89(){
        Disarium disarium = new Disarium();

        assertEquals(true, disarium.isDisarium(89));
    }

    @Test
    public void return_false_with_number_200(){
        Disarium disarium = new Disarium();

        assertEquals(false, disarium.isDisarium(200));
    }

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
        List<Integer> listCalculated = disarium.calculateDisarium(151,550);

        assertEquals(true, listCalculated.equals(list));
    }

    @Test
    public void test_Disarium_between_551_5000(){
        Integer[] disariumBetween551And5000 = {598,1306,1676,2427};
        List<Integer> list = Arrays.asList(disariumBetween551And5000);

        Disarium disarium = new Disarium();
        List<Integer> listCalculated = disarium.calculateDisarium(551,5000);

        assertEquals(true, listCalculated.equals(list));
    }
}
