
package escuela;

public class Curso {
    private int curso_id;
    private String curso_desc;
    
    public Curso(){
        
    }
    
    public Curso (int curso_id, String curso_desc){
        this.curso_id= curso_id;
        this.curso_desc= curso_desc;
    }

    public int getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(int curso_id) {
        this.curso_id = curso_id;
    }

    public String getCurso_desc() {
        return curso_desc;
    }

    public void setCurso_desc(String curso_desc) {
        this.curso_desc = curso_desc;
    }

  
}
