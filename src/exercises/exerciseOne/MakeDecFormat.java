package exercises.exerciseOne;
import java.text.DecimalFormat;
public final class MakeDecFormat {
    public static double formatDecNumb(double numb){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return Double.parseDouble(decimalFormat.format(numb));

    }
}
