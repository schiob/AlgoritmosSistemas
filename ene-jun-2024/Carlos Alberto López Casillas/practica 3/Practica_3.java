
public class Practica_3 {

	public static void main(String[] args) {
		String[] medicamentos = {"ASPIRI","PARACETAMOL","IBUPROFENO","CANDESARTAN HIDROCLOROTIAZIDA ALTER","AMOXICILINA","OMEPRAZOL","LORATADINA",
	            "DICLOFENACO","METFORMINA","TRAMADOL"};
	        selectionSort(medicamentos);


	        for (String medicamento : medicamentos) {
	            System.out.println(medicamento);
	        }
	    }

	    public static void selectionSort(String[] arr) {
	        int n = arr.length;

	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j].length() < arr[minIndex].length()) {
	                    minIndex = j;
	                }
	            }
	           
	            String temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }
	    }

	}

