package com.pinot.msdrummanager.domain.entity;

import com.pinot.msdrummanager.domain.constant.PadlockStatusEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Candados
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PadlockEntity {
    @Id
    private Long id;
    private Long serial;
    private String unlock;

    @Enumerated(EnumType.STRING)
    private PadlockStatusEnum status;
}
