
import java.awt.Rectangle;


public class AreaMeasurer implements Measurer {

    @Override
    public double measure(Object o) {
        
        assert(o instanceof Rectangle);
        Rectangle r = (Rectangle) o;
        
        return r.getWidth() * r.getHeight();
    }


    
}
