package com.example.ltw_nhom20.service.bean;

import com.example.ltw_nhom20.entity.Post;
import com.example.ltw_nhom20.entity.User;
import com.example.ltw_nhom20.repository.PostRepo;
import com.example.ltw_nhom20.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class PostServiceBean implements PostService {

    private final PostRepo postRepo;

    @Override
    public Optional<Post> findById(Integer id) {
        return postRepo.findById(id);
    }

    @Override
    public List<Post> findAll() {
        return postRepo.findAll();
    }

    @Override
    public Post save(Post post) {
        return postRepo.saveAndFlush(post);
    }

    @Override
    public void delete(Post post) {
        postRepo.delete(post);
    }
//
//    @Override
//    public Page<Post> findByUserOrderedByDatePageable(User user, int page) {
//        return postRepo.findAllByOrderByCreateDateDesc(user, new PageRequest(subtractPageByOne(page), 5));
//    }
//
//    @Override
//    public Page<Post> findAllOrderedByDatePageable(int page) {
//        return null;
//    }

}
