package pr_18;

import java.util.Objects;
import java.util.Scanner;
class ThrowsDemo {
    public void getKey() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String key = sc.next();
        while (true) {
            try {
                printDetalis(key);
                break;
            }
            catch (Exception ignored) {
            }
        }
    }

    private void printDetalis(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private String getDetails(String key) throws Exception {
        if (Objects.equals(key, "")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}

class task7 {
    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.getKey();
    }
}
