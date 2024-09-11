package bibliotecaestudiantes;

import java.util.Scanner;

public class Lista {

    private Nodo primero;
    Scanner sc = new Scanner(System.in);

    public Lista() {
    }

    public Lista(Nodo primero) {
        this.primero = null;
    }

    public void insertarEstudiante(Estudiante estudiante) {
        Nodo nuevoNodo = new Nodo(estudiante, primero);
        primero = nuevoNodo;
    }

    public String totalLibros() {
        Nodo actual = primero;
        int total = 0;
        while (actual != null) {
            total += actual.getEstudiante().getCantLib();
            actual = actual.getNext();
        }
        return "📋 El total de libros consultados por todos los usuarios es: " + total;
    }

    public double promedioLibros() {
        Nodo actual = primero;
        double total = 0;
        int cont = 0;
        double promedio = 0;

        while (actual != null) {
            total += actual.getEstudiante().getCantLib();
            cont += 1;
            actual = actual.getNext();
        }
        if (cont > 0) {
            promedio = total / cont;
        }
        System.out.print("📚 El promedio de libros consultados por los estudiantes es: ");
        return promedio;
    }

    public String mayorLibConsult() {
        Nodo actual = primero;
        Nodo sig = actual.getNext();
        int mayorcant = 0;
        while (sig != null) {
            if ((actual.getEstudiante().getCantLib()) > (sig.getEstudiante().getCantLib())) {
                mayorcant = actual.getEstudiante().getCantLib();
            } else if ((sig.getEstudiante().getCantLib()) > (actual.getEstudiante().getCantLib())) {
                mayorcant = sig.getEstudiante().getCantLib();
            } else {
                mayorcant = actual.getEstudiante().getCantLib();
            }
            actual = actual.getNext();
            sig = sig.getNext();
        }
        return "🏆 El mayor número de libros consultados por un estudiante es: " + mayorcant;
    }

    public String totalLibSex() {
        Nodo actual = primero;
        int total = 0;
        System.out.println("🔍 Por favor, ingresa el sexo (M/F) para conocer el total de libros consultados por ese grupo:");
        String buscador = sc.nextLine();
        while (actual != null) {
            if (actual.getEstudiante().getSexo().equalsIgnoreCase(buscador)) {
                total += actual.getEstudiante().getCantLib();
            }
            actual = actual.getNext();
        }
        return "📚 El total de libros consultados por usuarios de sexo " + buscador + " es: " + total;
    }

    public void estudiantesMayorProm() {
        Nodo actual = primero;
        double promedio = promedioLibros();
        System.out.print(promedio+"\n");
        boolean a=false;
        System.out.println("\n🌟 Estudiantes que han consultado más libros que el promedio:");
        while (actual != null) {
            if ((actual.getEstudiante().getCantLib()) > promedio) {
                System.out.println("\n"+actual.getEstudiante().toString());
                a=true;
            }
            actual = actual.getNext();
        }
        if (!a) {
            System.out.println("⚠️ No hay ningún estudiante que haya consultado más libros que el promedio.");
        }
    }
}
