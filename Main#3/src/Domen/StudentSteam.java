package Domen;



public class StudentSteam {
    private int nameValve;
    private static int idNameValve;

    public StudentSteam(int nameValve) {
        this.nameValve = nameValve;
        idNameValve++;
        this.nameValve = idNameValve;
    }

    public int getNameValve() {
        return nameValve;
    }
//
//    public void setNameValve(int nameValve) {
//        this.nameValve = nameValve;
//    }
//
    public static int getIdNameValve() {
        return idNameValve;
    }
//
//    public static void setIdNameValve(int idNameValve) {
//        StudentSteam.idNameValve = idNameValve;
//    }
//    

    @Override
    public String toString() {
        return "StudentSteam [Номер потока=" + nameValve + "]";
    }

    
    

    

}
