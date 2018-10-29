/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Carlo Melo
 */
public class Datas {
    
    public String mes;
    public String dia;
    public String ano;
    public String diaDaSemana;
    public String hora;
    
    SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm:ss");
    
    public void lerHora(){
        
        Date horaAtual = new Date();
        hora = horaFormatada.format(horaAtual);
        
    }
    
    public void lerData(){
        
        Date data = new Date();
     
        mes = ""+(1 + data.getMonth());
        dia = ""+data.getDate();
        ano = ""+(1900 + data.getYear());
        diaDaSemana = ""+data.getDay();
        
        switch(data.getDay()){
            case 0 : diaDaSemana = "Domingo";break;
            case 1 : diaDaSemana = "Segunda";break;
            case 2 : diaDaSemana = "Terça";break;
            case 3 : diaDaSemana = "Quarta";break;
            case 4 : diaDaSemana = "Quinta";break;
            case 5 : diaDaSemana = "Sexta";break;
            case 6 : diaDaSemana = "Sábado";break;
        }
        
        switch(data.getMonth()){
            case 0 : mes = "Janeiro";break;
            case 1 : mes = "Fevereiro";break;
            case 2 : mes = "Março";break;
            case 3 : mes = "Abril";break;
            case 4 : mes = "Maio";break;
            case 5 : mes = "Junho";break;
            case 6 : mes = "Julho";break;
            case 7 : mes = "Agosto";break;
            case 8 : mes = "Setembro";break;
            case 9 : mes = "Outubro";break;
            case 10 : mes = "Novembro";break;
            case 11 : mes = "Dezembro";break;
            
            
        }
        
    }
}
