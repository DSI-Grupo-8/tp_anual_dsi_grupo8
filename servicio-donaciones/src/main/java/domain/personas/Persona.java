public abstract class Persona {
    private List<MedioContacto> mediosContacto;

    public Persona() {
        this.mediosContacto = new ArrayList<>();
    }

    public void agregarMedio(MedioContacto medio) {
        mediosContacto.add(medio);
    }

    public void elimiinarMedio(MedioContacto medio) {
        mediosContacto.remove(medio);
    }

    public Optional<MedioContacto> medioPreferido() {
        return mediosContacto.stream()
                .filter(MedioContacto:esPreferido)
                .findFirst();
    } //devuelve el medio de contacto preferido en caso de haber
}