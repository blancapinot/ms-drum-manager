package com.pinot.msdrummanager.domain.entity;

import com.pinot.msdrummanager.domain.constant.PadlockStatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Candados
 */
@Entity
@Table(name = "padlock")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PadlockEntity {
    @Id
    @GeneratedValue
    private Long id;

    /**
     * Numero de serie del candado, el cual podría ser unico
     */
    private Long serial;
    private String unlock;

    @Enumerated(EnumType.STRING)
    private PadlockStatusEnum status;
}
