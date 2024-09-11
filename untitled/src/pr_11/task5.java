package pr_11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class task5 {
    public static void main(String[] args) {
        int dataSize = 100000; // Размер набора данных

        // Создание ArrayList и LinkedList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Заполнение обоих списков случайными числами
        Random random = new Random();
        for (int i = 0; i < dataSize; i++) {
            int randomNumber = random.nextInt(dataSize);
            arrayList.add(randomNumber);
            linkedList.add(randomNumber);
        }

        // Измерение времени вставки в начало
        long startTime = System.nanoTime();
        arrayList.add(0, 9999); // Вставка в начало ArrayList
        long endTime = System.nanoTime();
        System.out.println("Вставка в начало ArrayList заняла " + (endTime - startTime) + " наносекунд");

        startTime = System.nanoTime();
        linkedList.add(0, 9999); // Вставка в начало LinkedList
        endTime = System.nanoTime();
        System.out.println("Вставка в начало LinkedList заняла " + (endTime - startTime) + " наносекунд");

        // Измерение времени удаления из середины
        startTime = System.nanoTime();
        arrayList.remove(dataSize / 2); // Удаление из середины ArrayList
        endTime = System.nanoTime();
        System.out.println("Удаление из середины ArrayList заняло " + (endTime - startTime) + " наносекунд");

        startTime = System.nanoTime();
        linkedList.remove(dataSize / 2); // Удаление из середины LinkedList
        endTime = System.nanoTime();
        System.out.println("Удаление из середины LinkedList заняло " + (endTime - startTime) + " наносекунд");

        // Измерение времени добавления в конец
        startTime = System.nanoTime();
        arrayList.add(dataSize - 1, 9999); // Добавление в конец ArrayList
        endTime = System.nanoTime();
        System.out.println("Добавление в конец ArrayList заняло " + (endTime - startTime) + " наносекунд");

        startTime = System.nanoTime();
        linkedList.add(dataSize - 1, 9999); // Добавление в конец LinkedList
        endTime = System.nanoTime();
        System.out.println("Добавление в конец LinkedList заняло " + (endTime - startTime) + " наносекунд");

        // Измерение времени поиска элемента
        int searchElement = random.nextInt(dataSize); // Случайный элемент для поиска
        startTime = System.nanoTime();
        arrayList.contains(searchElement); // Поиск в ArrayList
        endTime = System.nanoTime();
        System.out.println("Поиск в ArrayList занял " + (endTime - startTime) + " наносекунд");

        startTime = System.nanoTime();
        linkedList.contains(searchElement); // Поиск в LinkedList
        endTime = System.nanoTime();
        System.out.println("Поиск в LinkedList занял " + (endTime - startTime) + " наносекунд");
    }
}
