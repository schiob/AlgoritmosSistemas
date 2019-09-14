import java.util.Scanner;

public class Dinos {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Cuantos Dinosaurios tienes?: ");
		int num=s.nextInt();
		String nombre;
		String arr[] = new String[num];
	//se_almacenan_los_nombres_en_un_arreglo
		int o = 0;
		for(int i=0;i<num;i++)
		{
			o=i+1;
			System.out.print("\n"+o+"° Nombre: ");
			 nombre=s.next();
			 arr[i]=nombre;
		}//cierre del for random
		
   //Se_busca_el_nombre_con_los_caracteres_mas_pequeño     
		for(int i=1;i < num;i++)
		{
			String temp=arr[i];//se_asigna_el_elemento_a_una_variable_temporal
			for(int j=i-1; j >= 0;j--)
			{
				if(temp.length() < arr[j].length())//se_compara_si_la_variable_tempral_es_mas_pequeña
				{
					//segenera_los_Cambios_de_las_pocisiones_segun_su_loguitud
					arr[j+1]=arr[j];
					arr[j]=temp;	
				}
			}//primer_ciclo
			
		}//segundo_ciclo
		
		
	//se_imprime_los_resutados	
		System.out.println("\nOrdenado por Insertion Sort");
		for(int i=0; i <num ;i++)
		{
			o=i+1;
			System.out.println(o+"° [ "+arr[i]+" ] --> "+arr[i].length()+": Letras");
		}

    }//cierre del main
    
}//cierre de clase