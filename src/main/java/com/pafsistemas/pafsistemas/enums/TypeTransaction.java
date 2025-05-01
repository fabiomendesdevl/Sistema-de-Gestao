package com.pafsistemas.pafsistemas.enums;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public enum TypeTransaction {
    @Enumerated(EnumType.STRING)
    OUTPUT(1),
    @Enumerated(EnumType.STRING)
    ENTRANCE(2);

    TypeTransaction(int i) {
    }
}
