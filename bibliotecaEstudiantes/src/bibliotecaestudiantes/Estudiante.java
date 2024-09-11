
package bibliotecaestudiantes;


public class Estudiante {
    private String nombre;
    private String sexo;
    private int cantLib;

    public Estudiante() {
    }

    public Estudiante(String nombre, String sexo, int cantLib) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.cantLib = cantLib;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getCantLib() {
        return cantLib;
    }

    public void setCantLib(int cantLib) {
        this.cantLib = cantLib;
    }

    @Override
    public String toString() {
        return "📖 Estudiante: " + nombre + ", sexo=" + sexo + ", libros consultados: " + cantLib;
    }
    
}
