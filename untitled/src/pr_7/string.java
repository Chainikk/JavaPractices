package pr_7;

interface string {
    int Count(String s);
    String oddPositions(String s);
    String InverseLine(String s);
}

class stringOperations implements string{
    public int Count(String s) {
        return s.length();
    }
    public String oddPositions(String s) {
        String line = "";
        for (int i=1;i<s.length();i+=2) {
            line += s.charAt(i);
        }
        return line;
    }
    public String InverseLine(String s) {
        String line = "";
        for (int i=s.length()-1;i>=0;i--) {
            line += s.charAt(i);
        }
        return line;
    }

}

class Task5 {
    public static void main(String[] args) {
        stringOperations string = new stringOperations();
        System.out.println(string.Count("абвгд "));
        System.out.println(string.InverseLine("123456789"));
        System.out.println(string.oddPositions("123456789"));
    }
}

