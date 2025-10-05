package technova;

public class ProjectManager extends Empleado{
    protected int Proyectos_finalizados;
    protected int BONO;

    public ProjectManager(int id, String nombre, int anioContrato, int sueldoBase) {
        super(id, nombre, anioContrato, sueldoBase);
        this.Proyectos_finalizados = 0;
        this.BONO = 200000;
    }

    public int getProyectos_finalizados() {
        return Proyectos_finalizados;
    }

    public void setProyectos_finalizados(int Proyectos_finalizados) {
        this.Proyectos_finalizados = Proyectos_finalizados;
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
    
    public int Product_manager_work(){
        System.out.println("Product manager Trabajando / Finalizado Proyecytos ");
        Proyectos_finalizados += 1;
        
        if(Proyectos_finalizados > 0 ){
            return sueldoBase + BONO;
            
        }
        return sueldoBase;
    }
    
    
}
