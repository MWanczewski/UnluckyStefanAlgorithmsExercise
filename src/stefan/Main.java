package stefan;

import stefan.greedy.GreedySumFinder;
import stefan.naive.NaiveSumFinder;
import stefan.prefixSum.PrefixSumFinder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GreatestSumFindable> algorithms = new ArrayList<>();
        List<Integer> rawList = new ArrayList<>();

        algorithms.add(new NaiveSumFinder());
        algorithms.add(new PrefixSumFinder());
        algorithms.add(new GreedySumFinder());

        rawList.add(1);
        rawList.add(-2);
        rawList.add(4);
        rawList.add(5);
        rawList.add(-2);

       for(GreatestSumFindable finder : algorithms) {
           finder.showAlgorithmName();
           System.out.println(finder.findGreatestSum(rawList));
       }
    }
}
