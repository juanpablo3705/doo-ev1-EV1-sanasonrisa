public class Ortodoncia extends Tratamiento implements Financiable {


    // atributos
    private String tipoBrackets;
    private boolean tienePlanDental;
    private boolean tieneFinanciamiento;

    // constructor sin parametros
    public Ortodoncia() {
    }

    // constructor con parametros
    public Ortodoncia(String descripcion, int numeroSesiones, int duracion, String tipoBrackets, boolean tienePlanDental) {
        super(descripcion, numeroSesiones, duracion);
        this.setTipoBrackets(tipoBrackets);
        this.setTienePlanDental(tienePlanDental);
        this.setTieneFinanciamiento(false);
    }

    // getters y setters
    public String getTipoBrackets() {
        return tipoBrackets;
    }

    public void setTipoBrackets(String tipoBrackets) {
        this.tipoBrackets = tipoBrackets;
    }

    public boolean isTienePlanDental() {
        return tienePlanDental;
    }

    public void setTienePlanDental(boolean tienePlanDental) {
        this.tienePlanDental = tienePlanDental;
    }

    public boolean isTieneFinanciamiento() {
        return tieneFinanciamiento;
    }

    public void setTieneFinanciamiento(boolean tieneFinanciamiento) {
        this.tieneFinanciamiento = tieneFinanciamiento;
    }

    // metodos implementados desde superclase
    @Override
    public double costoTratamiento() {
        double costoBase = 85000;
        if (!tienePlanDental) {
            costoBase = costoBase * 1.15;
        }
        return costoBase;
    }

    @Override
    public String obtenerDetalle() {
        return  "Tipo: Ortodoncia | " + "Descripción: " + descripcion + " | Sesiones: " + numeroSesiones + " | Duración: " + duracion + " min" + " | Brackets: " + tipoBrackets + " | Plan dental previo: " + (tienePlanDental ? "Si" : "No") + " | Financiamiento activo: " + (tieneFinanciamiento ? "Si" : "No") + " | Costo tratamiento: $" + Math.round(costoTratamiento());
    }

    // metodos implementados desde interfaz
    @Override
    public boolean tieneFinanciamiento() {
        return tieneFinanciamiento;
    }

    @Override
    public void activarFinanciamiento() {
        this.setTieneFinanciamiento(true);
    }
}
