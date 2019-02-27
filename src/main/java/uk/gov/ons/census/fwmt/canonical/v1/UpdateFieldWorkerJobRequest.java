package uk.gov.ons.census.fwmt.canonical.v1;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class UpdateFieldWorkerJobRequest {
  private String actionType;
}
