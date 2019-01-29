package com.simpleapp.demo;

import org.springframework.data.repository.CrudRepository;

import com.simpleapp.demo.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
