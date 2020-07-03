package io.dowlath.githubtopcontributors.controller;

import io.dowlath.githubtopcontributors.repository.GitHubRepositoriesResponse;
import io.dowlath.githubtopcontributors.repository.GitHubUsersResponse;
import io.dowlath.githubtopcontributors.repository.Repository;
import io.dowlath.githubtopcontributors.repository.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author Dowlath
 * @create 7/1/2020 2:22 PM
 */
@RestController
public class ContributorsController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/api/users/{login}")
    public List<User> search(@PathVariable("login") String login) {
        ResponseEntity<GitHubUsersResponse> forEntity =
                restTemplate.getForEntity(String.format("https://api.github.com/search/users?q=%s", login), GitHubUsersResponse.class);
        return forEntity.getBody().getItems();
    }
    @RequestMapping("/api/contributors")
    public List<Repository> repositories(@RequestParam(name = "q") String query, @RequestParam String location,@RequestParam String follow) {
        ResponseEntity<GitHubRepositoriesResponse> forEntity =
                 restTemplate.getForEntity(String.format("https://api.github.com/search/users?q=%s",location,follow),GitHubRepositoriesResponse.class);
        return forEntity.getBody().getItems();
    }

}
