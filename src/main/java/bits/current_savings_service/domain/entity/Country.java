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
@Table(name = "country", schema = "public")
public class Country implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Version
    @Column(name = "version", nullable = false)
    private Long version;

    @Column(name = "calling_code", nullable = false, length = 10)
    private String callingCode;

    @Column(name = "code", nullable = false, length = 10, unique = true)
    private String code;

    @Column(name = "continent_id", nullable = false)
    private Long continentId;

    @Column(name = "foreign_currency_name", nullable = false, length = 50)
    private String foreignCurrencyName;

    @Column(name = "local_currency_name", nullable = false, length = 50)
    private String localCurrencyName;

    @Column(name = "minimum_denomination", nullable = false)
    private Float minimumDenomination;

    @Column(name = "name", nullable = false, length = 50, unique = true)
    private String name;

    @Column(name = "short_name", nullable = false, length = 3)
    private String shortName;

    @Column(name = "time_zone", nullable = false, length = 255)
    private String timeZone;

    @Column(name = "has_operation")
    private Boolean hasOperation;

    @Column(name = "short_code")
    private String shortCode;

}

