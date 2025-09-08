package GreedyAlgorithm;

import java.util.*;

public class MinCoinsUsed {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,1000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins =0;
        int amount = 1059;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if(coins[i] <= amount) {
                while (coins[i] <= amount) {     //how many times we can use that coin
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("count of coins: " + countOfCoins);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

    }
}
