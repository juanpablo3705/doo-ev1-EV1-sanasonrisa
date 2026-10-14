public class Implante extends Tratamiento {

    // atributos
    private boolean incluyeCorona;

    // constructor sin parametros
    public Implante() {
    }

    // constructor con parametros
    public Implante(String descripcion, int numeroSesiones, int duracion, boolean incluyeCorona) {
        super(descripcion, numeroSesiones, duracion);
        this.setIncluyeCorona(incluyeCorona);
    }

    // getters y setters
    public boolean isIncluyeCorona() {
        return incluyeCorona;
    }

    public void setIncluyeCorona(boolean incluyeCorona) {
        this.incluyeCorona = incluyeCorona;
    }

    // metodos implementados de superclase
    @Override
    public double costoTratamiento() {
        double costoBase = 350000;
        if (incluyeCorona) {
            costoBase = costoBase * 1.20;
        }
        return costoBase;
    }

    @Override
    public String obtenerDetalle() {
        return "Descripción: " + descripcion +  " | Sesiones: " + numeroSesiones + " | Duración: " + duracion + " | ¿Incluye corona?: " + (incluyeCorona ? "Si" : "No");
    }
}
