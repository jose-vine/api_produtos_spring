package br.com.josevine.springboot.controllers;

import br.com.josevine.springboot.repositories.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @Autowired
    ProdutoRepositorio produtoRepositorio;

}
