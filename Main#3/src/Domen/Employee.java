package Domen;

public class Employee extends WorkingPerson {

    private String special;
    public Employee(String name, int age, String special) {
        super(name, age);
        this.special = special; // Добавление специальности

    }
    @Override
    public String toString() {
        return "Employee [" + "name=" + super.getName() +
         "age=" + super.getAge() + "special=" + "special="
          + special + "]";
    }

    
    
    
}
