public class Automovil
{
    //Attributos
    private String placa;
    private String modelo;
    private String marca;
    private int kilometraje;

        //Constructor
    public Automovil(String marca, String placa, String modelo, int kilometraje)
    {       //Se inicializan los atributos
        this.placa = placa;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.marca = marca;
    }
        //Se crean los metodos de la clase Automovil

    public void encender()
    {
        System.out.println("El automovil se encuentra encendido");
    }

    public void apagar()
    {
        System.out.println("El automovil se encuentra apagado");
    }

        //Metodos get y set
    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getPlaca()
    {
        return placa;
    }

    public void setPlaca(String placa)
    {
        this.placa = placa;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setKilometraje(int kilometraje)
    {
        this.kilometraje = kilometraje;
    }

    public int getKilometraje()
    {
        return kilometraje;
    }

        //override ()

    public String toString()
    {
        return "Automovil{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", kilometraje=" + kilometraje +
                '}';
    }


}
