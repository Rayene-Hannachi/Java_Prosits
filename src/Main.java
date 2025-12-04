import java.util.*;

public class Main {
    public static void main(String[] args) {

        StudentManagement sm = new StudentManagement();

        List<Student> list = Arrays.asList(
                new Student(3, "Ali", 20),
                new Student(1, "Sami", 22),
                new Student(2, "Nour", 19)
        );

        System.out.println("----- Display Students -----");
        sm.displayStudents(list, s -> System.out.println(s));

        System.out.println("\n----- Students age > 20 -----");
        sm.displayStudentsByFilter(list,
                s -> s.getAge() > 20,
                s -> System.out.println(s));

        System.out.println("\n----- Students Names -----");
        String names = sm.returnStudentsNames(list, s -> s.getNom());
        System.out.println(names);

        System.out.println("\n----- Sorted by ID -----");
        List<Student> sorted = sm.sortStudentsById(list,
                (a, b) -> Integer.compare(a.getId(), b.getId()));
        sorted.forEach(System.out::println);

        System.out.println("\n----- Create Student (Supplier) -----");
        Student st = sm.createStudent(() -> new Student(10, "Yassine", 23));
        System.out.println(st);
    }
}
