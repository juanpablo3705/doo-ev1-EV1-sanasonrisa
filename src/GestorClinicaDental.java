import java.util.ArrayList;

public class GestorClinicaDental {

    // constructor lista
    private ArrayList<Tratamiento> listaTratamientos;
    public GestorClinicaDental() {
        listaTratamientos = new ArrayList<>();
    }

    // agregar objetos
    public void agregar(Tratamiento nombreObjeto) {
        listaTratamientos.add(nombreObjeto);
        System.out.println(nombreObjeto.getDescripcion() + " (" + nombreObjeto.getClass().getSimpleName() + ") " + "registrado correctamente.");
    }

    // getter
    public ArrayList<Tratamiento> getListaTratamientos() {
        return listaTratamientos;
    }

    // metodo buscador
    public ArrayList<Tratamiento> buscador (String descripcion) {
        ArrayList<Tratamiento> encontrados = new ArrayList<>();
        for (Tratamiento nombreObjeto : listaTratamientos) {
            if (nombreObjeto.getDescripcion().equalsIgnoreCase(descripcion)) {
                encontrados.add(nombreObjeto);
            }
        }
        return encontrados;
    }

}
