package bits.current_savings_service.domain.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "office_address", schema = "public")
public class OfficeAddress implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Version
    @Column(name = "version", nullable = false)
    private Long version;

    @Column(name = "address_line1")
    private String addressLine1;

    @Column(name = "address_line2")
    private String addressLine2;

    @Column(name = "city_id")
    private Long cityId;

    @Column(name = "district_info_id")
    private Long districtInfoId;

    @Column(name = "division_info_id")
    private Long divisionInfoId;

    @Column(name = "province_info_id")
    private Long provinceInfoId;

    @Column(name = "status_id", nullable = false)
    private Long statusId;

    @Column(name = "tehsil_info_id")
    private Long tehsilInfoId;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "branch_ref_code", unique = true)
    private Long branchRefCode;

    // Getters and Setters omitted for brevity
}

