package Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    private List<Persona> personas;

    public Main() {
        personas = new ArrayList<>();
    }

    // Método para agregar personas a la lista
    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    // Método para retornar la lista de personas
    public List<Persona> obtenerPersonas() {
        return personas;
    }

    // Método principal
    public static void main(String[] args) {
        Main main = new Main();

        //  instancias de Persona y agregarlas a la lista
        main.agregarPersona(new Persona(1, "Anderson", "Yobany", "Perdomo", "Garcia", "Masculino", "1234567890102", 19, "Guatemala"));
        main.agregarPersona(new Persona(2, "Melanie", "Fabiola", "Lopez", "Perdomo", "Femenino", "1234567894334", 14, "Guatemala"));
        main.agregarPersona(new Persona(3, "Melanie", "Naomi", "Perdomo", "Pendiente", "Femenino", "1234567890607", 7, "Guatemala"));
        main.agregarPersona(new Persona(4, "Mateo", "Moise", "Perdomo", "Garcia", "Masculino", "1234567890405", 13, "Guatemala"));
        main.agregarPersona(new Persona(5, "Lupita", "Adriana", "Perdomo", "Pendiente", "Femenino", "1234567890906", 20, "Guatemala"));

         System.out.println("Nombres completos de todas las personas:");
        main.obtenerPersonas().stream()
            .map(Persona::getNombreCompleto)
            .forEach(System.out::println);

        
        List<Persona> mayoresDeEdad = main.obtenerPersonas().stream()
            .filter(persona -> persona.getEdad() >= 18)
            .collect(Collectors.toList());

        
        System.out.println("\nPersonas mayores de edad:");
        mayoresDeEdad.stream()
            .map(Persona::getNombreCompleto)
            .forEach(System.out::println);

        
        Optional<Persona> personaOptional = main.obtenerPersonas().stream()
            .filter(persona -> persona.getEdad() >= 18)
            .filter(persona -> persona.getCiudad().equalsIgnoreCase("Guatemala"))
            .filter(persona -> persona.getPrimerNombre().contains("Lu"))
            .findFirst();

       
        personaOptional.ifPresent(persona -> 
            System.out.println("\nPersona encontrada: " + persona.getNombreCompleto()));
    }
}

