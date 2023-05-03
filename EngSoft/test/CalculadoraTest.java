import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    Calculadora calculadora = new Calculadora();
   

    @Test
    public void diferenca(){
        assertEquals(5,calculadora.diferenca(10, 5));
    }

    @Test
    public void divisao(){
        assertEquals(5,calculadora.divisao(10, 2));
    }

    @Test
    public void produto(){
        assertEquals(10,calculadora.produto(5, 2));
    }

    @Test
    public void soma(){
        assertEquals(5,calculadora.soma(2, 3));
    }

}