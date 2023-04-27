import java.io.IOException;

public class toolBox {

    public static double makeDouble(String input){
        double output=0d;

        try{
            output=Double.parseDouble(input);
        } catch (Exception e) {
            System.out.println(input+" isn't a number");
        }
        return output;
    }
}
