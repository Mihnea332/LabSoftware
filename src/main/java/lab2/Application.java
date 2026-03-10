package lab2;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<Integer> xPlusY = new ArrayList<>();
        Set<Integer> zSet = new TreeSet<>();
        List<Integer> xMinusY = new ArrayList<>();
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList<>();
        Random generator = new Random();

        for (int i = 0; i < 5; i++) {
            x.add(generator.nextInt(11));
        }
        Collections.sort(x);
        for (int i = 0; i < x.size(); i++) {
            System.out.print(x.get(i) + " ");
        }
        System.out.println();

        for (int i = 0; i < 7; i++) {
            y.add(generator.nextInt(11));
        }
        Collections.sort(y);
        for (int i = 0; i < y.size(); i++) {
            System.out.print(y.get(i) + " ");
        }

        xPlusY.addAll(x);
        xPlusY.addAll(y);
        System.out.println();
        for (int i = 0; i < xPlusY.size(); i++) {
            System.out.print(xPlusY.get(i) + " ");
        }

        zSet.addAll(x);
        zSet.retainAll(y);
        System.out.println();
        for (Integer i : zSet) {
            System.out.print(i + " ");
        }

        xMinusY.addAll(x);
        xMinusY.removeAll(y);
        System.out.println();
        for (int i = 0; i < xMinusY.size(); i++) {
            System.out.print(xMinusY.get(i) + " ");
        }

        for (Integer i : xPlusY) {
            if (i <= p) {
                xPlusYLimitedByP.add(i);
            }
        }
        System.out.println();
        for (int i = 0; i < xPlusYLimitedByP.size(); i++) {
            System.out.print(xPlusYLimitedByP.get(i) + " ");
        }
    }
}