/*
 *    !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! WARNING !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * Cualquier modificacion se vera afectada los demas clases hijas por eso al momento de modificar algo tambien modificar las demas clases 
 * 
 * Clase padre para los empleados con los datos generales que se necesitan para agregarlos a sistema
 */
package technova;


public class Empleado {
  protected  int id;
  protected  String nombre;
  protected int anioContrato;
  protected  int sueldoBase;

    public Empleado(int id, String nombre, int anioContrato, int sueldoBase) {
        this.id = id;
        this.nombre = nombre;
        this.anioContrato = anioContrato;
        this.sueldoBase = sueldoBase;
    }

    //contructor vacio
    public Empleado() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioContrato() {
        return anioContrato;
    }

    public void setAnioContrato(int anioContrato) {
        this.anioContrato = anioContrato;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", anioContrato=" + anioContrato + ", sueldoBase=" + sueldoBase + '}';
    }
    
    
}
