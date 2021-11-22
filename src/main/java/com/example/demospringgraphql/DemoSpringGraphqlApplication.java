package com.example.demospringgraphql;

import com.example.demospringgraphql.author.Author;
import com.example.demospringgraphql.author.AuthorRepository;
import com.example.demospringgraphql.post.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.List;

@SpringBootApplication
public class DemoSpringGraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringGraphqlApplication.class, args);
    }
}

@Component
class AppStartupRunner implements ApplicationRunner {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        final var author = new Author();
        author.setName("Sagar");

        final var post = new Post();
        post.setAuthor(author);
        post.setCategory("TECH");
        post.setTitle("First blog");
        post.setText("I am learning Graphql");

        author.setPosts(List.of(post));
        authorRepository.saveAndFlush(author);
    }
}


