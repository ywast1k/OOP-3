package Domen;
// передача информации в WPerson
public class Teacher<T,V> extends WorkingPerson<T,V> {

    private T degree;

    public Teacher(T name, V age, T degree) {
        super(name, age);
        this.degree = degree; //cтепень
        
    }

    @Override
    public String toString() {
        return "Teacher [" + "name=" + super.getName() + "age=" + super.getAge() + "degree=" + degree + "]";
    }
    
}
