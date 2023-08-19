package Prima;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * En java 8 se puede encontrar unos tipos de datos o Apis llamados:LocalDate, LocalTime y LocalDateTime
 * captura fecha actual: LocalDate date= LocalDate.now();
 * 2. Asigna una fecha a la variable LocalDate date=LocalDate.of(2022,4,3);
 * LocalDate date= LocalDate.parse("2022-4-3");
 * 3. Sumas dias a una fecha
 * LocaDate=LocalDate.parse("2020
 * slario*diastrabajados/360
 */
import java.time.LocalDate;
public class Trabajador {
    
    private String Nombre; 

    private int salario_B;
    private LocalDate fechaI;
    private LocalDate fechaA;

    private int prima;

    public Trabajador() {
    }
    

    public String getNombre() {
        return Nombre;
    }


    public int getSalario_B() {
        return salario_B;
    }


    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


    public void setSalario_B(int salario_B) {
        this.salario_B = salario_B;
    }

    public int getPrima() {
        return prima;
    }

    public LocalDate getFechaI() {
        return fechaI;
    }

    public LocalDate getFechaA() {
        return fechaA;
    }

    public void setFechaI(String fechaI) {
        this.fechaI = LocalDate.now();
    }

    public void setFechaA(String fechaA) {
        this.fechaA = LocalDate.now();
    }

    public void setPrima(int prima) {
        this.prima = prima;
    }

 
    
}
