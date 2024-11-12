package Examen2Parcial;
import java.util.*;

    class Plumon {
        String color;
        int diluido;
    
        public Plumon(String color, int dilucion) {
        this.color = color;
        this.diluido = dilucion;
        }

        public String toString() {
        return color + "-" + diluido;
        }
    }

  public class Problema1 {
    private static Map<String, Integer> COLOR_ORDEN = Map.of(
        "Rojo", 0,
        "Anaranjado", 1,
        "Amarillo", 2,
        "Verde", 3,
        "Indigo", 4,
        "Violeta", 5,
        "Azul", 6
    );
    private static int compare(Plumon p1, Plumon p2) {
        int Comparacion = Integer.compare(COLOR_ORDEN.get(p1.color), COLOR_ORDEN.get(p2.color));
        
        if (Comparacion == 0) {
            return Integer.compare(p1.diluido, p2.diluido);
        }
        
        return Comparacion;
    }

    private static void quickSort(List<Plumon> plumones, int tonoBajo, int tonoAlto) {
        if (tonoBajo < tonoAlto) {
            int pi = particion(plumones, tonoBajo, tonoAlto);
            quickSort(plumones, tonoBajo, pi - 1);
            quickSort(plumones, pi + 1, tonoAlto);
        }
    }

    private static int particion(List<Plumon> plumones, int tonoBajo, int tonoAlto) {
        Plumon pivote = plumones.get(tonoAlto);
        int i = (tonoBajo - 1); 
        for (int j = tonoBajo; j < tonoAlto; j++) {
            if (compare(plumones.get(j), pivote) <= 0) {
                i++;
                Collections.swap(plumones, i, j);
            }
        }
        Collections.swap(plumones, i + 1, tonoAlto);
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        sc.nextLine(); 
        
        List<Plumon> plumones = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] parts = input.split("-");
            String color = parts[0];
            int dilucion = Integer.parseInt(parts[1]);
            plumones.add(new Plumon(color, dilucion));
        }
        
        quickSort(plumones, 0, plumones.size() - 1);
        for (Plumon p : plumones) 
            System.out.println(p);
        }
    }   