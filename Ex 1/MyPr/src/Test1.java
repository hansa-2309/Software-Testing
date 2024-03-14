import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1 {

     @Test
    public void checkAdd()
    {
        assertEquals(12, App1.add(5, 7));
    }

    @Test
    public void getmax()
    {
        assertEquals(15, App1.max(new int[]{5,12,7,15,4}));
    }
    @Test
    public void sorting(){
        assertArrayEquals((new int[]{5,15,24,45}), App1.sorting(new int[]{45,24,15,5}));
    }
    
}
