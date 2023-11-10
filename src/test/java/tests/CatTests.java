package tests;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;

public class CatTests {

    @Test
    public void testCat(){
        Feline feline = Mockito.mock(Feline.class);
        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testCat2() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.eatMeat()).thenReturn(Arrays.asList("раз", "два"));
        Cat cat = new Cat(feline);
        Assert.assertEquals(Arrays.asList("раз", "два"), cat.getFood());
    }
}
