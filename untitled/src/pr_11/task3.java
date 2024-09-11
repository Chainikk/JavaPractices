package pr_11;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
class Student{
    private String name;
    private String lastName;
    private String profile;
    private int course;
    private String group;
    private int GPA;
    private Date birthDate;

    public Student(String name, String lastName, String profile, int course, String group, int gpa, Date birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.profile = profile;
        this.course = course;
        this.group = group;
        this.GPA = gpa;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public int getGPA() {
        return GPA;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public String getLastName() {
        return lastName;
    }

    public String getProfile() {
        return profile;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", profile='" + profile + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                ", GPA=" + GPA +
                ", birthDate=" + birthDate +
                '}';
    }
    public String getFormattedBirthDate(String format, Date birthDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(birthDate);
    }
}

class task3{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату в формате dd.MM.yyyy: ");
        String userInput = sc.nextLine();

        Date currentDate = new Date();
        Date userDate = null;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);

        userDate = dateFormat.parse(userInput, new ParsePosition(0));
        Student student = new Student("Nastya", "Morgunova", "222", 3, "INBO", 264, userDate);
        String shortFormat = "dd.MM.yy";
        String mediumFormat = "dd MMM yyyy";
        String fullFormat = "EEEE, dd MMMM yyyy";

        System.out.println(student.getFormattedBirthDate(shortFormat, userDate));
        System.out.println(student.getFormattedBirthDate(mediumFormat, userDate));
        System.out.println(student.getFormattedBirthDate(fullFormat, userDate));
    }
}
