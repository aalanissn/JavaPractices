//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//En una empresa de automóviles se necesita tener un inventario digital en él debe contener marca, placa, modelo y kilometraje

public class Main
{
    public static void main(String[] args)
    {
        //Se crean los objetos de la clase automovil

        Automovil auto1 = new Automovil("Ford", "ABC123", "Focus", 123456);
        Automovil auto2 = new Automovil("Chevrolet", "DEF456", "Camaro", 123456);
        Automovil auto3 = new Automovil("Volkswagen", "GHI789", "Golf", 123456);

        //Se muestra Informacion en pantalla

        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);


    }

}