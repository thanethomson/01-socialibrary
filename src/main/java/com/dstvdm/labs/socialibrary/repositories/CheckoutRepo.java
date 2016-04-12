package com.dstvdm.labs.socialibrary.repositories;

import com.dstvdm.labs.socialibrary.models.Checkout;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface CheckoutRepo extends PagingAndSortingRepository<Checkout, Long> {
}
