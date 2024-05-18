import java.util.*;

public class Practica5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine();
        
        List<String[]> concursantes = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String[] datos = scanner.nextLine().split(" ");
            concursantes.add(datos);
        }
        
        List<String[]> concursantesOrdenados = ordenarOlimpiadas(concursantes);
        
        for (String[] concursante : concursantesOrdenados) {
            System.out.println(concursante[0]);
        }
        
        scanner.close();
    }
    
    public static List<String[]> ordenarOlimpiadas(List<String[]> concursantes) {
        Collections.sort(concursantes, new Comparator<String[]>() {
            @Override
            public int compare(String[] concursante1, String[] concursante2) {
                int oro1 = Integer.parseInt(concursante1[1]);
                int oro2 = Integer.parseInt(concursante2[1]);
                if (oro1 != oro2) {
                    return Integer.compare(oro2, oro1);
                }
                
                int plata1 = Integer.parseInt(concursante1[2]);
                int plata2 = Integer.parseInt(concursante2[2]);
                if (plata1 != plata2) {
                    return Integer.compare(plata2, plata1);
                }
                
                int bronce1 = Integer.parseInt(concursante1[3]);
                int bronce2 = Integer.parseInt(concursante2[3]);
                if (bronce1 != bronce2) {
                    return Integer.compare(bronce2, bronce1);
                }
                
                return concursante1[0].compareTo(concursante2[0]);
            }
        });
        
        return concursantes;
    }
}
