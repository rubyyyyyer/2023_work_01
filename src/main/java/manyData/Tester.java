package manyData;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
//        arrayTest();
//        arrayListComplex();
//        list();
//        hashset();
        hashmap();
    }

    private static void hashmap() {
        HashMap<String, String> stocks = new HashMap<>();
        stocks.put("2330", "台積電");
        stocks.put("2317", "鴻海");
        stocks.put("0050", "元大50");
        stocks.put("2330", "TSMC");
        System.out.println(stocks);
        System.out.println(stocks.get("0050"));
        for (String x : stocks.keySet()) {
            System.out.println(stocks.get(x));
        }
    }

    private static void hashset() {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(5);
        hashSet.add(7);
        hashSet.add(3);
        System.out.println(hashSet);
        for (int i : hashSet) {
            System.out.println(i);
        }
    }

    private static void list() {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        System.out.println(arrayList);
        int n1 = arrayList.get(0);
        System.out.println(n1);
        System.out.println(arrayList.size());
        List<Integer> scores = Arrays.asList(60, 80, 100, 30, 20);
        for (int i : scores) {
            System.out.println(i);
        }
    }

    private static void arrayListComplex() {
        ArrayList arrayListComplex = new ArrayList();
        arrayListComplex.add(2);
        arrayListComplex.add(3);
        arrayListComplex.add("ruby");
        arrayListComplex.add(true);
        System.out.println(arrayListComplex);
        int a1 = (int) arrayListComplex.get(0);
        System.out.println(a1);
        String n1 = (String) arrayListComplex.get(2);
        System.out.println(n1);
    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[4] = 6;
        int[] scores = {60, 80, 100, 30, 20};
//        System.out.println(scores);
        for (int i = 0; i < 5; i++) {
            System.out.println("for:" + scores[i]);
        }
        for (int i : scores) {
            System.out.println("forEach:" + i);
        }
    }
}
