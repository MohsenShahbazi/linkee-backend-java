package ir.pt.diktee.resource.entity.shop;

import ir.pt.core.repository.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "CURRENCY")
@SequenceGenerator(name = "id_Sequence", sequenceName = "CURRENCY_SEQ", allocationSize = 1)
@Data
public class Currency extends BaseEntity {

    @Column(name = "CURRENCYSYMBOL", length = 1000,nullable = false)
    private String currencySymbol;

    @Column(name = "CURRENCYCODE", length = 1000,nullable = false)
    private String currencyCode;

    @Column(name = "CURRENCYNAME", length = 1000,nullable = false)
    private String currencyName;

    @Column(name = "CURRENCYFORMAT", length = 1000)
    private String currencyFormat;

    @Column(name = "published", nullable = false)
    private Boolean published;
}
