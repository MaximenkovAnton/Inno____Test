package me.maximenkov_anton.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Currency;
import java.util.Date;

@Entity
@Data
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;

    @ManyToOne
    @JoinColumn(name = "contractor_id", nullable = false)
    private Contractor contractor;

    @Temporal(TemporalType.DATE)
    private Date signDate;

    @Temporal(TemporalType.DATE)
    private Date fromDate;

    @Temporal(TemporalType.DATE)
    private Date toDate;

    private Currency cost;
}
