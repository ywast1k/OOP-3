package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentGrupp<T extends Comparable<T>,V> implements Iterable<Student<T,V>>, Comparable<StudentGrupp<T,V>> {
    public int idStudentGrupp;
    // Создание листа
    private List<Student<T,V>> studentList;

    public StudentGrupp(int idStudentGrupp, List<Student<T,V>> studentList) {
        this.idStudentGrupp = idStudentGrupp;
        this.studentList = studentList;
    }

    public int getIdStudentGrupp() {
        return idStudentGrupp;
    }

    public void setIdStudentGrupp(int idStudentGrupp) {
        this.idStudentGrupp = idStudentGrupp;
    }

    public List<Student<T,V>> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student<T,V>> studentList) {
        this.studentList = studentList;
    }

    @Override
    public Iterator<Student<T,V> iterator() {
        
        return new StudentIterator(studentList);
    }
//* Сортировка по кол-ву студентов в группе, */
    @Override
    public int compareTo(StudentGrupp o) {
        if(this.getStudentList().size() > o.getStudentList().size()) return 1;
        if(this.getStudentList().size() < o.getStudentList().size()) return -1; 
        
        if(this.getIdStudentGrupp() > o.getIdStudentGrupp()) return 1;
        if(this.getIdStudentGrupp() < o.getIdStudentGrupp()) return 1;
        return 0;       
    }
// Добавления для вывода списков
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
    sb.append("StudentGrupp [ idStudentGrupp=").append(idStudentGrupp).append(",\nstudentList=[\n");
    for (Student student : studentList) {
        sb.append("  ").append(student.toString()).append(",\n");
    }
    sb.append("]]");
    return sb.toString();
} 


}
