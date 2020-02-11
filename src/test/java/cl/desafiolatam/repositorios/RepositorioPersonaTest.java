package cl.desafiolatam.repositorios;

//import cl.desafiolatam.modelo.Persona;
import repositorios.RepositorioPersona;
import modelo.Persona;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

public class RepositorioPersonaTest {
	private RepositorioPersona repositorioPersona = mock(RepositorioPersona.class);

	@Test
	@DisplayName("given crearPersona mocked method when crearPersona invoked then mocked value returned")
	public void testCrearPersona() {
		Persona pepe = new Persona("1-2", "Pepe");
		//when(repositorioPersona.crearPersona(pepe)).thenReturn("OK");
		when(repositorioPersona.crearPersona(pepe)).thenReturn("OK");
		String crearPersonaRes = repositorioPersona.crearPersona(pepe);
		assertEquals("OK", crearPersonaRes);
		//verify(repositorioPersona).crearPersona(pepe)
		
	}

}
