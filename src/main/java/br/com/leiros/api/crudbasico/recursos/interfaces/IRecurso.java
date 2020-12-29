package br.com.leiros.api.crudbasico.recursos.interfaces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface IRecurso<T> {

    ResponseEntity<T> salvar(@RequestBody T t, HttpServletResponse response);
    ResponseEntity<T> atualizar(@PathVariable Long codigo, @RequestBody T t);
    void deletar(@PathVariable Long codigo);
    ResponseEntity<T> buscarPorId(@PathVariable Long codigo);
    ResponseEntity<List<T>> listarTodos();

}
