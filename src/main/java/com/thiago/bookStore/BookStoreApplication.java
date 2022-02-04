package com.thiago.bookStore;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.thiago.bookStore.domain.Categoria;
import com.thiago.bookStore.domain.Livro;
import com.thiago.bookStore.repositories.CategoriaRepositiry;
import com.thiago.bookStore.repositories.LivroRepositiry;

@SpringBootApplication
public class BookStoreApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepositiry categoriaRepositiry;
	@Autowired
	private LivroRepositiry livroRepositiry;

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática", "Livros de TI");

		Livro l1 = new Livro(null, "Clean code", "Robert Martin", "Loren Ipsun", cat1);

		cat1.getLivros().addAll(Arrays.asList(l1));

		this.categoriaRepositiry.saveAll(Arrays.asList(cat1));
		this.livroRepositiry.saveAll(Arrays.asList(l1));

	}

}
