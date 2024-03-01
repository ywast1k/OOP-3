package Domen;

public class Employee<T,V> extends WorkingPerson<T,V> {

    private T special;
    public Employee(T name, V age, T special) {
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
