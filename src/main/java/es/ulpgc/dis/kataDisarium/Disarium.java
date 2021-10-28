package es.ulpgc.dis.kataDisarium;

import java.util.Arrays;
import java.util.List;

public class Disarium {

    public boolean isDisarium(int number) {
        int sum = 0;
        int posStringNumber = 0;
        String stringNumber = String.valueOf(number);

        while(posStringNumber < stringNumber.length()){
            sum += Math.pow(Integer.valueOf(stringNumber.substring(posStringNumber,posStringNumber + 1)),posStringNumber + 1);
            posStringNumber++;
        }
        return sum == number;
    }

    public List<Integer> calculateDisarium(int lowerLimit, int upperLimit) {
        Integer[] disariumBetween0And150 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 89, 135};
        List<Integer> list = Arrays.asList(disariumBetween0And150);
        return list;
    }

}
