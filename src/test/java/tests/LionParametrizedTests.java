package tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;


@RunWith(Parameterized.class)
public class LionParametrizedTests {

    private List<String> list;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { Arrays.asList("птица", "мышь") },
                {Arrays.asList("ананас") },
                { Arrays.asList("птица", "мышь", "млекопетающее") }
        });
    }
    public LionParametrizedTests(List<String> list) {
        this.list = list;
    }

    @Test
    public void lionTest1() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.getFood("Хищник")).thenReturn(list);
        Lion lion = new Lion("Самец", feline);
        Assert.assertEquals(list, lion.getFood());
    }
}
