package com.naila.nelioalvesspringboot;

import com.naila.nelioalvesspringboot.domain.Categoria;
import com.naila.nelioalvesspringboot.domain.Produto;
import com.naila.nelioalvesspringboot.repositories.CategoriaRepository;
import com.naila.nelioalvesspringboot.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class NelioalvesspringbootApplication implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    public static void main(String[] args) {
        SpringApplication.run(NelioalvesspringbootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Categoria cat1 = new Categoria(null, "Informática");
        Categoria cat2 = new Categoria(null, "Escritório");
        Produto prod1 = new Produto(null, "Computador", 2000.00);
        Produto prod2 = new Produto(null, "Impressora", 800.00);
        Produto prod3 = new Produto(null, "Mouse", 80.00);
        cat1.getProdutos().addAll(Arrays.asList(prod1, prod2, prod3));
        cat2.getProdutos().add(prod2);
        prod1.getCategorias().add(cat1);
        prod2.getCategorias().addAll(Arrays.asList(cat1, cat2));
        prod3.getCategorias().add(cat1);
        categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
        produtoRepository.saveAll(Arrays.asList(prod1, prod2, prod3));
    }
}
