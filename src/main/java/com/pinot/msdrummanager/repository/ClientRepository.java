package com.pinot.msdrummanager.repository;

import com.pinot.msdrummanager.domain.entity.ClientEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends PagingAndSortingRepository<ClientEntity, String> {
}
