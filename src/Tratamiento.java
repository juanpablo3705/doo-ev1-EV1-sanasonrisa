public abstract class Tratamiento {

    // atributos
    protected String descripcion;
    protected int numeroSesiones;
    protected int duracion;

    // constructor sin parametros
    public Tratamiento() {
    }

    // constructor con parametros
    public Tratamiento(String descripcion, int numeroSesiones, int duracion) {
        this.setDescripcion(descripcion);
        this.setNumeroSesiones(numeroSesiones);
        this.setDuracion(duracion);
    }

    // getters y setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion == null || descripcion.isBlank()) {
            throw new IllegalArgumentException("Error, la descripción no puede ser nula ni vacía.");
        }
        this.descripcion = descripcion;
    }

    public int getNumeroSesiones() {
        return numeroSesiones;
    }

    public void setNumeroSesiones(int numeroSesiones) {
        if (numeroSesiones < 1 || numeroSesiones > 12) {
            throw new IllegalArgumentException("Error, el número de sesiones debe ser entre 1 y 12.");
        }
        this.numeroSesiones = numeroSesiones;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if (duracion <= 0) {
            throw new IllegalArgumentException("Error, la duración debe ser un valor mayor que cero.");
        }
        this.duracion = duracion;
    }

    // to string segun enunciado (modificar)
    @Override
    public String toString() {
        return "Descripcion: " + descripcion + " | Sesiones: " + numeroSesiones;
    }

    // metodo funcional
    public abstract double costoTratamiento();

    // metodo obtener detalle
    public abstract String obtenerDetalle();



















    // main: try { ... } catch(ill... ex) { sout("erro" + ex.getmessage()), crear objs, aplicar metodo de infz,
    // registrar datos cg gestor = new cg() {; gestor.agreagar(obj)
    // buscar for (cp nomobj : gestor.buscador(codigo s/g") { sout (nomobjeto.obtenerdetalle)
    // listar for (cp nombreobjeto :  gestor.getnombrelista()) { sout nombobj


}
