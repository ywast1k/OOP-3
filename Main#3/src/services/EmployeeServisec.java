package services;

import java.util.ArrayList;
import java.util.List;

import Domen.Employee;
import Domen.PersonComparator;

public class EmployeeServisec implements iPersonService<Employee> {
// --  Добавление переменной и Создание листа Array  
    private int count;
    private List<Employee> listEmploees;

public EmployeeServisec() {
    this.listEmploees = new ArrayList<Employee>();
    
}

@Override
public void create(String name, int age) {
   Employee newEmployee = new Employee(name, age, "разнорабочий");
   this.listEmploees.add(newEmployee);
   this.count++;
    
}

@Override
public List<Employee> getAll() {

    return this.listEmploees;
}
public void SortByFIO(){
    this.listEmploees.sort(new PersonComparator<Employee>());
}
}
