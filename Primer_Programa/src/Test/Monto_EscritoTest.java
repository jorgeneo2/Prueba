package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import paquete.Monto_Escrito;

class Monto_EscritoTest extends Monto_Escrito {
	
	

	@Test
	void testUnidades() {
		Monto_Escrito unidades = new Monto_Escrito();
		String resultadoEsperado = "uno";
		String resultadoObtenido = unidades.calcularUnidad(1);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	void testEspecial() {
		Monto_Escrito especial = new Monto_Escrito();
		String resultadoEsperado = "once";
		String resultadoObtenido = especial.calcularEspecial(11);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testDecenas() {
		Monto_Escrito decenas = new Monto_Escrito();
		String resultadoEsperado = "veinte";
		String resultadoObtenido = decenas.calcularDecenas(20);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	@Test
	void testCentenas() {
		Monto_Escrito centenas = new Monto_Escrito();
		String resultadoEsperado = "cuatroscientos diez";
		String resultadoObtenido = centenas.calcularCentenas(410);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	@Test
	void testunidMil() {
		Monto_Escrito unimil = new Monto_Escrito();
		String resultadoEsperado = "dos mil";
		String resultadoObtenido = unimil.calcularunidMil(2000);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
}
