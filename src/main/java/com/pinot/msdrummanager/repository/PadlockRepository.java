package com.pinot.msdrummanager.repository;

import com.pinot.msdrummanager.domain.entity.PadlockEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PadlockRepository extends PagingAndSortingRepository<PadlockEntity, Long>, CrudRepository<PadlockEntity, Long> {
}
