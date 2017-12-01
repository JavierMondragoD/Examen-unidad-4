/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOSE JAVIER
 */
public class Examenunidad4 {
    Examenunidad4 HojaIzquierda;
    Examenunidad4 HojaDerecha;
    int valor;
    String getHojaIzquierda;

    public Examenunidad4(int valor) {
        this.valor = valor;
    }

    public Examenunidad4 getHojaIzquierda(){
       return HojaIzquierda;
    }
    public void setHojaIzquierda(Examenunidad4 hojaIzquierda){
        HojaIzquierda = hojaIzquierda;
    }
     public Examenunidad4 getHojaDerecha(){
       return HojaDerecha;
    }
    public void setHojaDerecha(Examenunidad4 hojaDerecha){
        HojaDerecha = hojaDerecha;
    }
     public int getValor(){
         return valor;
     }
     public void setValor(int valor){
         this.valor = valor;
}
}