import java.util.HashMap;
import java.util.Map; //Está libreria nos permitira trabajar con los métodos Map
import java.util.Scanner; //Está libreria nos permite realizar estructuras HashMap, y métodos inlcuidos

public class Agenda{

    public static void main(String[] args) {
        Map <String, Contacto> agenda = new HashMap<>();
        Scanner sc = new Scanner(System.in); 
        int opcion;

        do { 
            System.out.println("\n ------Agenda de contactos------ \n");
            System.out.println("1.- Ver todos los contactos");
            System.out.println("2.- Agregar contacto personal");
            System.out.println("3.- Agregar contacto de trabajo");
            System.out.println("4.- Buscar contacto por alias");
            System.out.println("5.- Eliminar contacto por alias");
            System.out.println("6.- Cargar Contactos por archivo");
            System.out.println("7.- Salir");
            System.out.println("Ingrese el número de la opción requerida: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    if (agenda.isEmpty()) {
                        System.out.println("Actualmente no existen contactos en tu agenda");
                    }
                    else{
                        for(Map.Entry<String, Contacto> entry: agenda.entrySet()){ //<key, value>
                            System.out.println("Alias: "+ entry.getKey()+ "->"+ entry.getValue().toString());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ingresa la información solicitada");
                    System.out.println("Alias: ");
                    String aliasP = sc.nextLine();
                    System.out.println("Nombre: ");
                    String nombreP = sc.nextLine();
                    System.out.println("Apellido: ");
                    String apellidoP = sc.nextLine();
                    System.out.println("correo: ");
                    String correoP = sc.nextLine();
                    System.out.println("telefono: ");
                    String telefonoP = sc.nextLine();
                    System.out.println("Cumpleaños: (DD/MM/AAAA)");
                    String cumpleañosP = sc.nextLine();

                    ContactoPersonal cp = new ContactoPersonal(nombreP, apellidoP, correoP, telefonoP, cumpleañosP);
                    agenda.put(aliasP,cp);
                    System.out.println("Contacto personal agregado");
                    break;
                case 3: 
                     System.out.println("Ingresa la información solicitada");
                    System.out.println("Alias: ");
                    String aliasT = sc.nextLine();
                    System.out.println("Nombre: ");
                    String nombreT = sc.nextLine();
                    System.out.println("Apellido: ");
                    String apellidoT = sc.nextLine();
                    System.out.println("correo: ");
                    String correoT = sc.nextLine();
                    System.out.println("telefono: ");
                    String telefonoT = sc.nextLine();
                    System.out.println("Empresa: ");
                    String empresaT = sc.nextLine();
                    System.out.println("Puesto: ");
                    String puestoT = sc.nextLine();

                    ContactoDeTrabajo ct = new ContactoDeTrabajo(nombreT, apellidoT, correoT, telefonoT, empresaT, puestoT);
                    agenda.put(aliasT,ct);
                    System.out.println("Contacto de trabajo agregado");
                    break;
                case 4:
                    System.out.println("Busqueda de contactos por Alias");
                    if (agenda.isEmpty()) {
                        System.out.println("Actualmente no existen contactos en tu agenda");                        
                    }
                    else{
                        System.out.println("Ingrese el alias del contacto: ");
                        String aliasContacto = sc.nextLine();
                        /*
                        Contacto c = agenda.get(aliasContacto);
                        if (c!= null) {
                            System.out.println("Contacto:" + c );
                        }
                        else{
                            System.out.println("El alias no existe");
                        }
                        */
                        if(agenda.containsKey(aliasContacto)){
                            Contacto c = agenda.get(aliasContacto);
                            System.out.println("Contacto:" + c );
                        }
                        else{
                            System.out.println("El alias no existe");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Eliminar de contactos por Alias");
                    if (agenda.isEmpty()) {
                        System.out.println("Actualmente no existen contactos en tu agenda");                        
                    }
                    else{
                        System.out.println("Ingrese el alias del contacto a eliminar: ");
                        String aliasContacto = sc.nextLine();

                        if(agenda.containsKey(aliasContacto)){
                            Contacto c = agenda.get(aliasContacto);
                            System.out.println("Información del contacto:" + c );
                            System.out.println("Eliminar contacto: 1.- Sí, 2.- No");
                            int opcionE = sc.nextInt();
                            if(opcionE == 1){
                                agenda.remove(aliasContacto);
                                System.out.println("Contacto eliminado");
                            }
                        }
                        else{
                            System.out.println("El alias no existe");
                        }
                    }
                    break;
                case 6:
                    break;
                case 7: 
                    break;
                default:
                    System.out.println("Opción inválida...");
            }

        } while (opcion != 7);
        sc.close();
    }

}

/*
python/python3:

file = open(patharchivo,formatoLectura) "w, a, w+, r"
c = fopen(pathArchivo, formatoLectura);

*/