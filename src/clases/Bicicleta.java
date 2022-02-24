package clases;

public class Bicicleta {
  
//   Campos 
    private String modelo;
    private int rodado;
    private double precio;

//   Constructor 
    public Bicicleta(String modelo, int rodado, double precio) {
        this.modelo = modelo;
        this.rodado = rodado;
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bicicleta{modelo= ").append(modelo);
        sb.append(", rodado= ").append(rodado);
        sb.append(", precio= ").append(precio);
        sb.append('}');
        return sb.toString();
    }

}
