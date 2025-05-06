package com.pafsistemas.pafsistemas.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "tb_client")
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private String neighborhood;
    @Column(nullable = false)
    private String street;
    @Column(nullable = false)
    private String number;

    //pedidos lista de pedidos do client One To many
    @JsonIgnore
    @OneToMany(mappedBy = "client") // Aponta para o campo 'client' em Order
    private List<Order> orderList = new ArrayList<>();
}
