package me.maximenkov_anton.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Currency;
import java.util.Date;

@Entity
@Data
public class Stage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "stages_list_id", nullable = false)
    private StageInfo stageInfo;

    private Currency cost;

    @Temporal(TemporalType.DATE)
    private Date payDate;
}
