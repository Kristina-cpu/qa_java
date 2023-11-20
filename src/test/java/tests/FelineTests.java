package tests;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTests {

    private final int DEFAULT_AMOUNT_OF_KITTENS =1;
    private final int NOT_DEFAULT_AMOUNT_OF_KITTENS =2;
    @Test
    public void felineTest1(){
        Feline feline = new Feline();
        Assert.assertEquals(DEFAULT_AMOUNT_OF_KITTENS, feline.getKittens());
    }

    @Test
    public void felineTest2(){
        Feline feline = new Feline();
        Assert.assertEquals(NOT_DEFAULT_AMOUNT_OF_KITTENS, feline.getKittens(NOT_DEFAULT_AMOUNT_OF_KITTENS));
    }

    @Test
    public void felineTest3(){
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }
    @Test
    public void felineTest4() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void felineTest5() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals(List.of("Трава", "Различные растения"), feline.getFood("Травоядное"));
    }

    @Test(expected = Exception.class)
    public void felineTest6() throws Exception {
        Feline feline = new Feline();
        feline.getFood("123");
    }
}
