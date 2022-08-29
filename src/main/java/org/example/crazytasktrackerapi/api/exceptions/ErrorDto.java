package org.example.crazytasktrackerapi.api.exceptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ErrorDto {

    String error;

    @JsonProperty(value = "error_description")
    String errorDescription;

}
