import org.junit.Test;

public class CajaTest {

    @Test
    public void Test01CreoUnaCaja () {
        Caja caja = new Caja(3,2,6);
        System.out.println(caja.toString());
        System.out.println(caja.Volumen());
    }
}
