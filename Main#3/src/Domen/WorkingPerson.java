package Domen;

public class WorkingPerson<T,V> extends Person<T,V> {
// сортировочный метод предотвращаяющий вмешательство. Защита
    public WorkingPerson(T name, V age) {
        super(name, age);
        
    }

      
}
