package ir.pt.diktee.resource.entity;

import ir.pt.core.repository.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "LANGUAGE")
@SequenceGenerator(name = "id_Sequence", sequenceName = "LANGUAGE_SEQ", allocationSize = 1)
@Data
public class Language extends BaseEntity {
    @Column(name = "NAME")
    private String name;

    @Column(name = "CODE")
    private String code;

}
