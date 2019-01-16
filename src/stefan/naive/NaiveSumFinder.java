package stefan.naive;


import stefan.GreatestSumFindable;

import java.util.List;

public class NaiveSumFinder implements GreatestSumFindable {
 private int greatestSum= 0;
 private int sum = 0;

    @Override
    public int findGreatestSum(List<Integer> rawList) {
        for (int i = 0; i < rawList.size(); i++) {
            sum = 0;
            for(int j = i ;j < rawList.size(); j++ ) {
                sum += rawList.get(j);
                if(sum > greatestSum){
                    greatestSum = sum;
                }
            }
        }
        return greatestSum;
    }
    @Override
    public void showAlgorithmName() {
        System.out.println("Naive");
    }
}
