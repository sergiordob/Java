import java.util.Scanner;
import java.util.Locale;
import br.com.classes.*;

public class Exercise_09_06
{
    public static void main (String[] args)
    {
        StopWatch stopwatch = new StopWatch();

        stopwatch.start();

        // Realize alguma tarefa demorada para medir o tempo
        for (int i = 0; i < 900000000; i++) {
            // Simule um trabalho demorado
        }

        stopwatch.stop();

        System.out.printf("Tempo decorrido: %d milissegundos", stopwatch.getElapsedTime());
    }
}
