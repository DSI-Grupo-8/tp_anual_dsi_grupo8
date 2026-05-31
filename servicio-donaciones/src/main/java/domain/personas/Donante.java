package domain.personas; 

import java.util.List;

public class Donante {
    private Persona persona;
    public List<Donacion> donaciones;

    public Donante(Persona persona) {
        this.persona = persona;
    }

    public Persona getPersona() {
        return persona;
    }
}
