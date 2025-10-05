/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package technova;

/**
 *
 * @author juanm
 */
public class Programador extends Empleado {
    protected int BONO;
    protected int sistemas_completados;

    public Programador(int id, String nombre, int anioContrato, int sueldoBase) {
    super(id, nombre, anioContrato, sueldoBase);
    this.BONO = 100000;
    this.sistemas_completados = 0;
    }

    public Programador() {
    }

    public int getBONO() {
        return BONO;
    }

    public void setBONO(int BONO) {
        this.BONO = BONO;
    }

    public int getSistemas_completados() {
        return sistemas_completados;
    }

    public void setSistemas_completados(int sistemas_completados) {
        this.sistemas_completados = sistemas_completados;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getAnioContrato() {
        return anioContrato;
    }

    @Override
    public void setAnioContrato(int anioContrato) {
        this.anioContrato = anioContrato;
    }

    @Override
    public int getSueldoBase() {
        return sueldoBase;
    }

    @Override
    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public String toString() {
        return "Programador{" + "BONO=" + BONO + ", sistemas_completados=" + sistemas_completados + '}';
    }
    
public int programador_trabajando(){
    System.out.println(nombre + " está programando/implementando funcionalidades");
    sistemas_completados += 1;
    
    if(sistemas_completados > 0){
        return sueldoBase + BONO;
    }
        return sueldoBase;
}


    
    
    
    
}
