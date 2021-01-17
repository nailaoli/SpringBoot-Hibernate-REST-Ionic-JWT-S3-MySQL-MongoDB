package com.naila.nelioalvesspringboot;

import com.naila.nelioalvesspringboot.domain.Categoria;
import com.naila.nelioalvesspringboot.domain.Cidade;
import com.naila.nelioalvesspringboot.domain.Estado;
import com.naila.nelioalvesspringboot.domain.Produto;
import com.naila.nelioalvesspringboot.repositories.CategoriaRepository;
import com.naila.nelioalvesspringboot.repositories.CidadeRepository;
import com.naila.nelioalvesspringboot.repositories.EstadoRepository;
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
    @Autowired
    private EstadoRepository estadoRepository;
    @Autowired
    private CidadeRepository cidadeRepository;

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

        Estado est1 = new Estado(null, "Minas Gerais");
        Estado est2 = new Estado(null, "São Paulo");
        Cidade c1 = new Cidade(null, "Uberlândia", est1);
        Cidade c2 = new Cidade(null, "São Paulo", est2);
        Cidade c3 = new Cidade(null, "Campinas", est2);
        est1.getCidades().add(c1);
        est2.getCidades().addAll(Arrays.asList(c2, c3));

        estadoRepository.saveAll(Arrays.asList(est1, est2));
        cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));


    }

}
