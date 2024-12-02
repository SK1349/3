package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceCheck {

    private long[][] time = new long[2][3];
    private ArrayList<Integer> arrayList;
    private LinkedList<Integer> linkedList;

    public PerformanceCheck() {
        this.arrayList = new ArrayList<>();
        this.linkedList = new LinkedList<>();
    }

    public PerformanceCheck(int iteration) {
        this.arrayList = new ArrayList<>();
        for (int i = 0; i < iteration; i++){
            arrayList.add(i);
        }
        this.linkedList = new LinkedList<>();
        for (int i = 0; i < iteration; i++){
            linkedList.add(i);
        }
    }

    public long getTime (int i, int j){
        return time[i][j];
    }

    public void testAdd (int iteration) {
        long start = System.nanoTime();
        for (int i = 0; i < iteration; i++){
            arrayList.add(i);
        }
        time[0][0] = System.nanoTime() - start;
        start = System.nanoTime();
        for (int i = 0; i < iteration; i++){
            linkedList.add(i);
        }
        time[1][0] = System.nanoTime() - start;
    }

    public void testGet (int iteration) {
        long start = System.nanoTime();
        for (int i = 0; i < iteration; i++){
            arrayList.get(i);
        }
        time[0][1] = System.nanoTime() - start;
        start = System.nanoTime();
        for (int i = 0; i < iteration; i++){
            linkedList.get(i);
        }
        time[1][1] = System.nanoTime() - start;
    }

    public void testRemove (int iteration) {
        long start = System.nanoTime();
        for (int i = iteration - 1; i >= 0; i--){
            arrayList.remove(i);
        }
        time[0][2] = System.nanoTime() - start;
        start = System.nanoTime();
        for (int i = iteration - 1; i >= 0; i--){
            linkedList.remove(i);
        }
        time[1][2] = System.nanoTime() - start;
    }

    public void printTable() {
        System.out.println("Метод\t\tТип списка\t\t Итерации\tВремя (ns)");
        System.out.println("add\t\tArrayList\t\t 1000\t" + time[0][0]);
        System.out.println("add\t\tLinkedList\t\t 1000\t" + time[1][0]);
        System.out.println("get\t\tArrayList\t\t 1000\t" + time[0][1]);
        System.out.println("get\t\tLinkedList\t\t 1000\t" + time[1][1]);
        System.out.println("remove\t\tArrayList\t\t 1000\t" + time[0][2]);
        System.out.println("remove\t\tLinkedList\t\t 1000\t" + time[1][2]);
    }


}
