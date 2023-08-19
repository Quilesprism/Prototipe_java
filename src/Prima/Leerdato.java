package Prima;


import java.time.LocalDate;
import java.util.Scanner;

public class Leerdato {
            public void V(){
            convertir nunu=new convertir();
            Scanner sc = new Scanner(System.in);
          
        System.out.print("Introduzca el tamaño del vector: ");
        int n = Integer.parseInt(sc.nextLine());
        Trabajador vec[]= new Trabajador[n];
      
        for(int i=0; i<vec.length; i++){
            vec[i]=new Trabajador();
      
            System.out.println("Ingrese Nombre");
            vec[i].setNombre(sc.next()); 
            
            System.out.println("Ingrese salario");
            vec[i].setSalario_B(sc.nextInt());
            
            System.out.println("ingrese fecha en la que entro a trabajar");
            vec[i].setFechaI(sc.next());

            System.out.println("Ingrese la fecha actual");
           vec[i].setFechaA(sc.next());

            int resultadoPrima=(vec[i].getSalario_B()*nunu.ConveritrDate(vec[i].getFechaI(), vec[i].getFechaA()))/360;
            vec[i].setPrima(resultadoPrima);
        }
        Ver(vec);
        }
        public void Ver(Trabajador vec[]){
        for(int i=0; i<vec.length;i++){
           
            System.out.println("El nombre es: "+ vec[i].getNombre());
            System.out.println("El sueldo base es: "+ vec[i].getSalario_B());
            System.out.println("La fecha de inicio a trabajar es: "+vec[i].getFechaI());
            System.out.println("La prima es: "+ vec[i].getPrima());
          
        }
    }
}
