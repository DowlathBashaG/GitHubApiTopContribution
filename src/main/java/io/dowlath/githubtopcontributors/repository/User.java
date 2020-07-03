package io.dowlath.githubtopcontributors.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Dowlath
 * @create 7/1/2020 2:49 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String login;
    private int id;
    private String avatar_url;
    private String url;
}