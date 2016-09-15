package tests;

import java.util.*;
import java.util.Map.Entry;

/**
 * Created by jkhalsa on 06/09/2016.
 */
public class ArrayFun {

    public int[] sortify(int[] actual) {
        Map<Integer, Integer> freqMap = new LinkedHashMap<>();
        createFreqMap(freqMap, actual);
        List<Entry<Integer, Integer>> entryList = new ArrayList<Entry<Integer, Integer>>(freqMap.entrySet());
        sortByValue(entryList, freqMap);
        putSortedElementsBack(actual, entryList);
        return actual;
    }

    private void putSortedElementsBack(int[] actual, List<Entry<Integer, Integer>> entryList) {
        int index = 0;
        for(int i = 0; i < entryList.size(); i++){
            for(int j = 0; j < entryList.get(i).getValue(); j++){
                actual[index] = entryList.get(i).getKey();
                index++;
            }
        }
    }

    private void sortByValue(List<Entry<Integer, Integer>> entryList, Map<Integer, Integer> freqMap) {
        Collections.sort(entryList, new Comparator<Entry<Integer, Integer>>() {
            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
    }

    private void createFreqMap(Map<Integer, Integer> freqMap, int[] actual) {
        for(int i = 0; i < actual.length; i++){
            int key = actual[i];
            if(freqMap.containsKey(key)){
                freqMap.put(key, freqMap.get(key) + 1);
            }
            else {
                freqMap.put(key, 1);
            }
        }
    }


}
