public class Encapsulation {
  public static void main(String[] args) {
    Student student = new Student("GTA-5", 10, 3.5);
    student.displayStudentinfo();

    student.setName("RDR-2");
    student.setAge(5);
    student.setGpa(4);
    
    student.displayStudentinfo();
  }
}