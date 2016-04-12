package com.dstvdm.labs.socialibrary.repositories;

import com.dstvdm.labs.socialibrary.models.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface UserRepo extends PagingAndSortingRepository<User, Long> {
}
