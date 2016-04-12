package com.dstvdm.labs.socialibrary.config;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@EnableJpaRepositories(basePackages = "com.dstvdm.labs.socialibrary.repositories")
@EntityScan(basePackages = {"com.dstvdm.labs.socialibrary.models"})
public class RepoConfig {
}
