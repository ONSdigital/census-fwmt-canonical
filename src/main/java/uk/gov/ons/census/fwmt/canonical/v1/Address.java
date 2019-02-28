package uk.gov.ons.census.fwmt.canonical.v1;

import java.math.BigDecimal;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Address {

  private String line1;

  private String line2;

  private String line3;

  private String line4;

  private String townName;

  private String postCode;

  private BigDecimal latitude;

  private BigDecimal longitude;

  private String organisationName;

}
