package br.com.infnet.ex04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    public void deveIndicarTamanhoCorretoDaListaDeEndereco() {
        User user = new User("usuario teste", "teste@teste.com");
        Address adress = new Address("rua teste", "cidade teste", "estado teste", "zip teste");
        Address adress2 = new Address("rua teste 2", "cidade teste 2", "estado teste 2", "zip teste 2");
        user.addAddress(adress);
        user.addAddress(adress2);
        List<Address> enderecos = user.getAddresses();
        assertEquals(2, enderecos.size());
    }
}
