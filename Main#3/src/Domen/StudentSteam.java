package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGrupp>{
    private int nameValve;
    private List<StudentGrupp> studentGrupps;

    public StudentSteam(int nameValve){
        this.nameValve = nameValve;
    }
    
    public StudentSteam(List<StudentGrupp> studentGrupps, int nameValve) {
        this.nameValve = nameValve;
        this.studentGrupps = studentGrupps;
    }

    public StudentSteam(List<StudentGrupp> studentGrupps){
        this.studentGrupps=studentGrupps;
    }


    public int getNameValve() {
        return nameValve;
    }

    public void setNameValve(int nameValve) {
        this.nameValve = nameValve;
    }
    public List<StudentGrupp> getStudentGrupps() {
        return studentGrupps;
    }

    public void setStudentGrupps(List<StudentGrupp> studentGrupps) {
        this.studentGrupps = studentGrupps;
    }

    @Override
    public Iterator<StudentGrupp> iterator() {
        return new StudentGruppIterator(studentGrupps);
    }

    @Override
    public String toString() {
        String temp = "";
        for(StudentGrupp studentGrupp : studentGrupps){
            temp+= studentGrupp+"\n";
        }
       return "Поток = " + nameValve + "\n кол-во групп " + studentGrupps.size() + "\n" + temp;
    }

    
    
    

    

}
