package Control;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Utils {
    static NumberFormat FormatandoValores = new DecimalFormat("R$#,##0.00");

    public static String doubleToString(Double valor) {
        return FormatandoValores.format(valor);
    }
}
