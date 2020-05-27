package Study;
import java.lang.ref.SoftReference;
import java.util.Arrays;

public class ArrayUtil {
    private static final String ENTER_METHOD = "Method begin";
    private static final String END_METHOD = "Method end";
    private static final String BEGIN_CALCULATE = "Calc begin";
    private static final String END_CALCULATE = "Calc end";

    protected void writeArrayAndSum (int[] array) {
        logEvent(ENTER_METHOD);
        int sum = 0 ;
        logEvent(Arrays.toString(array));
        logEvent(BEGIN_CALCULATE);
        for (int arrayEl : array) {
            sum += arrayEl;
        }
        logEvent(END_CALCULATE);
        logEvent("Sum " + String.valueOf(sum));
        logEvent(END_METHOD);
    }
    protected void doubleArrayElements (int[] array) {
        logEvent(ENTER_METHOD);
        int sum = 0;
        int doubleSum = 0;
        logEvent(Arrays.toString(array));
        logEvent(BEGIN_CALCULATE);
        for (int i= 0; i<array.length; i++) {
            sum += array[i];
            array[i] *= 2;
        }
        logEvent("Sum " + String.valueOf(sum));
        logEvent(Arrays.toString(array));
        for (int arrayElement : array) {
            doubleSum += arrayElement;
        }
        logEvent(END_CALCULATE);
        logEvent("Double sum " + String.valueOf(doubleSum));
        logEvent(END_METHOD);
    }

    private void logEvent (String currentEvent) {
        System.out.println(currentEvent);
        }
        
    }

