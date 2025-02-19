package bits.current_savings_service.domain.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "office_type", schema = "public")
public class OfficeType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Version
    @Column(name = "version", nullable = false)
    private Long version;

    @Column(name = "description", nullable = false, length = 255)
    private String description;

    @Column(name = "hierarchy_level", nullable = false)
    private int hierarchyLevel;

    @Column(name = "office_type_code", nullable = false, length = 10, unique = true)
    private String officeTypeCode;

    @Column(name = "office_type_name", nullable = false, length = 100, unique = true)
    private String officeTypeName;

    @Column(name = "office_op_type", nullable = false, length = 255)
    private String officeOpType;
}
