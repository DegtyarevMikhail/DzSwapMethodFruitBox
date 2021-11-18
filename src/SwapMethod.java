import java.util.ArrayList;
import java.util.Arrays;

public class SwapMethod {
    static void swapObj(Object[] array, int firstIndex, int secondIndex) {
        Object oneVal = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = oneVal;
    }


    static <T> ArrayList<T> convertToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}
