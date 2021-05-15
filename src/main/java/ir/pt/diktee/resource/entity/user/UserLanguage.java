package ir.pt.diktee.resource.entity.user;

import ir.pt.core.repository.BaseEntity;
import ir.pt.diktee.resource.entity.Language;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "USERLANGUAGE")
@SequenceGenerator(name = "id_Sequence", sequenceName = "USERAVATAR_SEQ", allocationSize = 1)
@Data
public class UserLanguage extends BaseEntity {


    @ManyToOne
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "LANGUAGE_ID", referencedColumnName = "ID")
    private Language language;



}
