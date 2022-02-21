package com.projeto.javamongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.javamongodb.domain.Post;
import com.projeto.javamongodb.repository.PostRepository;
import com.projeto.javamongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;


	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto Não encontrado!"));
	}

	public List<Post> findByTitle(String text){
		return repo.searchTitle(text);
	}

}
