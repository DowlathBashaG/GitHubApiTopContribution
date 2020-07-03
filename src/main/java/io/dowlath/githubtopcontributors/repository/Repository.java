package io.dowlath.githubtopcontributors.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Dowlath
 * @create 7/1/2020 2:51 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Repository {
    private String type;
    private String login;
    private String url;
    private String followers_url;
    private String avatar_url;

}