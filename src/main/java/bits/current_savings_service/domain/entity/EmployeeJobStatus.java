package bits.current_savings_service.domain.entity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "employee_job_status")
public class EmployeeJobStatus implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    // Possible values: RECRUITED, RETIRED, RESIGNED, TRANSFERRED, DEPUTED, DEPLOYED, ONLEAVE, ONSPECIALLEAVE, TERMINATED
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;
}