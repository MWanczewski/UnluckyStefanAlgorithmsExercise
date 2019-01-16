package stefan.greedy;

import stefan.GreatestSumFindable;

import java.util.List;

public class GreedySumFinder implements GreatestSumFindable {
    private int sum = 0;
    private int greatestSum = 0;

    @Override
    public int findGreatestSum(List<Integer> rawList) {
        int index = rawList.size() - 1;
        while(index >= 0) {
            if (sum > 0) {
                sum += rawList.get(index);
            } else {
                sum = rawList.get(index);
            }
            if(sum > greatestSum) {
                greatestSum = sum;
            }
            index--;
        }
        return greatestSum;
    }
    @Override
    public void showAlgorithmName() {
        System.out.println("Greedy and best one");
    }
}
