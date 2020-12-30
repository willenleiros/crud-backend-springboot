package br.com.leiros.api.crudbasico.servicos;

import br.com.leiros.api.crudbasico.entidades.Usuario;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UsuarioServicoTests {

    private Usuario usuario;

    @Autowired
    private UsuarioServico servico;

    @BeforeEach
    @DisplayName("Cria o usuário todas as vezes antes de executar um teste")
    void init() {
        Usuario usuario = new Usuario();
        usuario.setApelido("teste");
        usuario.setNome("teste");
        this.usuario = this.servico.salvar(usuario);
    }

    @AfterEach
    @DisplayName("Exclui o usuário todas as vezes depois de executar um teste")
    void tearDown() {
        this.servico.deletar(this.usuario.getCodigo());
    }

    @Test
    @DisplayName("Teste atualizar usuário")
    public void atualizar() {

        this.usuario.setApelido("Ops");
        Usuario usuario = this.servico.atualizar(this.usuario.getCodigo(), this.usuario);
        assertEquals("Ops", usuario.getApelido());

    }

    @Test
    @DisplayName("Teste lista usuários")
    public void listar() {

        assertNotNull(this.servico.listarTodos());

    }


}
