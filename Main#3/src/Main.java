import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import Domen.Student;
import Domen.StudentGrupp;
public class Main {
    /**
     * Добавление студентов. Раздача имен и лет(указано в Student.java).
     */
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
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

        StudentGrupp studentGrupp1 = new StudentGrupp(1, students);
        
        /**
     * Вывод списка студентов
     */
        for (Student student: studentGrupp1) {
            System.out.println(student);
        }
        System.out.println("---------");
        Collections.sort(studentGrupp1.getStudentList());
        for (Student student: studentGrupp1) {
            System.out.println(student);
        }
       
    }
    
}
