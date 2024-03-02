import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

import Controllers.AccountController;
import Domen.Employee;
import Domen.Person;
import Domen.Student;
import Domen.StudentGrupp;
import Domen.StudentSteam;
import Domen.Teacher;
public class Main {
    /**
     * Добавление студентов. Раздача имен и лет(указано в Student.java).
     */
    public static void main(String[] args){

        Person<String, Integer> pers1 = new Person<String, Integer>("1111", 23);
            
        
//           // Создание листов
//           List<Student> students = new ArrayList<>();
//           List<Student> students2 = new ArrayList<>();
//   //==========================
//           Student student1 = new Student("Mikael", 24);
//           Student student2 = new Student("Sanni", 19);
//           Student student3 = new Student("Luisa", 18);
//           Student student4 = new Student("Miron", 15);
//           Student student5 = new Student("Franchesco", 20);
//           Student student6 = new Student("Musse", 17);
//           Student student7 = new Student("Mikae", 20);
//           Student student8 = new Student("Sann", 19);
//           Student student9 = new Student("Luis", 20);
//           Student student10 = new Student("Miro", 20);
//           Student student11 = new Student("Franch", 20);
//           Student student12 = new Student("Muss", 17);
//           /**
//        *  Добавление в список элементов
//        */
//           students.add(student1);
//           students.add(student2);
//           students.add(student3);
//           students.add(student4);
//           students.add(student5);
//           students.add(student6);
//           students2.add(student7);
//           students2.add(student8);
//           students2.add(student9);
//           students2.add(student10);
//           students2.add(student11);
//           students2.add(student12);
//       // Создание двух основных групп
//           StudentGrupp studentGrupp1 = new StudentGrupp(1, students);
//           StudentGrupp studentGrupp2 = new StudentGrupp(2, students2);
//           /**
//        * Вывод списка студентов 1
//        */
//   
//       for (Student student: studentGrupp1) {
//           System.out.println(student);
//       }
//      /**
//        * Вывод списка студентов 2
//        */
//       for (Student student: studentGrupp2) {
//           System.out.println(student);
//       }
//   
//       System.out.println("---------");
//          /**
//        * сортировка
//        */ 
//       Collections.sort(studentGrupp2.getStudentList());
//           for (Student student: studentGrupp2) {
//               System.out.println(student);
//       }
//      
//       Collections.sort(studentGrupp1.getStudentList());
//           for (Student student: studentGrupp1) {
//               System.out.println(student);
//           }
//          
//       System.out.println("---------");
//   //--------------------------------------------------------------------
//   
//   // сохранение списков в новый лист
//      List<StudentGrupp> studentGrupps = new ArrayList<>();
//      studentGrupps.add(studentGrupp1);
//      studentGrupps.add(studentGrupp2);
//   
//      StudentSteam studentSteam = new StudentSteam(studentGrupps, 3);
//      //System.out.println(studentGrupps);
//   
//   
//      System.out.println("-----");
//   
//   // Сортировка студентов
//       Collections.sort(studentSteam.getStudentGrupps());
//       System.out.println(studentSteam);
//   
//   
//       System.out.println("-----");
//   
//           Employee worker = new Employee("Василий ", 69, "Cтоляр");
//           Teacher teacher = new Teacher("Галина ", 55, "Доцент" );
//         //AccountController contr = new AccountController();
//         //contr.PaySalary(worker, 20000);
//         //contr.PaySalary(teacher, 20001);
//          // contr.PaySalary(100, 2000); 
//          //Student studentVasyaHytry = new Student("Вася-хитрый ", 20);
//          //contr.PaySalary(studentVasyaHytry, 1000);
//   
//   
//          // Сокращение кода выше + защита от вмешательства > WorkingPerson
//           AccountController.PaySalary(worker, 10000);
//           AccountController.PaySalary( teacher, 10001);
//   
//           System.out.println("-----------------------------");
//   
//           Teacher teacher2 = new Teacher("Margaritta", 55, "Интерн");     // Создание учителя
//           Teacher teacher3 = new Teacher("Muhamed", 49, "Зав. каф.");     // Создание учителя
//           Teacher teacher4 = new Teacher("Grigoriy", 50, "Ассистент");        // Создание учителя
//           Teacher teacher5 = new Teacher("Alex", 22, "Ассистент");        // Создание учителя
//               
//           List<Teacher> Teachers = new ArrayList<>(); // Создание листа
//           
//           Teachers.add(teacher2);         // Сохранение учителя
//           Teachers.add(teacher3);         // Сохранение учителя
//           Teachers.add(teacher4);         // Сохранение учителя
//           Teachers.add(teacher5);         // Сохранение учителя
//   
//           AccountController.averageAge(Teachers);   // Вывод метода в консоль по введенному списку.
//   
     }    
}
