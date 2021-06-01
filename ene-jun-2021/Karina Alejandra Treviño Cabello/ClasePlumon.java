public class Plumon {
		

		    private String colorplumon;
		    private int dilucion;
		

		    public Plumon(){
		       colorplumon = " ";
		      dilucion= 0;
		    }
		

		    public Plumon(String s, int x){
                        colorplumon = s;
		        dilucion= x;
		    }
		

		    public void setNombrePlumon(String s){
		      colorplumon = s;
		    }
		

		    public String getNombrePlumon(){
		        return colorplumon;
		    }
		

		    public void setDilucion(int x){
		        dilucion= x;
		    }
		

		    public int getDilucion(){
		        return dilucion;
		    }
		

		    public String toString(){
		        return colorplumon+ " ";
		    }
		}
