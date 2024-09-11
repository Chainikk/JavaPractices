package pr_13;

public class task2 {
    private String lastName;
    private String firstName;
    private String middleName;

    public task2(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getFullName() {
        StringBuilder sb = new StringBuilder();
        sb.append(lastName);
        if (firstName != null && !firstName.isEmpty()) {
            sb.append(" ");
            sb.append(firstName.charAt(0));
            sb.append(".");
        }
        if (middleName != null && !middleName.isEmpty()) {
            sb.append(middleName.charAt(0));
            sb.append(".");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        task2 person1 = new task2("Иванов", "Иван", "Иванович");
        System.out.println(person1.getFullName()); // Иванов И.И.

        task2 person2 = new task2("Петров", "Петр", null);
        System.out.println(person2.getFullName()); // Петров П.

        task2 person3 = new task2("Сидоров ", null, "Сидорович");
        System.out.println(person3.getFullName()); // Сидоров С.
    }
}
