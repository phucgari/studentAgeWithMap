import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Map<String,Integer> map=new HashMap<>();
    @BeforeEach
    void init(){
        Main.generateStudents(map);
    }
    @Test
    void testGenerator(){
        assertEquals(30,map.get("Smith"));
        assertEquals(31,map.get("Anderson"));
        assertEquals(29,map.get("Lewis"));
        assertEquals(29,map.get("Cook"));
    }

}