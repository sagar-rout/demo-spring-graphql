package com.example.demospringgraphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.demospringgraphql.author.Author;
import com.example.demospringgraphql.post.Post;

public class PostResolver implements GraphQLResolver<Post> {

    public Author getAuthor(Post post) {
        return post.getAuthor();
    }
}