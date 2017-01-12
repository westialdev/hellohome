import com.leadtech.cv.dev.home.Hello;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloTest
{
    @Test
    public void testHello()
    {
        Hello hello = new Hello();
        String expected = "Sabelótodo, Manolito";
        String result = hello.invoke(
                "Manolito",
                "Sabelótodo",
                "ID1234567890"
        );

        assertEquals(expected, result);
    }
}
