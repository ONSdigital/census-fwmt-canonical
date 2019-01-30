package uk.gov.ons.fwmt.census.canonical.v1;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Contact {
    private String forename;

    private String surname;

    private String email;

    private String phoneNumber;
}
