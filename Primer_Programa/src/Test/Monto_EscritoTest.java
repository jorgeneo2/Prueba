package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import paquete.Monto_Escrito;

class Monto_EscritoTest extends Monto_Escrito {
	
	

	@Test
	void testUnidades() {
		Monto_Escrito unidades = new Monto_Escrito();
		String resultadoEsperado = "cero";
		String resultadoObtenido = unidades.calcularUnidad(0);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

}
