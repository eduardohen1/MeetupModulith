package com.example.demoModulith;

import com.example.demoModulith.produto.internal.Produto;
import com.example.demoModulith.produto.ProdutoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoModulithApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoModulithApplication.class, args)
				.getBean(ProdutoService.class)
				.create(new Produto("Produto 1", "Descrição do Produto 1", 100.0));
	}

}
