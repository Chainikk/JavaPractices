package pr_18;

class ThrowsDemo1 {
    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        }
        catch (NullPointerException e) {
            System.out.println("Attempted to use null as the key");
        }
    }
    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }
}

class task5_6 {
    public static void main(String[] args) {
        ThrowsDemo1 throwsDemo = new ThrowsDemo1();
        throwsDemo.printMessage("aaaaaaaaaaaaaaaaaaa null");
        throwsDemo.printMessage(null);
    }
}

