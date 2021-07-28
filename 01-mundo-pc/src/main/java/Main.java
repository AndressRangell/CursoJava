import controlador.Orden;
import modelos.Computadora;
import modelos.Monitor;
import modelos.Raton;
import modelos.Teclado;

public class Main {

    public static void main(String[] args) {

        //Definimos los periféricos de las computadoras
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        Raton ratonHP = new Raton("bluetooth", "HP");
        Monitor monitorGamer = new Monitor("Gamer", 13);
        Teclado tecladoGamer = new Teclado("bluetooth", "Gamer");
        Raton ratonGamer = new Raton("bluetooth", "Gamer");

        //Armamos las computadoras con sus partes correspondientes
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        Computadora computadoraEconomica = new Computadora("Computadora Económica", monitorHP, tecladoGamer, ratonGamer);

        //Creamos la orden añadiendo los Pcs creados
        Orden orden = new Orden();
        orden.agregarComputadoras(computadoraHP);
        orden.agregarComputadoras(computadoraGamer);
        orden.agregarComputadoras(computadoraEconomica);

        //Mostramos los datos de la orden
        orden.mostrarOrden();

    }

}
