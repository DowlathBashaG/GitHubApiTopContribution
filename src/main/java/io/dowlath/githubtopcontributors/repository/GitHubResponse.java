package io.dowlath.githubtopcontributors.repository;

import lombok.Data;

import java.util.List;

/**
 * @Author Dowlath
 * @create 7/1/2020 2:58 PM
 */
@Data
public class GitHubResponse<T> {
    private List<T> items;
}
