// Importamos las clases necesarias
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

    // Diccionario que almacena las palabras en español e inglés
    private static final HashMap<String, String> DICCIONARIO = new HashMap<>();

    // Objeto para leer la entrada del usuario
    private static final Scanner SCANNER = new Scanner(System.in);

    // Objeto para generar números aleatorios
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        // Se llena el diccionario con 20 palabras
        llenarDiccionario();

        // Contadores para las respuestas correctas e incorrectas
        int correctas = 0, incorrectas = 0;

        // Bucle para mostrar 5 palabras aleatorias
        for (int i = 0; i < 5; i++) {
            // Se obtiene una palabra aleatoria del diccionario
            String palabraEspanol = obtenerPalabraAleatoria();

            // Se muestra la palabra en español y se pide la traducción al inglés
            System.out.println("¿Cuál es la traducción al inglés de \"" + palabraEspanol + "\"?");
            String respuestaUsuario = SCANNER.nextLine();

            // Se obtiene la traducción correcta del diccionario
            String traduccionIngles = DICCIONARIO.get(palabraEspanol);

            // Se comprueba si la respuesta del usuario es correcta
            if (respuestaUsuario.equalsIgnoreCase(traduccionIngles)) {
                // Se incrementa el contador de respuestas correctas
                correctas++;
                // Se muestra un mensaje de respuesta correcta
                System.out.println("¡Correcto!");
            } else {
                // Se incrementa el contador de respuestas incorrectas
                incorrectas++;
                // Se muestra un mensaje de respuesta incorrecta y la traducción correcta
                System.out.println("Incorrecto. La traducción correcta es \"" + traduccionIngles + "\".");
            }
        }

        // Se muestran las estadísticas de las respuestas
        System.out.println("**Resultados:**");
        System.out.println("Correctas: " + correctas);
        System.out.println("Incorrectas: " + incorrectas);
    }

    // Método que llena el diccionario con 20 palabras
    private static void llenarDiccionario() {
        DICCIONARIO.put("nuevo", "new");
        DICCIONARIO.put("trabajo", "work");
        DICCIONARIO.put("Gracias", "Thank you");
        DICCIONARIO.put("Por favor", "Please");
        DICCIONARIO.put("tomar", "take");
        DICCIONARIO.put("¿Hablas español?", "Do you speak Spanish?");
        DICCIONARIO.put("querer", "want");
        DICCIONARIO.put("¿Cómo estás?", "How are you?");
        DICCIONARIO.put("obtener", "get");
        DICCIONARIO.put("¿Qué hora es?", "What time is it?");
        DICCIONARIO.put("nube", "cloud");
        DICCIONARIO.put("¿Cuánto cuesta?", "How much does it cost?");
        DICCIONARIO.put("Me gustaría comprar...", "I would like to buy...");
        DICCIONARIO.put("No entiendo", "I don't understand");
        DICCIONARIO.put("Hasta pronto", "See you soon");
        DICCIONARIO.put("¿Me puedes ayudar?", "Can you help me?");
        DICCIONARIO.put("Lo siento", "I'm sorry");
        DICCIONARIO.put("De nada", "You're welcome");
        DICCIONARIO.put("Hasta luego", "See you later");
        DICCIONARIO.put("abrir", "open");
        DICCIONARIO.put("lavar", "wash");
        DICCIONARIO.put("boca", "mouth");

    }

    // Método que devuelve una palabra aleatoria del diccionario
    private static String obtenerPalabraAleatoria() {
        // Se genera un índice aleatorio
        int indice = RANDOM.nextInt(DICCIONARIO.size());

        // Se devuelve la palabra en la posición del índice aleatorio
        return (String) DICCIONARIO.keySet().toArray()[indice];
    }
}