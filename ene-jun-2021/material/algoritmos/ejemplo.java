import jdk.javadoc.internal.doclets.formats.html.SystemPropertiesWriter;

public class ejemplo{
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        for(int i = 0; i < 10; i++){ // O(1)
            System.out.println("holi");
        }
    }