public class Vehiculo {
    private int monto;
    private String tipo;
    private String placa;
    private int descuento;
    private int horas;

    public Vehiculo(String tipo,String placa,int monto) {
        this.descuento = 0;
        this.tipo = tipo;
        this.placa = placa;
        this.monto = monto;
        this.horas = 0;
    }
    public String getMensajeDeSalida(){
        String Salida;
        if(this.descuento!=0){
            Salida = "Vehiculo placa " + this.placa + " sale con " + this.horas + "\n" +
                    "horas a " + this.monto + " colones por un monto de " + this.monto*this.horas+". \n" +
                    "Se aplica un descuento de " + this.descuento + " por lo que paga " + (this.monto*this.horas-this.descuento);
        }else {
            Salida = "Vehiculo placa " + this.placa + " sale con " + this.horas + "\n" +
                    "horas a " + this.monto + " colones por un monto de " + this.monto*this.horas;
        }
        return Salida;
    }
    public String getTipo() {
        return tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
}
