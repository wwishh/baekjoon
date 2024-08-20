import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    static class Student {
        String name;
        int day;
        int month;
        int year;

        public Student(String name, int day, int month, int year) {
            this.name = name;
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();
            students.add(new Student(name, day, month, year));
        }

        // Comparator를 사용하여 정렬
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.year != s2.year) {
                    return s1.year - s2.year;
                } else if (s1.month != s2.month) {
                    return s1.month - s2.month;
                } else {
                    return s1.day - s2.day;
                }
            }
        });

        // 가장 나이가 적은 사람 (리스트의 마지막 요소)
        System.out.println(students.get(students.size() - 1).name);
        // 가장 나이가 많은 사람 (리스트의 첫 번째 요소)
        System.out.println(students.get(0).name);

        sc.close();
    }
}