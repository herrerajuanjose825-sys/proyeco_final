import java.util.LinkedList;
import java.util.Scanner;
public class metodos_vehiculo {
    
    public  LinkedList<vehiculo> llena_vehiculos (LinkedList<vehiculo> l , Scanner sc){
        boolean segir=true;

        while (segir){
            vehiculo v = new vehiculo();
            System.out.println("Ingrese los datos del vehiculo");
            System.out.println("Placa");
            v.setPlaca(sc.next());
            System.out.println("Marca");
            v.setMarca(sc.next());
            System.out.println("Modelo");
            v.setModelo(sc.nextInt());
            System.out.println("Precio");
            v.setPrecio(sc.nextFloat());
            System.out.println("Estado");
            v.setEstado(sc.next());
            l.add(v);

            System.out.println("Desea ingresar otro vehiculo 1) si  2) no ");
            int opt=sc.nextInt();

            if(opt!=2){
                segir=false;
            }
        }
        return l;
    }

    public LinkedList<vehiculo> modificar_vehiculo (LinkedList<vehiculo> l , Scanner sc){
        boolean bandera=true;
        while(bandera){
            if(l.isEmpty()){
                System.out.println("L lista esta vacia, ingrese valores");
                bandera=false;
                break;
            }
            System.out.println("Ingrese la placa del vehiculo a modificar");
            String p=sc.next();
            for (vehiculo o : l) {
                if(o.getPlaca().equals(p)){
                    System.out.println("Ingrese los datos del vehiculo");
                    System.out.println("Placa");
                    o.setPlaca(sc.next());
                    System.out.println("Marca");
                    o.setMarca(sc.next());
                    System.out.println("Modelo");
                    o.setModelo(sc.nextInt());
                    System.out.println("Precio");
                    o.setPrecio(sc.nextFloat());
                    System.out.println("Estado");
                    o.setEstado(sc.next());
                    System.out.println("vehiculo modificado");
                    bandera=false;
                    }
                    else{
                        System.out.println("Placa no encontrada ingrese una placa registrada");
                    }
            }

        }
        return l;
    }
}
