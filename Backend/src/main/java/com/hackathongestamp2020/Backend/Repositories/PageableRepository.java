package com.hackathongestamp2020.Backend.Repositories;

import com.hackathongestamp2020.Backend.Domain.Ventas;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface PageableRepository extends PagingAndSortingRepository<Ventas, String> {

}
