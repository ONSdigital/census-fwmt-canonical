package uk.gov.ons.census.fwmt.canonical.v1;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Map;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class CreateFieldWorkerJobRequest implements Serializable {

  private String actionType;

  private String jobIdentity;

  private String surveyType;

  private UUID caseId;

  private boolean preallocatedJob;

  private String mandatoryResourceAuthNo;

  private LocalDate dueDate;

  private Address address;

  private Contact contact;

  private Map<String, String> additionalProperties;

}