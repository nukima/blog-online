package com.example.ltw_nhom20.repository;

import com.example.ltw_nhom20.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Integer> {
}
