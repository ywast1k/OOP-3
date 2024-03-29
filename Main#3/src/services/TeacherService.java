package services;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComparator;
import Domen.Teacher;

public class TeacherService implements iPersonService<Teacher> {

    private int count;
    private List<Teacher> listTeacher;

// Создание аррай листа 
    public TeacherService(){
        this.listTeacher = new ArrayList<Teacher>();
               
    }

    @Override
    public List<Teacher> getAll() {
        return this.listTeacher;
    }
// Возврат 3 полей на Main Имя, возраст, степень
    @Override
    public void create(String name, int age) {
        Teacher newTeacher = new Teacher(name, age, name);
        this.listTeacher.add(newTeacher);
        this.count++;
        
    }
//  Сортировка
    public void SortByFIO(){
    PersonComparator<Teacher> comparator = new PersonComparator();
    this.listTeacher.sort(comparator);

}
}
