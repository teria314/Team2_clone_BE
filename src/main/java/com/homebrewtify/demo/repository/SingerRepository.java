package com.homebrewtify.demo.repository;

import com.homebrewtify.demo.entity.Singer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SingerRepository extends JpaRepository<Singer,String> {
    Optional<Singer> findWithAlbumsBySingerName(String singerName);
}
