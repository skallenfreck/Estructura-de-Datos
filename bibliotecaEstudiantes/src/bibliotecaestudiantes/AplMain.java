
package bibliotecaestudiantes;


public class AplMain {

    
    public static void main(String[] args) {
        Lista listaEstudiantes= new Lista();
        
        Estudiante estudianteUno= new Estudiante("Alex", "M", 5);
        listaEstudiantes.insertarEstudiante(estudianteUno);
        
        Estudiante estudianteDos= new Estudiante("Sharon", "F", 9);
        listaEstudiantes.insertarEstudiante(estudianteDos);
        
        Estudiante estudianteTres= new Estudiante("Briam", "m", 2);
        listaEstudiantes.insertarEstudiante(estudianteTres);
        
        Estudiante estudianteCuatro= new Estudiante("Aleja", "f", 4);
        listaEstudiantes.insertarEstudiante(estudianteCuatro);
        
        Estudiante estudianteCinco= new Estudiante("Juan", "M", 1);
        listaEstudiantes.insertarEstudiante(estudianteCinco);
        
        System.out.println(listaEstudiantes.totalLibros()+"\n");
        
        System.out.println(listaEstudiantes.promedioLibros()+"\n");
        
        System.out.println(listaEstudiantes.mayorLibConsult()+"\n");
        
        System.out.println(listaEstudiantes.totalLibSex()+"\n");
        
        listaEstudiantes.estudiantesMayorProm();
    }
    
}
