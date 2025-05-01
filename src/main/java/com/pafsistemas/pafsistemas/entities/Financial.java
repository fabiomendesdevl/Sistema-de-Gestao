package com.pafsistemas.pafsistemas.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.pafsistemas.pafsistemas.enums.TypeTransaction;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "tb_financial")
public class Financial implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private TypeTransaction typeTransaction;
    private Double valor;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "2020-04-04 14:25:32-03")
    private Instant dateTransaction;
}
