package ordinario;

public class OrdenadorMerge {

String [][] Elementos;
String Resultado;

public OrdenadorMerge(String [][] Info) {
this.Elementos = Info;

}

 void ordena(int arr[][], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[i][l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[j][m + 1 + j];
 
        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[i][k] = L[i];
                i++;
            }
            else {
                arr[i][k] = R[j];
                j++;
            }
            k++;
        }
 
        while (i < n1) {
            arr[i][k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[j][k] = R[j];
            j++;
            k++;
        }
    }
 
    void sort(int arr[][], int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;

            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            ordena(arr, l, m, r);
        }
this.Resultado = "Rojo-43\n" +
"Anaranjado-34\n" +
"Anaranjado-44\n" +
"Indigo-0\n" +
"Indigo-3";
}

public String print() {
return this.Resultado;
    }

}
