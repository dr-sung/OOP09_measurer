
public class Data {

    public static double average(Object[] objects, Measurer m) {
        
        double sum = 0;
        for (Object o : objects) {
            sum = sum + m.measure(o);
        }
        if (objects.length > 0) {
            return sum / objects.length;
        } else {
            return 0;
        }
        
    }

}
