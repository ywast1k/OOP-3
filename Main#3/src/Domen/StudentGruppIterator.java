package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentGruppIterator implements Iterator<StudentGrupp>{
    
    private int counter;
    private List<StudentGrupp> StudentGrupps;
    
    public StudentGruppIterator(List<StudentGrupp> studentGrupps){
    this.StudentGrupps = studentGrupps;
}

    @Override
    public boolean hasNext() {
        return counter < StudentGrupps.size();
    }

    @Override
    public StudentGrupp next() {
        return StudentGrupps.get(counter++);
    }
    
}
