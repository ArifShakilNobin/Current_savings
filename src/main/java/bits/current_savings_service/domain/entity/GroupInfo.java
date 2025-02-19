package bits.current_savings_service.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.prefs.Preferences;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "group_info")
public class GroupInfo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "group_info_seq")
    @SequenceGenerator(name = "group_info_seq", sequenceName = "group_info_seq", allocationSize = 1)
    private Long id;

    private Long projectInfoId;

    private Long savingsCollFrequencyId;

    @Column(name = "group_code")
    private String groupCode;

    @NotBlank
    @Size(min = 2, max = 64)
    @Pattern(regexp = "^[^0-9][A-Za-z0-9 -./_%&#()]+")
    @Column(name = "group_name")
    private String groupName;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "demarcation_area", length = 255)
    private String demarcationArea;

    @Column(name = "group_category_id")
    private long groupCategoryId = 1; //CISConstants.GROUP_CATEGORY_VILLAGE_ORGANIZATION

    @Column(name = "group_reference_number", length = 25)
    private String groupReferenceNumber;

//    @Column(name = "scanned_form") // Ensure explicit column mapping
//    private String scannedForm;

    private Long groupStatusId;

    @Column(name = "is_transferred_group")
    private boolean isTransferredGroup;

//        @Column(name = "lastpoassigned_date")
//    private Timestamp lastpoAssignedDate;

    @Column(name = "spot_address", length = 255)
    private String spotAddress;

    @Column(name = "updated_by")
    private Long updatedBy;

    @Column(name = "week_number")
    private long weekNumber;

    @Column(name = "service_territory_id")
    private Long serviceTerritoryId;

    @Column(name = "vo_category_id")
    private Long voCategoryId;

    @Column(name = "applicable_gender_id", nullable = false)
    private long applicableGenderId;// GROUP_GENDER_MALE = 1, GROUP_GENDER_FEMALE = 2, GROUP_GENDER_BOTH = 3

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    @Column(name = "group_creation_date", nullable = false)
    private Date groupCreationDate;

    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;

    @Column(name = "closing_date")
    private Date closingDate;

    @Column(name = "lastpoassigned_date")
    private Date lastPOAssignedDate;

    @Column(name = "last_updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdated;

    @Column(name = "loan_collection_start_date", nullable = false)
    @NotNull
    private Date loanCollectionStartDate;

    @Column(name = "meeting_time", nullable = false)
    private String meetingTime = "10:00 AM";

    @Column(name = "next_collection_date")
    private Date nextCollectionDate;

    @Column(name = "orientation_date", nullable = false)
    private Date orientationDate;

    @Column(name = "savings_collection_start_date", nullable = false)
    @NotNull
    private Date savingsCollectionStartDate;

    @Column(name = "scanned_form", nullable = true)
    private String groupScannedForm;


    @ManyToOne
    @JoinColumn(name = "branch_info_id", referencedColumnName = "id", nullable = false)
    private PhysicalOfficeInfo branchInfo;

    @ManyToOne
    @JoinColumn(name = "domain_status_id", referencedColumnName = "id")
    private DomainStatus domainStatus;

    @ManyToOne
    @JoinColumn(name = "close_reason_id", referencedColumnName = "id")
    private GroupCloseReason closeReason;

    @ManyToOne
    @JoinColumn(name = "project_info_id", referencedColumnName = "id", nullable = false)
    private ProjectInfo projectInfo;

    //    @Enumerated(EnumType.STRING)
//    @Column(name = "meeting_day_id", nullable = false)
    @ManyToOne
    @JoinColumn(name = "meeting_day_id", nullable = false)
    private Day meetingDay;

    @ManyToOne
    @JoinColumn(name = "assignedpo_id", nullable = false)
    private EmployeeCoreInfo assignedPO;

    @ManyToOne
    @JoinColumn(name = "loan_collection_frequency_id", referencedColumnName = "id", nullable = false)
    private CollectionFrequency loanCollectionFrequency;

    @ManyToOne
    @JoinColumn(name = "savings_coll_frequency_id", referencedColumnName = "id", nullable = false)
    private CollectionFrequency savingsCollectionFrequency;

    @ManyToOne
    @JoinColumn(name = "group_status_id", referencedColumnName = "id", nullable = false)
    private GroupStatus groupStatus;


}

