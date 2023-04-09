import edu.princeton.cs.stdlib.StdDraw;
import java.awt.*;

/**
 * Taller número 1 de Programación Avanzada.
 *
 * @author Alexis Sepúlveda Zamora
 */
public class Main {
    public static void main(String[] args) {
        Linea();
    }
    /**
     * Subprograma que realiza toda la ejecución de código.
     */
    public static void Linea () {
        //Se setean los valores máximos y mínimos de el área en que los elementos van a interactuar.
        double min = -1.0;
        double max = 1.0;

        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);
        StdDraw.enableDoubleBuffering();

        //Definición de la máxima área que alcanza la primera linea.
        double x0 = min + (max - min) * Math.random();
        double y0 = min + (max - min) * Math.random();

        double x1 = min + (max - min) * Math.random();
        double y1 = min + (max - min) * Math.random();

        //Velocidades de las lineas.
        double vx = 0.01 +  (int)(Math.random()*(0.02));
        double vy = 0.02 +  (int)(Math.random()*(0.03));

        //Lista que define todos los colores que pueden tomar las lineas.
        Color[] colores = {Color.WHITE, Color.BLUE, Color.GREEN, Color.RED, Color.CYAN, Color.YELLOW};

        do {
            //Si uno de los puntos de la primera línea toca algún límite de la pantalla, esta rebotará.
            if (Math.abs(x0 + vx) > 1.0 || Math.abs(x1 + vx) > 1.0) {
                vx = -vx;
            }
            if (Math.abs(y0 + vy) > 1.0 || Math.abs(y1 + vy) > 1.0) {
                vy = -vy;
            }

            x0 += vx;
            y0 += vy;
            x1 += vx;
            y1 += vy;

            //Se setea el fondo de la GUI de negro.
            StdDraw.clear(Color.BLACK);

            /*Se generan todas las líneas junto con su randomizador de colores.
            La idea y líneas de código de colores randomizados fue sacada del ejercicio de líneas de la Clase N°3 de Cátedra.
             */
            StdDraw.setPenColor(colores[(int) (Math.random() * colores.length)]);
            StdDraw.line(x0, y0, x1, y1);
            StdDraw.setPenColor(colores[(int) (Math.random() * colores.length)]);
            StdDraw.line(x0 + 0.1, y0, x1 + 0.1, y1);
            StdDraw.setPenColor(colores[(int) (Math.random() * colores.length)]);
            StdDraw.line(x0 + 0.2, y0, x1 + 0.2, y1);
            StdDraw.setPenColor(colores[(int) (Math.random() * colores.length)]);
            StdDraw.line(x0 + 0.3, y0, x1 + 0.3, y1);
            StdDraw.setPenColor(colores[(int) (Math.random() * colores.length)]);
            StdDraw.line(x0 + 0.4, y0, x1 + 0.4, y1);
            StdDraw.setPenColor(colores[(int) (Math.random() * colores.length)]);
            StdDraw.line(x0 + 0.5, y0, x1 + 0.5, y1);
            StdDraw.show();
            StdDraw.pause(200);
        } while (true);
    }
}