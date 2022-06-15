package it.igesa.domaine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;


/**
 *
 * @author Tarchoun Abir
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Privacy")
@EqualsAndHashCode(callSuper= true)
@EntityListeners(AuditingEntityListener.class)
public class Privacy extends  Auditable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id ;
    @Column(columnDefinition="text")
    private String title ;
    @Column(columnDefinition="text")
    private String htmlContent ;
    /**
     * ENTERPRISE
     */
    @ManyToOne
    private Entreprise entreprise;


}
