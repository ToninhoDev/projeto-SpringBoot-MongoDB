package com.projeto.javamongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.projeto.javamongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
