package services;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComparator;
import Domen.Student;

public class StudentServices implements iPersonService<Student> {
//  -- Добавление переменной и Создание листа Array    
   private int count;
   private List<Student> listStudent;

   public StudentServices() {
    this.listStudent = new ArrayList<Student>();
   }

@Override
public void create(String name, int age) {
    Student newStudent = new Student(name, age);
    this.listStudent.add(newStudent);
    this.count++;
}

@Override
public List<Student> getAll() {
    
    return this.listStudent;
}
// Сортировка списка студентов
public void SortByFIO(){
    PersonComparator<Student> comparator = new PersonComparator();
    this.listStudent.sort(comparator);

}
}
