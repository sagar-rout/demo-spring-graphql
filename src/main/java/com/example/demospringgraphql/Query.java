package com.example.demospringgraphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demospringgraphql.post.Post;
import com.example.demospringgraphql.post.PostRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    private final PostRepository postRepository;

    public Query(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getRecentPosts() {
        return postRepository.findAll();
    }
}
