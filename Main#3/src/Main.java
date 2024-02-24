import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import Domen.Student;
import Domen.StudentGrupp;
import Domen.StudentSteam;
public class Main {
    /**
     * Добавление студентов. Раздача имен и лет(указано в Student.java).
     */
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        List<Student> students2 = new ArrayList<>();
        Student student1 = new Student("Mikael", 24);
        Student student2 = new Student("Sanni", 19);
        Student student3 = new Student("Luisa", 18);
        Student student4 = new Student("Miron", 15);
        Student student5 = new Student("Franchesco", 20);
        Student student6 = new Student("Musse", 17);
        /**
     *  Добавление в список элементов
     */
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students2.add(student1);
        students2.add(student2);
        students2.add(student3);
        students2.add(student4);
        students2.add(student5);
        students2.add(student6);
        StudentSteam StudentSteam1 = new StudentSteam(1);
        StudentGrupp studentGrupp1 = new StudentGrupp(1, students);
        StudentSteam StudentSteam2 = new StudentSteam(2);
        StudentGrupp studentGrupp2 = new StudentGrupp(2, students2);
        /**
     * Вывод списка студентов
     */
    System.out.println(StudentSteam1);
    for (Student student: studentGrupp1) {
        System.out.println(student);
        
    }

    System.out.println("---------");

    System.out.println(StudentSteam2);
    for (Student student: studentGrupp2) {
        System.out.println(student);
    }
   
    //    System.out.println("---------");
    //    Collections.sort(studentGrupp1.getStudentList());
    //    for (Student student: studentGrupp1) {
    //        System.out.println(student);
    //    }
    //   
    }
    
}
