import java.util.Scanner;
public class F_To_C {
    public static final  int     MAX_LOOP=5;
    public static void main(String[] args) {
        Scanner scanFaren = new Scanner(System.in);
        double Fahrenheit = 0;
        double Celsius = 0;
        for(int i=0; i<MAX_LOOP; i++){
        System.out.print("\nFahrenheit temperature: ");
            if(scanFaren.hasNextDouble())
                {
                    Fahrenheit=scanFaren.nextDouble();
                    Celsius = ( Fahrenheit- 32.)*5./9.;
                }else{
                System.out.println("Invalid entry = please try again\n");
                System.exit(-1); }
            System.out.println("Celsius temperature: "+Celsius);
        }
        System.exit(-1);
    }
}
