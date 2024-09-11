package pr_20;

class MinMax<T extends Comparable<T>> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T findMin() {
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    public T findMax() {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Integer[] numbers = {5, 3, 9, 1, 7};
        MinMax<Integer> minMax = new MinMax<>(numbers);
        System.out.println("Min: " + minMax.findMin());
        System.out.println("Max: " + minMax.findMax());

        Double[] values = {2.5, 1.3, 4.7, 3.2};
        MinMax<Double> minMax2 = new MinMax<>(values);
        System.out.println("Min: " + minMax2.findMin());
        System.out.println("Max: " + minMax2.findMax());
    }
}


