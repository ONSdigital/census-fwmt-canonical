package uk.gov.ons.census.fwmt.canonical.v1;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class UpdateFieldWorkerJobRequest {
  private UUID id;
  private String actionType;
  private String addressType;
  private String addressLevel;
  private boolean undeliveredAsAddressed;
  private boolean blankQreReturned;
  private OffsetDateTime until;
  private boolean ce1Complete;
  private int ceExpectedResponses;
  private int ceActualResponses;
}
