package tests;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTests {
    @Test
    public void FelineTest(){
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void FelineTest2(){
        Feline feline = new Feline();
        Assert.assertEquals(2, feline.getKittens(2));
    }

    @Test
    public void FelineTest3(){
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }
    @Test
    public void FelineTest4() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void FelineTest5() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals(List.of("Трава", "Различные растения"), feline.getFood("Травоядное"));
    }

    @Test(expected = Exception.class)
    public void FelineTest6() throws Exception {
        Feline feline = new Feline();
        feline.getFood("123");
    }
}
