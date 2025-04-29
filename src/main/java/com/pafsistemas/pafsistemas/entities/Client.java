package com.pafsistemas.pafsistemas.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "tb_client")
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = true)
    private String name;
    @Column(nullable = true)
    private String email;
    @Column(nullable = true)
    private String phone;
    @Column(nullable = true)
    private String neighborhood;
    @Column(nullable = true)
    private String street;
    @Column(nullable = true)
    private String number;

    //pedidos lista de pedidos do client One To many
}
