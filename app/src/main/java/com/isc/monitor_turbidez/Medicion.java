package com.isc.monitor_turbidez;

public class Medicion {
    public String fecha;
    public int valor;
    public Medicion(){
        fecha="";
        valor=0;
    }
    public Medicion(String fecha,int valor){
        this.fecha=fecha;
        this.valor=valor;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getFecha() {
        return fecha;
    }

    public int getValor() {
        return valor;
    }
}
