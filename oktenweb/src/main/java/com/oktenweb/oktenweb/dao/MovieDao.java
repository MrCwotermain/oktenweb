package com.oktenweb.oktenweb.dao;

import com.oktenweb.oktenweb.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDao extends JpaRepository<Movie,Integer> {
}
