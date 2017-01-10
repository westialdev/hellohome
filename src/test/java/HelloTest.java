import home.Hello;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloTest
{
    @Test
    public void testHello()
    {
        String expected = Hello.getMessage();
        String result = Hello.invoke();

        assertEquals(expected, result);
    }
}
