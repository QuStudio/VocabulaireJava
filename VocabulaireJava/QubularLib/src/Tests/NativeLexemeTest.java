package Tests;
import Lexeme.NativeLexeme;
import Morpheme.Morpheme;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by sentosh1ne on 01.04.2016.
 */
public class NativeLexemeTest {

   NativeLexeme.UsageType usage = NativeLexeme.UsageType.General;

    @Test
    public void testNativeLexemeUsage(){
        assertEquals(2,usage.getPriority());
    }


}
