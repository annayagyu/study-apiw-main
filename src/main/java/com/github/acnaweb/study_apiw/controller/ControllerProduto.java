package com.github.acnaweb.study_apiw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.acnaweb.study_apiw.model.Produto;
import com.github.acnaweb.study_apiw.service.ProdutoService;

@RestController
@RequestMapping("produtos")
public class ControllerProduto {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<Produto> create(@RequestBody Produto request) {
        Produto produto = produtoService.save(request);

        return  ResponseEntity.status(201).body(produto);
    }

    @PutMapping
    public ResponseEntity<Produto> update() {
        Produto produto = new Produto();
        return  ResponseEntity.status(200).body(produto);
    }

    @GetMapping
    public ResponseEntity<Produto> find() {

        Produto produto = new Produto();

        return ResponseEntity.status(200).body(produto);
    }

    @DeleteMapping
    public ResponseEntity<Void> delete() {
        return ResponseEntity.status(204).build();
    }

}
