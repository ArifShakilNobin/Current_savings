package bits.current_savings_service.domain.entity;
import jakarta.persistence.*;
import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "collection_frequency")
public class CollectionFrequency implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "country_id", nullable = false)
//    @NotNull
//    private Country country;

//    @ManyToOne
//    @JoinColumn(name = "project_info_id", nullable = false)
//    @NotNull
//    private ProjectInfo projectInfo;

//    @ManyToOne
//    @JoinColumn(name = "frequency_id", nullable = false)
//    @NotNull
//    private Frequency frequency;

    @Column(name = "description")
    private String description;

//    @ManyToOne
//    @JoinColumn(name = "status_id")
//    private DomainStatus status;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "updated_by")
    private Long updatedBy;

    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;

    @Column(name = "last_updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdated;
}
