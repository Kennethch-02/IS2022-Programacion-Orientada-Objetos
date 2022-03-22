//Practica 1 Parque
//Programacion Orientada a Objetos Grupo 3
//Kenneth Alonso Castillo Herrera 2019062984

public class main {
    public static void main(String[] args) {
        Parqueo parqueo = new Parqueo();
        parqueo.agregarVehiculo("Carro", "CAR01");
        parqueo.agregarVehiculo("Carro", "CAR02");
        parqueo.agregarVehiculo("Carro", "CAR03");

        parqueo.agregarVehiculo("Motocicleta", "MOT01");
        parqueo.agregarVehiculo("Motocicleta", "MOT02");
        parqueo.agregarVehiculo("Motocicleta", "MOT03");

        parqueo.agregarVehiculo("Camion", "CAM01");
        parqueo.agregarVehiculo("Camion", "CAM02");
        parqueo.agregarVehiculo("Camion", "CAM03");

        parqueo.agregarVehiculo("Bicicleta", "BIC01");
        parqueo.agregarVehiculo("Bicicleta", "BIC02");
        parqueo.agregarVehiculo("Bicicleta", "BIC03");

        parqueo.agregarVehiculo("Otro", "OTR01");
        parqueo.agregarVehiculo("Otro", "OTR02");
        parqueo.agregarVehiculo("Otro", "OTR03");

        //Actualizamos el descuento
        System.out.println("Actualizamos el descuento para los camiones y bicicletas");
        parqueo.actualizarDescuento("Camion", 750);
        parqueo.actualizarDescuento("Bicicleta", 100);

        //Sumamos Horas
        System.out.println("Sumamos Horas a los Carros");
        System.out.println(parqueo.sumarHoras("CAR01", 10));
        System.out.println(parqueo.sumarHoras("CAR02", 12));
        System.out.println(parqueo.sumarHoras("CAR03", 14));

        System.out.println("Sumamos Horas a las Motos");
        System.out.println(parqueo.sumarHoras("MOT01", 10));
        System.out.println(parqueo.sumarHoras("MOT02", 8));
        System.out.println(parqueo.sumarHoras("MOT03", 6));

        System.out.println("Sumamos Horas a los Camiones");
        System.out.println(parqueo.sumarHoras("CAM01", 10));
        System.out.println(parqueo.sumarHoras("CAM02", 11));
        System.out.println(parqueo.sumarHoras("CAM03", 12));

        System.out.println("Sumamos Horas a las Bicicletas");
        System.out.println(parqueo.sumarHoras("BIC01", 10));
        System.out.println(parqueo.sumarHoras("BIC02", 15));
        System.out.println(parqueo.sumarHoras("BIC03", 20));

        System.out.println("Sumamos Horas a Otros");
        System.out.println(parqueo.sumarHoras("OTR01", 5));
        System.out.println(parqueo.sumarHoras("OTR02", 6));
        System.out.println(parqueo.sumarHoras("OTR03", 7));

        //Buscamos algunas placas
        System.out.println("Buscamos Placas");

        System.out.println("PLaca BHL098");
        System.out.println(parqueo.buscarPorPlaca("BHL098"));

        System.out.println("PLaca MOT02");
        System.out.println(parqueo.buscarPorPlaca("MOT02"));

        System.out.println("PLaca BIC03");
        System.out.println(parqueo.buscarPorPlaca("BIC03"));

        System.out.println("PLaca CAR04");
        System.out.println(parqueo.buscarPorPlaca("CAR04"));

        //Eliminamos un vehiculo y lo buscamos
        System.out.println("Eliminamos MOT02");
        System.out.println(parqueo.eliminarVehiculo("MOT02"));
        System.out.println("Buscamos a MOT02");
        System.out.println(parqueo.buscarPorPlaca("MOT02"));

        //Obtenemos el mensaje de salida
        System.out.println("Mensaje de salida para CAR02");
        System.out.println(parqueo.MensajeSalida("CAR02"));
        System.out.println();
        System.out.println("Mensaje de Salida para CAM02");
        System.out.println(parqueo.MensajeSalida("CAM02"));
    }
}