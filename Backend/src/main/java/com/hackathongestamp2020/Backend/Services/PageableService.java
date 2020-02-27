package com.hackathongestamp2020.Backend.Services;

import com.hackathongestamp2020.Backend.Domain.Ventas;
import com.hackathongestamp2020.Backend.Repositories.PageableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PageableService {

    @Autowired
    private PageableRepository pageableRepository;

    public List<Ventas> getAll(Integer page, Integer size)
    {
        Pageable paging = PageRequest.of(page, size);

        Page<Ventas> pagedResult = pageableRepository.findAll(paging);

        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Ventas>();
        }
    }
}
