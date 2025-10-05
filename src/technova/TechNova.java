/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package technova;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juanm
 */
public class TechNova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        // Empleados
        Programador emp_pro = null;
        Tester test_emp = null;
        ProjectManager project_emp = null;
        // Listas
        ArrayList<Programador> programadores_list = new ArrayList<>();
        ArrayList<Tester> test_list = new ArrayList<>();
        ArrayList<ProjectManager> proj_list = new ArrayList<>();
        // Aqui iniciamos el bucle con el menu de opciones

        do {
            System.out.println("================ GESTION DE TECHNOVA EMPLEADOS ================");
            System.out.println("1. Ingresar un programador");
            System.out.println("2. Ingresar un Tester");
            System.out.println("3. Ingresar un Product Manager");
            System.out.println("4. Estado programador");
            System.out.println("5. Estado del Tester");
            System.out.println("6. Estado del Product Manager");
            System.out.println("7. Salir");

            System.out.println("Ingresa una opcion;");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("--- Ingresar Programador ---");
                    System.out.print("ID: ");
                    int id_empleado = sc.nextInt();

                    System.out.print("Nombre: ");
                    sc.nextLine(); // Limpiar buffer
                    String nombre_empleado = sc.nextLine();

                    System.out.print("Año de contrato: ");
                    int anio_contrato = sc.nextInt();

                    System.out.print("Sueldo base: ");
                    int sueldo_base_emp = sc.nextInt();

                    emp_pro = new Programador(id_empleado, nombre_empleado, anio_contrato, sueldo_base_emp);
                    if (emp_pro != null) {
                        programadores_list.add(emp_pro);
                        System.out.println("Nuevo Programador creado con exito");
                    } else {
                        System.out.println("Error! Debe rellenar los datos");
                    }

                    break;

                case 2:
                    System.out.println("--- Ingresar Tester ---");
                    System.out.print("ID: ");
                    int id_empleado_t = sc.nextInt();

                    System.out.print("Nombre: ");
                    sc.nextLine(); // Limpiar buffer
                    String nombre_empleado_t = sc.nextLine();

                    System.out.print("Año de contrato: ");
                    int anio_contrato_t = sc.nextInt();

                    System.out.print("Sueldo base: ");
                    int sueldo_base_emp_t = sc.nextInt();

                    test_emp = new Tester(id_empleado_t, nombre_empleado_t, anio_contrato_t, sueldo_base_emp_t);
                    if (test_emp != null) {
                        test_list.add(test_emp);
                        System.out.println("Nuevo Tester creado con exito");
                    } else {
                        System.out.println("Error! Debe rellenar los datos");
                    }

                    break;

                case 3:
                    System.out.println("--- Ingresar Project Manager ---");
                    System.out.print("ID: ");
                    int id_empleado_p = sc.nextInt();

                    System.out.print("Nombre: ");
                    sc.nextLine(); // Limpiar buffer
                    String nombre_empleado_p = sc.nextLine();

                    System.out.print("Año de contrato: ");
                    int anio_contrato_p = sc.nextInt();

                    System.out.print("Sueldo base: ");
                    int sueldo_base_emp_p = sc.nextInt();

                    project_emp = new ProjectManager(id_empleado_p, nombre_empleado_p, anio_contrato_p,
                            sueldo_base_emp_p);
                    if (project_emp != null) {
                        proj_list.add(project_emp);
                        System.out.println("Nuevo Project Manager creado con exito");
                    } else {
                        System.out.println("Error! Debe rellenar los datos");
                    }

                    break;

                case 4:
                    if (programadores_list.isEmpty()) {
                        System.out.println("No hay programadores registrados.");
                    } else {
                        System.out.print("Ingrese el nombre del programador: ");
                        sc.nextLine(); // Limpiar buffer
                        String nombreBuscar = sc.nextLine();

                        boolean encontrado = false;

                        for (Programador prog : programadores_list) {
                            if (prog.getNombre().equalsIgnoreCase(nombreBuscar)) {
                                encontrado = true;

                                System.out.println("\n=== DATOS DEL PROGRAMADOR ===");
                                System.out.println("ID: " + prog.getId());
                                System.out.println("Nombre: " + prog.getNombre());
                                System.out.println("Año Contrato: " + prog.getAnioContrato());
                                System.out.println("Sueldo Base: " + prog.getSueldoBase());
                                System.out.println("Sistemas Completados: " + prog.getSistemas_completados());
                                System.out.println("Bono: " + prog.getBONO());

                                System.out.print("\n¿El programador va a trabajar? (s/n): ");
                                String respuesta = sc.next();

                                if (respuesta.equalsIgnoreCase("s")) {
                                    int nuevoSueldo = prog.programador_trabajando();
                                    System.out.println("Sueldo actualizado: " + nuevoSueldo);
                                    System.out.println("Sistemas completados: " + prog.getSistemas_completados());
                                }

                                break;

                            }
                        }

                        if (!encontrado) {
                            System.out.println("Programador no encontrado.");
                        }
                    }
                    break; // break del case 4

                case 5:
                    if (test_list.isEmpty()) {
                        System.out.println("No Hay tester registrados");

                    } else {
                        System.out.print("Ingrese el nombre del tester: ");
                        sc.nextLine(); // Limpiar buffer
                        String nombreBuscar = sc.nextLine();
                        
                        boolean encontrado = false;
                        
                        for(Tester tes: test_list ){
                            if(tes.getNombre().equalsIgnoreCase(nombreBuscar)){
                                encontrado = true;
                                System.out.println("\n Datos del Tester");
                                System.out.println("ID: " + tes.getId());
                                System.out.println("Nombre; " + tes.getNombre());
                                System.out.println("Año de contrato: " + tes.getAnioContrato());
                                System.out.println("Bugs en contrados en la plataforma: " + tes.getBug_encontrados());
                                System.out.println("Bono: " + tes.getBONO());
                                System.out.println("Sueldo Base: " + tes.getSueldoBase());
                                
                                System.out.println("El tester va a trabajar s/n: ");
                                String respuesta= sc.next();
                                if (respuesta.equalsIgnoreCase("s")){
                                    int nuevo_sueldo= tes.Tester_trabajando();
                                    System.out.println("Sueldo actualizado: " + nuevo_sueldo);
                                    System.out.println("bugs encontrados: " + tes.getBug_encontrados());
                                    

                                }
                            }
                            
                        }

                    }

                    break;

                case 6:
                         if (proj_list.isEmpty()) {
                        System.out.println("No Hay Project Manager registrados");

                    } else {
                        System.out.print("Ingrese el nombre del Project Manager:  ");
                        sc.nextLine(); // Limpiar buffer
                        String nombreBuscar = sc.nextLine();
                        
                        boolean encontrado = false;
                        
                        for(ProjectManager proj: proj_list ){
                            if(proj.getNombre().equalsIgnoreCase(nombreBuscar)){
                                encontrado = true;
                                System.out.println("\n Datos del Project Manager");
                                System.out.println("ID: " + proj.getId());
                                System.out.println("Nombre; " + proj.getNombre());
                                System.out.println("Año de contrato: " + proj.getAnioContrato());
                                System.out.println("Bugs en contrados en la plataforma: " + proj.getProyectos_finalizados());
                                System.out.println("Bono: " + proj.getBONO());
                                System.out.println("Sueldo Base: " + proj.getSueldoBase());
                                
                                System.out.println("El tester va a trabajar s/n: ");
                                String respuesta= sc.next();
                                if (respuesta.equalsIgnoreCase("s")){
                                    int nuevo_sueldo= proj.Product_manager_work();
                                    System.out.println("Sueldo actualizado: " + nuevo_sueldo);
                                    System.out.println("proyectos finalizados: " + proj.getProyectos_finalizados());
                                    

                                }
                            }
                            
                        }

                    }


                    break;
                case 8:
                    // Aqui la idea es mostrar toda la nomina 
                   
                    break;
                     case 9:
                    // Aqui la idea es eliminar empleados
                   
                    break;


                default:
                    System.out.println("Error! Opcion Incorrecta");
                    break;
            }

        } while (option != 7);
    }
}
