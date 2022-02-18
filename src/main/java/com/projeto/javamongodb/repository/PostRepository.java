package com.projeto.javamongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.projeto.javamongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}