package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.reverse_sort.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSortService {

    public String[] reverseSort(String[] arrayy){
            List<String> list = Arrays.asList(arrayy);
            Collections.reverse(list);
            String[] reversedArray = list.toArray(arrayy);
        return arrayy;
    }
}
