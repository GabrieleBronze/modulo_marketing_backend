package com.example.senac_marketing.resourse;

import com.example.senac_marketing.modal.Funcionario;
import com.example.senac_marketing.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController extends AbstractController{



    @Autowired
    private FuncionarioService ServiceFuncionario;


    @PostMapping
    public ResponseEntity create(@RequestBody Funcionario entity){
        Funcionario save = ServiceFuncionario.salvar(entity);
        return ResponseEntity.created(URI.create("/api/funcionarios/" + entity.getId())).body(save);
    }

    @GetMapping
    public  ResponseEntity findAll(){
        List<Funcionario> funcionarios = ServiceFuncionario.buscaTodos();
        return ResponseEntity.ok(funcionarios);
    }
    @GetMapping("/{id}")
    public  ResponseEntity findById(@PathVariable("id") Long id){
        Funcionario funcionarios = ServiceFuncionario.buscaPorId(id);
        return ResponseEntity.ok().body(funcionarios);
    }
    @DeleteMapping("/{id}")
    public  ResponseEntity remove(@PathVariable("id") Long id){
        ServiceFuncionario.remover(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public  ResponseEntity update(@PathVariable("id") Long id, @RequestBody Funcionario entity){
        Funcionario alterado = ServiceFuncionario.alterar(id, entity);
        return  ResponseEntity.ok().body(alterado);
    }


}
