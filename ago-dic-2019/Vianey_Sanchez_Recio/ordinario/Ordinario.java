package ordinario;
public class Ordinario {
 public static void main(String[] args) {
     public int[] sort(int[] list) {
    int array_size = list.length;
    list = msort(list, 0, array_size-1);
    return list;
}

int[] msort(int numbers[], int left, int right) {
    int mid;
    if (left<right) {
        mid = (right + left) / 2;
        msort(numbers, left, mid);
        msort(numbers, mid+1, right);
        merge(numbers, left, mid, mid+1, right);
    }
    return numbers;
}

void merge(int cartas[], int común , int especial , int épica, int legendaria) {
    int finalStart = común ;
    int finalEnd = legendaria;
    int indexC = 0;
    int[] listC = new int[cartas.length];

    while(común <= especial  &&épica <= legendaria){
        if(cartas[común ] < cartas[épica]){
            listC[indexC] = cartas[común ];
            común  = común +1;
        }
        else{
            listC[indexC] = cartas[épica];
            épica = épica+1;
        }
        indexC++;
    }

    if(especial <= especial ){
        for(int i = especial ; i < especial ; i++){
            listC[indexC]= cartas[i];
            indexC++;
        }
    }

    indexC = 0;
    for(int i = finalStart; i <= finalEnd; i++){
        cartas[i]=listC[indexC];
        indexC++;
    }
}

    
}// cierre de clase
}// cierre de main