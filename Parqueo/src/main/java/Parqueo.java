import java.util.ArrayList;

public class Parqueo {
    private ArrayList<Vehiculo> vehiculos;
    public Parqueo() {
        this.vehiculos = new ArrayList<Vehiculo>();
    }
    //Metodo para agregar un vehiculo al parqueo
    public void agregarVehiculo(String tipo,String placa){
        if(tipo.equals("Carro"))
            this.vehiculos.add(new Vehiculo(tipo,placa,1500));
        if(tipo.equals("Motocicleta"))
            this.vehiculos.add(new Vehiculo(tipo,placa,800));
        if(tipo.equals("Camion"))
            this.vehiculos.add(new Vehiculo(tipo,placa,2500));
        if(tipo.equals("Bicicleta"))
            this.vehiculos.add(new Vehiculo(tipo,placa,500));
        if(tipo.equals("Otro"))
            this.vehiculos.add(new Vehiculo(tipo,placa,2000));
    }
    //Buscamos un vehiculo por su placa
    public Object buscarPorPlaca(String placa){
        for(Vehiculo vehiculo: this.vehiculos){
            if(vehiculo.getPlaca().equals(placa))
                return vehiculo;
        }
        return null;
    }
    public String MensajeSalida(String placa) {
        for (Vehiculo vehiculo : this.vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                return vehiculo.getMensajeDeSalida();
            }
        }
        return "";
    }

    //Eliminamos un vehiculo dada su placa
    public Object eliminarVehiculo(String placa){
        for(Vehiculo vehiculo: this.vehiculos){
            if(vehiculo.getPlaca().equals(placa)) {
                this.vehiculos.remove(vehiculo);
                return vehiculo;
            }
        }
        return null;
    }
    //Actualizamos el descuento de los vehiculos dado su tipo
    public void actualizarDescuento(String tipo, int descuento){
        for(Vehiculo vehiculo: this.vehiculos){
            if(vehiculo.getTipo().equals(tipo)) {
                vehiculo.setDescuento(descuento);
            }
        }
    }
    //Sumamos Horas a un vehiculo dada su placa
    public int sumarHoras(String placa, int horas){
        for(Vehiculo vehiculo: this.vehiculos){
            if(vehiculo.getPlaca().equals(placa)) {
                vehiculo.setHoras(vehiculo.getHoras()+horas);
                return vehiculo.getHoras();
            }
        }
        return 1;
    }
}
