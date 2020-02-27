package com.hackathongestamp2020.Backend.Repositories;

import com.hackathongestamp2020.Backend.Domain.Ventas;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentasRepository extends ReactiveMongoRepository<Ventas, String> {


}
