package utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class BdClienteTest {

    @Mock
    private Connection connection;

    @Mock
    private PreparedStatement stmt;

    @Mock
    private ResultSet rs;

    @Before
    public void setupBeforeEach() throws Exception {
        MockitoAnnotations.openMocks(this);

        when(connection.prepareStatement(anyString())).thenReturn(stmt);
        when(stmt.executeQuery()).thenReturn(rs);
    }

    @Test
    public void shouldReturnTrueWhenCPFExists() throws Exception {
        String cpf = "12345678901";

        when(rs.next()).thenReturn(true).thenReturn(false);
        when(rs.getString("id_cliente")).thenReturn("1");
        when(rs.getString("nome")).thenReturn("Fulano");
        when(rs.getString("data_nasc")).thenReturn("01/01/2000");
        when(rs.getString("sexo")).thenReturn("M");
        when(rs.getString("cpf")).thenReturn("12345678901");
        when(rs.getString("endereco")).thenReturn("Rua 1");
        when(rs.getString("fone")).thenReturn("12345678901");

        BdCliente bdCliente = new BdCliente(connection);
        boolean result = bdCliente.buscaCPF(cpf);

        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenCPFDoesNotExist() throws Exception {
        String cpf = "12345678901";

        when(rs.next()).thenReturn(false);

        BdCliente bdCliente = new BdCliente(connection);
        boolean result = bdCliente.buscaCPF(cpf);

        assertFalse(result);
    }
}
