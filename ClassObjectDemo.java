class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Student Name: " + name + ", Roll No: " + rollNo);
    }
}

class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void display() {
        System.out.println("Course Name: " + courseName + ", Duration: " + duration + " months");
    }
}

public class ClassObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Haarish", 101);
        Course c1 = new Course("Java Programming", 3);

        s1.display();
        c1.display();
    }
}
