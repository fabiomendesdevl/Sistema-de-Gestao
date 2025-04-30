package com.pafsistemas.pafsistemas.enums;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public enum StatusPedido {
    @Enumerated(EnumType.STRING)
    PENDING(1),
    @Enumerated(EnumType.STRING)
    APPROVED(2),
    @Enumerated(EnumType.STRING)
    REJECTED(3),
    @Enumerated(EnumType.STRING)
    SENT(4);

    StatusPedido(int i) {
    }
}
