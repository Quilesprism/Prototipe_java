/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prima;


import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;
public class convertir {
    public int ConveritrDate(LocalDate inicio, LocalDate fin){
          long Cdia = DAYS.between(inicio, fin);
          int dias= (int) Cdia;
       return dias;
    }
}
