package com.mu.samples.basicauth.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mu.samples.basicauth.data.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	User findByLogin(String login);

}
