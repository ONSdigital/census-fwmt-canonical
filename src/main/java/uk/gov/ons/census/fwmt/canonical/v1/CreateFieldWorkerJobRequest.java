package uk.gov.ons.census.fwmt.canonical.v1;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class CreateFieldWorkerJobRequest implements Serializable {

  private UUID caseId;

  private String caseReference;

  private String caseType;

  private String surveyType;

  private String establishmentType;

  private String mandatoryResource;

  private String coordinatorCode;

  private String coordinatorId;

  private String uua;

  private boolean sai;

  private String description;

  private String specialInstructions;

  private String ccsQuestionnaireURL;

  private String ceDeliveryRequired;

  private String ceCE1Complete;

  private String ceExpectedResponses;

  private String ceActualResponses;

  private String category;

  private Contact contact;

  private Address address;

  private Pause pause;

  // TODO are additional properties still a thing?
  private Map<String, String> additionalProperties;
}