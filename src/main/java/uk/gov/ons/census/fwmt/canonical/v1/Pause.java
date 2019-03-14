package uk.gov.ons.census.fwmt.canonical.v1;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Pause implements Serializable {
  private String effectiveDate;
  private String code;
  private String reason;
  private String holdUntil;
}
