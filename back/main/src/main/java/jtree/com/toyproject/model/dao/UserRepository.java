package jtree.com.toyproject.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import jtree.com.toyproject.model.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
