package bits.current_savings_service.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "physical_office_info", schema = "public")
public class PhysicalOfficeInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Version
    @Column(name = "version", nullable = false)
    private Long version;

    @Column(name = "area_type")
    private String areaType;

    @ManyToOne
    @JoinColumn(name = "business_address_id")
    private OfficeAddress businessAddress;

    @Column(name = "effective_date")
    private Date effectiveDate;

    @Column(name = "office_code", nullable = false, length = 15)
    private String officeCode;

    @ManyToOne
    @JoinColumn(name = "office_country_id", nullable = false)
    private Country officeCountry;

    @Column(name = "office_name", nullable = false, length = 255)
    private String officeName;

    @Column(name = "office_ref_code")
    private String officeRefCode;

    @Column(name = "office_status_id", nullable = false)
    private Long officeStatusId;

    @ManyToOne
    @JoinColumn(name = "office_type_id", nullable = false)
    private OfficeType officeType;

    @ManyToOne
    @JoinColumn(name = "parent_office_id")
    private PhysicalOfficeInfo parentOffice;

    @ManyToOne
    @JoinColumn(name = "registered_address_id")
    private OfficeAddress registeredAddress;

    @Column(name = "setup_date")
    private Date setupDate;

    @Column(name = "office_hierarchy_id")
    private Long officeHierarchyId;

    @ManyToOne
    @JoinColumn(name = "reporting_to_id")
    private PhysicalOfficeInfo reportingTo;

    @Column(name = "date_created")
    private Date dateCreated;

    @Column(name = "last_updated")
    private Date lastUpdated;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "updated_by")
    private Long updatedBy;

    @Column(name = "verify_tb", nullable = false)
    private boolean verifyTB = true;

    @Column(name = "verify_portfolio")
    private Boolean verifyPortfolio;

    @Column(name = "verify_savings")
    private Boolean verifySavings;

    @Column(name = "mobile_no")
    private String mobileNo;

    @Column(name = "is_hr_office")
    private Boolean isHrOffice = false;

    @Column(name = "is_upazila_accounts_office")
    private Boolean isUpazilaAccountsOffice;

    @Column(name = "mf_branch_id")
    private String mfBranchId;

    @Column(name = "mf_ref_code")
    private String mfRefCode;

    @Column(name = "dev_ref_code")
    private String devRefCode;

    @Column(name = "has_operation")
    private Boolean hasOperation;

    @Column(name = "is_dev_office")
    private Boolean isDevOffice = false;

    @Column(name = "is_mf_office")
    private Boolean isMfOffice = false;

    @Column(name = "is_indp")
    private Boolean isIndp = false;

    @Column(name = "bkash_wallet_no", length = 15)
    private String bkashWalletNo;

    @Column(name = "operation_category")
    private String operationCategory;

    @Column(name = "parent_project_id")
    private Long parentProjectId;

}