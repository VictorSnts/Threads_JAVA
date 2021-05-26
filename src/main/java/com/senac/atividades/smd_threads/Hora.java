/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.atividades.smd_threads;

import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author victor
 */
public class Hora {
    
    public static void getHora(String msg){
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
        int hora = calendar.get(Calendar.HOUR_OF_DAY);
        int minuto = calendar.get(Calendar.MINUTE);
        int segundo = calendar.get(Calendar.SECOND);
        int milisegundo = calendar.get(Calendar.MILLISECOND);
        System.out.println(msg + ": " + hora +":" + minuto + ":" + segundo + ":" + milisegundo);
    }
    
        
}
