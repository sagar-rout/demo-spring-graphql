package com.example.demospringgraphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.demospringgraphql.author.Author;
import com.example.demospringgraphql.post.Post;

import java.util.List;

public class AuthorResolver implements GraphQLResolver<Author> {

    public List<Post> getPosts(Author author) {
        return author.getPosts();
    }
}
