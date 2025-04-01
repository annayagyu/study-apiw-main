package com.github.acnaweb.study_apiw.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.acnaweb.study_apiw.dto.ProdutoRequestCreate;
import com.github.acnaweb.study_apiw.model.Produto;
import com.github.acnaweb.study_apiw.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto save(ProdutoRequestCreate dto) {        

        Produto produto = new Produto();
        produto.setNome(dto.getNome());

        return produtoRepository.save(produto);
    }

}
