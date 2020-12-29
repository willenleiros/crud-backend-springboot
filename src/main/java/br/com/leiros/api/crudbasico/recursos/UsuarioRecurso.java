package br.com.leiros.api.crudbasico.recursos;

import br.com.leiros.api.crudbasico.entidades.Usuario;
import br.com.leiros.api.crudbasico.recursos.interfaces.IRecurso;
import br.com.leiros.api.crudbasico.servicos.UsuarioServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioRecurso implements IRecurso<Usuario> {

    @Autowired
    private UsuarioServico usuarioServico;

    @Override
    @PostMapping
    public ResponseEntity<Usuario> salvar(@Valid @RequestBody Usuario usuario, HttpServletResponse response) {
        Usuario objetoInserido = this.usuarioServico.salvar(usuario);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(objetoInserido.getCodigo())
                .toUri();
        response.setHeader("Location", uri.toASCIIString());

        return ResponseEntity.created(uri).body(objetoInserido);
    }

    @Override
    @PutMapping("/{codigo}")
    public ResponseEntity<Usuario> atualizar(@PathVariable Long codigo, @Valid @RequestBody Usuario usuario) {
        return ResponseEntity.ok(this.usuarioServico.atualizar(codigo,usuario));
    }

    @Override
    @DeleteMapping("/{codigo}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Long codigo) {
        this.usuarioServico.deletar(codigo);
    }

    @Override
    @GetMapping("/{codigo}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable Long codigo) {
        return ResponseEntity.ok(this.usuarioServico.buscarPorId(codigo));
    }

    @Override
    @GetMapping
    public ResponseEntity<List<Usuario>> listarTodos() {
        return ResponseEntity.ok(this.usuarioServico.listarTodos());
    }

}
