package escuela;

public class Calificacion {
   private int calificacion_id;
   private Materia cali_materia;
   private int nota;
   private Alumno cali_alumno;
   private int trimestre;
   
   public Calificacion (){    
       
   }   
   
   public Calificacion(Materia cali_materia, int nota, Alumno cali_alumno, int trimestre){
       this.cali_materia = cali_materia;
       this.nota = nota;
       this.cali_alumno = cali_alumno;
       this.trimestre = trimestre;
       
   }

    public int getCalificacion_id() {
        return calificacion_id;
    }

    public void setCalificacion_id(int calificacion_id) {
        this.calificacion_id = calificacion_id;
    }

    public Materia getCali_materia() {
        return cali_materia;
    }

    public void setCali_materia(Materia cali_materia) {
        this.cali_materia = cali_materia;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Alumno getCali_alumno() {
        return cali_alumno;
    }

    public void setCali_alumno(Alumno cali_alumno) {
        this.cali_alumno = cali_alumno;
    }

    public int getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(int trimestre) {
        this.trimestre = trimestre;
    }  
   
}
