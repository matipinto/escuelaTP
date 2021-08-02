
package escuela;

public class Materia {
    
    public Materia(){
    
}

    private int materia_id;
    private String materia_desc;

    public Materia(int materia_id, String materia_desc) {
        this.materia_desc = materia_desc;
        this.materia_id = materia_id;
    }

    public int getMateria_id() {
        return materia_id;
    }

    public void setMateria_id(int materia_id) {
        this.materia_id = materia_id;
    }

    public String getMateria_desc() {
        return materia_desc;
    }

    public void setMateria_desc(String materia_desc) {
        this.materia_desc = materia_desc;
    }

}
