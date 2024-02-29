import java.util.Scanner;

class Practica3 {
    Scanner sc = new Scanner(System.in);

    public void start() {
       System.out.println("Introduce la cantidad de medicinas a organizar:");
       int o = sc.nextInt();
       String a[]=new String[o];
       String b[]=new String[o];

       sc.nextLine();

       for(int i = 0; i < o; i++){
        System.out.println("Introduce la medicina número " + (i+1) + ": ");
        a[i] = sc.nextLine();
       }

       for (int y = 0; y < o; y++) {
        int temp = a[y].length();
        String temp2 = a[y];
        int x = y - 1;

        while (x >= 0 && b[x].length() > temp) {
            b[x + 1] = b[x];
            x--;
        }
        b[x + 1] = temp2;
        }

        sc.close();

        System.out.print("Medicinas ordenadas por longitud: \n");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
    }
}

    public static void main (String [] args){
       Practica3 op = new Practica3();
       op.start();
    }
}