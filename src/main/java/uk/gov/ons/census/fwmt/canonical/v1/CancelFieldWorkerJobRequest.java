package uk.gov.ons.census.fwmt.canonical.v1;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class CancelFieldWorkerJobRequest implements Serializable {
  private String actionType;
  private String jobIdentity;
  private String reason;
}
