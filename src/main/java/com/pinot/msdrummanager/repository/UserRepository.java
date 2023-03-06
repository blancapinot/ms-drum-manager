package com.pinot.msdrummanager.repository;

import com.pinot.msdrummanager.domain.entity.UserEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<UserEntity, String> {
}
