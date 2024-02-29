package Domen;
// передача информации в WPerson
public class Teacher extends WorkingPerson {

    private String degree;

    public Teacher(String name, int age, String degree) {
        super(name, age);
        this.degree = degree; //cтепень
        
    }

    @Override
    public String toString() {
        return "Teacher [" + "name=" + super.getName() + "age=" + super.getAge() + "degree=" + degree + "]";
    }
    
}
