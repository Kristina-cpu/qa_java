package tests;

import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;

public class LionTests {

    @Test
    public void lionTest1() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("раз", "два"));
        Lion lion = new Lion("Самец", feline);
        Assert.assertEquals(Arrays.asList("раз", "два"), lion.getFood());
    }

    @Test
    public void lionTest2() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion("Самец", feline);
        Assert.assertEquals(true, lion.doesHaveMane());
    }

    @Test
    public void lionTest3() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion("Самка", feline);
        Assert.assertEquals(false, lion.doesHaveMane());
    }
    @Test(expected = Exception.class)
    public void lionTest4() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion("123", feline);
    }

    @Test
    public void lionTest5() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.getKittens()).thenReturn(2);
        Lion lion = new Lion("Самец", feline);
        Assert.assertEquals(2, lion.getKittens());
    }
}
