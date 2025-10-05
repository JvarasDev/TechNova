/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package technova;

/**
 *
 * @author juanm
 */
public class Tester extends Empleado{
    protected int bug_encontrados;
    protected int BONO;

    public Tester(int id, String nombre, int anioContrato, int sueldoBase) {
        super(id, nombre, anioContrato, sueldoBase);
        this.bug_encontrados = 0;
        this.BONO = 35000;
    }

    public int getBug_encontrados() {
        return bug_encontrados;
    }

    public void setBug_encontrados(int bug_encontrados) {
        this.bug_encontrados = bug_encontrados;
    }

    public int getBONO() {
        return BONO;
    }

    public void setBONO(int BONO) {
        this.BONO = BONO;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

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

    
    public int Tester_trabajando(){
        System.out.println("Tester trabajando / encontrando bugs");
        bug_encontrados += 1;
        
        if(bug_encontrados > 0){
            return sueldoBase + BONO;
        }
        return sueldoBase;
        
    }

   
    
    
    
}
