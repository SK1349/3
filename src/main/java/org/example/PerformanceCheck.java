package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Класс для сравнения производительности некоторых методов ArrayList и LinkedList
 */
public class PerformanceCheck {
    /**
     * Результаты проверки: [тип списка: ArrayList, LinkedList][методы: add, get, remove]
     */
    private long[][] time = new long[2][3];
    /**
     * Экземпляр класса ArrayList
     */
    private ArrayList<Integer> arrayList;
    /**
     * Экземпляр класса LinkedList
     */
    private LinkedList<Integer> linkedList;

    /**
     * Конструктор без входных данных
     */
    public PerformanceCheck() {
        this.arrayList = new ArrayList<>();
        this.linkedList = new LinkedList<>();
    }

    /**
     * Конструктор
     * @param iteration - количество элементов в списках
     */
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

    /**
     * Запуск тестов и построение таблицы
     * @param iteration - количество вызовов методов коллекций
     */
    public void doTests(int iteration) {
        testAdd(iteration);
        testGet(iteration);
        testRemove(iteration);

        printTable();;
    }

    /**
     * Извлечение результатов
     * @param i - необходимая коллекция
     * @param j - требуемый метод
     * @return время пройденного теста
     */
    public long getTime (int i, int j){
        return time[i][j];
    }

    /**
     * Тест добавления элементов
     * @param iteration - количество повторений
     */
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

    /**
     * Тест извлечения элементов
     * @param iteration - количество повторений
     */
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

    /**
     * Тест удаления элементов
     * @param iteration - количество повторений
     */
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

    /**
     * Вывод таблицы результатов
     */
    public void printTable() {
        System.out.println("Метод\t\tТип списка\t\t Итерации\tВремя (ns)");
        System.out.println("add\t\t\tArrayList\t\t 1000\t\t" + time[0][0]);
        System.out.println("add\t\t\tLinkedList\t\t 1000\t\t" + time[1][0]);
        System.out.println("get\t\t\tArrayList\t\t 1000\t\t" + time[0][1]);
        System.out.println("get\t\t\tLinkedList\t\t 1000\t\t" + time[1][1]);
        System.out.println("remove\t\tArrayList\t\t 1000\t\t" + time[0][2]);
        System.out.println("remove\t\tLinkedList\t\t 1000\t\t" + time[1][2]);
    }


}
