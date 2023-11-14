public class balon {
    String nombre;
    String color;
    String textura;
    public static void main(String[] args) {

        balon balon1 = new balon();

        balon1.nombre = "micro";
        balon1.color = "verde";
        balon1.textura = "caucho";

        System.out.println("el nombre de balon1 es: "+balon1.nombre);
        System.out.println("el color de balon1 es: "+balon1.color);
        System.out.println("la textura de balon1 es: "+balon1.textura);


        balon balon2 = new balon();

        balon2.nombre = "futbol 11";
        balon2.color = "blanco";
        balon2.textura = "cuero";

        System.out.println("\nel nombre del balon2 es: "+balon2.nombre);
        System.out.println("el color del balon2 es: "+balon2.color);
        System.out.println("la textura del balon2 es: "+balon2.textura);


        balon balon3 = new balon();

        balon3.nombre = "basquet";
        balon3.color = "naranja";
        balon3.textura = "caucho";

        System.out.println("\nel nombre del balon3 es: "+balon3.nombre);
        System.out.println("el color del balon3 es: "+balon3.color);
        System.out.println("la textura del balon3 es: "+balon3.textura);



    }
}
