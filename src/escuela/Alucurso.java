package escuela;

public class Alucurso {
    private int Alucurso_id;
    private Curso al_curso;
    private Alumno al_alumno;
    
    public Alucurso() {
    
}
    
    public Alucurso(Curso al_curso, Alumno al_alumno){
        this.al_alumno=al_alumno;
        this.al_curso = al_curso;
    }

    public int getAlucurso_id() {
        return Alucurso_id;
    }

    public void setAlucurso_id(int Alucurso_id) {
        this.Alucurso_id = Alucurso_id;
    }

    public Curso getAl_curso() {
        return al_curso;
    }

    public void setAl_curso(Curso al_curso) {
        this.al_curso = al_curso;
    }

    public Alumno getAl_alumno() {
        return al_alumno;
    }

    public void setAl_alumno(Alumno al_alumno) {
        this.al_alumno = al_alumno;
    }

   
    
}
