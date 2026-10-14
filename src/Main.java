public class Main {
    public static void main(String [] args) {

        try {

            // crear objetos
            Ortodoncia tratamiento1 = new Ortodoncia("Ortodoncia metalica superior",11,45,"Metálicos",false);
            Ortodoncia tratamiento2 = new Ortodoncia("Ortodoncia estética inferior",10,40,"Estéticos",true);
            Implante tratamiento3 = new Implante("Implante unitario molar",3,90,true);
            Implante tratamiento4 = new Implante("Implante unitario incisivo",2,75,false);

            // aplicar metodo de interfaz
            tratamiento1.activarFinanciamiento();

            // registrar datos
            GestorClinicaDental gestor = new GestorClinicaDental();
            gestor.agregar(tratamiento1);
            gestor.agregar(tratamiento2);
            gestor.agregar(tratamiento3);
            gestor.agregar(tratamiento4);

            // buscar
            System.out.println();
            System.out.println("=== BUSQUEDA POR DESCRIPCION: 'Ortodoncia metálica superior' ===");
            for (Tratamiento nombreObjeto : gestor.buscador("Ortodoncia metalica superior")) {
                System.out.println(nombreObjeto.obtenerDetalle());
            }
            System.out.println("---");

            // listar
            System.out.println();
            System.out.println("=== LISTADO DE TRATAMIENTOS ===");
            for (Tratamiento nombreObjeto : gestor.getListaTratamientos()) {
                System.out.println(nombreObjeto);
            }


        } catch (IllegalArgumentException ex) {
            System.out.println("Error tipo: " + ex.getMessage());
        }
    }
}