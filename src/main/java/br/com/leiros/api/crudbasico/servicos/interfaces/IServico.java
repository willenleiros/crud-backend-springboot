package br.com.leiros.api.crudbasico.servicos.interfaces;

import java.util.List;

public interface IServico<T> {

    T salvar(T t);
    T atualizar(Long codigo, T t);
    void deletar(Long codigo);
    T buscarPorId(Long codigo);
    List<T> listarTodos();

}
