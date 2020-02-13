import modeule.Gender;
import modeule.Student;

public class Application {

  public static void main(String[] args) {
    Student student1 = new Student("Linda", Gender.valueOf(Gender.class, "FEMALE"));
    Student student2 = new Student("Bob", Gender.valueOf(Gender.class, "MALE"));
    Student student3 = new Student("Solider", Gender.valueOf(Gender.class, "MALE"));
    Student student4 = new Student("Cindy", Gender.valueOf(Gender.class, "FEMALE"));
    Student[] students = new Student[] {student1, student2, student3, student4};

    findFemaleStudents(students);
  }

  public static void findFemaleStudents(Student[] students) {
    for (Student student : students) {
      if (student.getGender().getGender().equals("Female")) {
        System.out.println("女学生姓名为" + student.getName());
      }
    }
  }
}
