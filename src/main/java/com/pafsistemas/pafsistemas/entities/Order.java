package com.pafsistemas.pafsistemas.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.pafsistemas.pafsistemas.enums.StatusPedido;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "tb_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "2018-04-04 14:25:32-03") // yyyy-MM-dd'T'HH:mm:ss.SSSZZ
    private Instant dateOrder;
    private StatusPedido statusPedido;
    private Double total;

    @ManyToMany
    private List<Product> productList = new ArrayList<>();

}
