package es.ulpgc.dis.kataDisarium;

import java.util.ArrayList;
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
        List<Integer> list = new ArrayList<Integer>();
        for (int number = lowerLimit; number <= upperLimit ; number++) {
            if(isDisarium(number)) list.add(number);
        }
        return list;
    }

}
