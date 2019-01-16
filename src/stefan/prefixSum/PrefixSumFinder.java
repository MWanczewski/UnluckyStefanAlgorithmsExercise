package stefan.prefixSum;

import stefan.GreatestSumFindable;

import java.util.ArrayList;
import java.util.List;

public class PrefixSumFinder implements GreatestSumFindable {
   private int sum = 0;
   private int greatestSum = 0;

    @Override
    public int findGreatestSum(List<Integer> rawList) {
        List<Integer> prefixedList = generatePrefixSum(rawList);
        for(int i = 0; i < prefixedList.size(); i++) {
            for(int j = i; j < prefixedList.size(); j++) {
               sum = prefixedList.get(j) - prefixedList.get(i);
               if(sum > greatestSum) {
                   greatestSum = sum;
               }
            }
        }
        return greatestSum;
    }
    private List<Integer> generatePrefixSum(List<Integer> listOfIntegers) {
        List<Integer> prefixSum = new ArrayList<>();
        prefixSum.add(0);
        int sum = 0;
        for (int value : listOfIntegers) {
            sum += value;
            prefixSum.add(sum);
        }
        return prefixSum;
    }
    @Override
    public void showAlgorithmName() {
        System.out.println("Prefixed sum");
    }
}
