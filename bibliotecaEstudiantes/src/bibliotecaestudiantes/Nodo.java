
package bibliotecaestudiantes;


public class Nodo {
    private Estudiante estudiante;
    private Nodo next;

    public Nodo() {
    }

    public Nodo(Estudiante estudiante, Nodo next) {
        this.estudiante = estudiante;
        this.next = next;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    
}
