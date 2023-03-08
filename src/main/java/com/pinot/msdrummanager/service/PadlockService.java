package com.pinot.msdrummanager.service;

import com.pinot.msdrummanager.domain.entity.PadlockEntity;
import com.pinot.msdrummanager.repository.PadlockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PadlockService {
    private final PadlockRepository padlockRepository;

    public List<PadlockEntity> getAll(){
        return (List<PadlockEntity>) padlockRepository.findAll();
    }
    public PadlockEntity create(PadlockEntity padlock) {
        return padlockRepository.save(padlock);
    }

}
