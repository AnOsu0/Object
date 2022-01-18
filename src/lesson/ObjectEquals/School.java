package lesson.ObjectEquals;

public class School {
    public static void main(String[] args) {

        Student student1 = new Student("Jan Kowalski", 25);
        Student student2 = new Student("Jan Kowalski", 25);
//        System.out.println("student1.equals(student2)");
//        System.out.println(student1.equals(student2));
//        System.out.println(student1.hashCode());
//        System.out.println(student2.hashCode());

        System.out.println(student1);

    }
}