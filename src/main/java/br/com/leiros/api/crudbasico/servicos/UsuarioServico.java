package br.com.leiros.api.crudbasico.servicos;

import br.com.leiros.api.crudbasico.entidades.Usuario;
import br.com.leiros.api.crudbasico.repositorios.IUsuarioRepositorio;
import br.com.leiros.api.crudbasico.servicos.interfaces.IServico;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServico implements IServico<Usuario> {

    @Autowired
    private IUsuarioRepositorio usuarioRepositorio;


    @Override
    public Usuario salvar(Usuario usuario) {
        return this.usuarioRepositorio.save(usuario);
    }

    @Override
    public Usuario atualizar(Long codigo, Usuario usuario) {
        Usuario retornado = buscarPorId(codigo);
        BeanUtils.copyProperties(usuario, retornado);
        return this.usuarioRepositorio.save(retornado);
    }

    @Override
    public void deletar(Long codigo) {
        Usuario usuario = buscarPorId(codigo);
        this.usuarioRepositorio.delete(usuario);
    }

    @Override
    public Usuario buscarPorId(Long codigo) {
        return this.usuarioRepositorio.findById(codigo).
                orElseThrow(() -> new EmptyResultDataAccessException(1));
    }

    @Override
    public List<Usuario> listarTodos() {
        return this.usuarioRepositorio.findAll();
    }
}
