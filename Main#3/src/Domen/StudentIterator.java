package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentIterator implements Iterator<Student>{

    private int counter = 0;
    private List<Student> students;
    
    public StudentIterator(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size();
         
    }

    @Override
    public Student next() {
        return students.get(counter++);
    }



    
}
