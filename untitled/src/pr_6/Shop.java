package pr_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class task10 {
    // Enum для названий марок компьютера
    enum ComputerBrand {
        HP,
        Dell,
        Lenovo,
        Apple
    }

    // Класс, описывающий компьютер
    static class Computer {
        private ComputerBrand brand;
        private Processor processor;
        private Memory memory;
        private Monitor monitor;

        public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
            this.brand = brand;
            this.processor = processor;
            this.memory = memory;
            this.monitor = monitor;
        }


        public ComputerBrand getBrand() {
            return brand;
        }

        public void setBrand(ComputerBrand brand) {
            this.brand = brand;
        }

        public Processor getProcessor() {
            return processor;
        }

        public void setProcessor(Processor processor) {
            this.processor = processor;
        }

        public Memory getMemory() {
            return memory;
        }

        public void setMemory(Memory memory) {
            this.memory = memory;
        }

        public Monitor getMonitor() {
            return monitor;
        }

        public void setMonitor(Monitor monitor) {
            this.monitor = monitor;
        }

        @Override
        public String toString() {
            return "Computer{" +
                    "brand=" + brand +
                    ", processor=" + processor +
                    ", memory=" + memory +
                    ", monitor=" + monitor +
                    '}';
        }
    }

    // Класс, описывающий процессор
    static class Processor {
        private String model;
        private double frequency;

        public Processor(String model, double frequency) {
            this.model = model;
            this.frequency = frequency;
        }

        // Геттеры и сеттеры

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public double getFrequency() {
            return frequency;
        }

        public void setFrequency(int frequency) {
            this.frequency = frequency;
        }

        @Override
        public String toString() {
            return "Processor{" +
                    "model='" + model + '\'' +
                    ", frequency=" + frequency +
                    '}';
        }
    }

    // Класс, описывающий память
    static class Memory {
        private int size;
        private String type;

        public Memory(int size, String type) {
            this.size = size;
            this.type = type;
        }

        // Геттеры и сеттеры

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Memory{" +
                    "size=" + size +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

    // Класс, описывающий монитор
    static class Monitor {
        private String model;
        private int size;

        public Monitor(String model, int size) {
            this.model = model;
            this.size = size;
        }

        // Геттеры и сеттеры

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        @Override
        public String toString() {
            return "Monitor{" +
                    "model='" + model + '\'' +
                    ", size=" + size +
                    '}';
        }
    }

    // Класс, описывающий магазин
    static class Shop {
        private List<Computer> computers;

        public Shop() {
            computers = new ArrayList<>();
        }

        // Метод для добавления компьютера в магазин
        public void addComputer(Computer computer) {
            computers.add(computer);
        }

        // Метод для удаления компьютера из магазина
        public void removeComputer(Computer computer) {
            computers.remove(computer);
        }
        // Метод для поиска компьютера в магазине по заданным параметрам
        public List<Computer> searchComputers(ComputerBrand brand, String processorModel, int memorySize, int monitorSize) {
            List<Computer> foundComputers = new ArrayList<>();
            for (Computer computer : computers) {
                if (computer.getBrand() == brand &&
                        computer.getProcessor().getModel().equals(processorModel) &&
                        computer.getMemory().getSize() == memorySize &&
                        computer.getMonitor().getSize() == monitorSize) {
                    foundComputers.add(computer);
                }
            }
            return foundComputers;
        }

        // Метод для вывода всех компьютеров в магазине
        public void displayComputers() {
            for (Computer computer : computers) {
                System.out.println(computer);
            }
        }
    }

    // Класс для тестирования созданных классов
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Создание объектов компьютеров
        Computer computer1 = new Computer(ComputerBrand.HP, new Processor("Intel i5", 2.8), new Memory(8, "DDR4"), new Monitor("HP", 21));
        Computer computer2 = new Computer(ComputerBrand.Dell, new Processor("AMD Ryzen 7", 3.6), new Memory(16, "DDR4"), new Monitor("Dell", 24));
        Computer computer3 = new Computer(ComputerBrand.Lenovo, new Processor("Intel i7", 3.2), new Memory(16, "DDR4"), new Monitor("Lenovo", 23));
        Computer computer4 = new Computer(ComputerBrand.Apple   , new Processor("M1", 3.2), new Memory(32, "LP DDR5"), new Monitor("Apple", 30));
        // Создание объекта магазина
        Shop shop = new Shop();
        // Добавление компьютеров в магазин
        shop.addComputer(computer1);
        shop.addComputer(computer2);
        shop.addComputer(computer3);
        shop.addComputer(computer4);
        // Вывод всех компьютеров в магазине
        shop.displayComputers();
        // Поиск компьютеров в магазине
        System.out.println("Введите параметры для поиска компьютера:");
        System.out.print("Марка компьютера (HP, Dell, Lenovo, Apple): ");
        ComputerBrand brand = ComputerBrand.valueOf(scanner.nextLine());
        System.out.print("Модель процессора: ");
        String processorModel = scanner.nextLine();
        System.out.print("Размер памяти: ");
        int memorySize = scanner.nextInt();
        System.out.print("Размер монитора: ");
        int monitorSize = scanner.nextInt();
        List<Computer> foundComputers = shop.searchComputers(brand, processorModel, memorySize, monitorSize);
        if (foundComputers.isEmpty()) {
            System.out.println("Компьютеры с указанными параметрами не найдены");
        }
        else {
            System.out.println("Найденные компьютеры:");
            for (Computer computer : foundComputers) {
                System.out.println(computer);
            }
        }
    }
}
