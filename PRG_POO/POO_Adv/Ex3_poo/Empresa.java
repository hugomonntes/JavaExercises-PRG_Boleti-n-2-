package PRG_POO.POO_Adv.Ex3_poo;

public class Empresa {
    private int ganancias;
    private Directivo directivo;
    private Empleado empleados;

    //#region SET & GET
    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    public int getGanancias() {
        return ganancias;
    }
    //#endregion

    //#region CONSTRUCTORES
    public Empresa(Directivo directivo, Empleado empleados, Empleado empleados2){

    }
}
