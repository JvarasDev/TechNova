/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package technova;

/**
 *
 * @author juanm
 */
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
  
    public class programmers extends Empleado{

        public programmers(int sistemas_terminados, int id, String nombre, int anioContrato, int sueldoBase) {
            super(id, nombre, anioContrato, sueldoBase);
            this.sistemas_terminados = 0;
        }
        
        protected int sistemas_terminados;
        int BONO = 100000;
        
        public int trabajar_programador() {
        System.out.println(nombre + " está programando/implementando funcionalidades");
        sistemas_terminados++;
        
        if(sistemas_terminados > 0  ){
            sueldoBase += BONO;
            
        }else{
            System.out.println("No cumples con los requisitos para el bono!");
            return sueldoBase;
        }
            return 0;
      }
        
    }
    
    public class tester extends Empleado{

        public tester(int bugs_sistemas_encontrados, int id, String nombre, int anioContrato, int sueldoBase) {
            super(id, nombre, anioContrato, sueldoBase);
            this.bugs_sistemas_encontrados = 0;
        }
        
        protected int bugs_sistemas_encontrados;
        int BONO = 35000;
        
        
        
    }
    
    public class ProjectManager{
        protected int Proyectos_finalizados;
        int BONO = 200000;
         
        
    }

  
}
