package com.mklearning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mklearning.entity.Notes;
import com.mklearning.entity.User;

public interface NotesRepository extends JpaRepository<Notes, Integer>{
	
	public List<Notes> findByUser(User user);

}
