package com.centime.HelloMessage.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DetailVo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Schema(description = "Name", required = true)
    @JsonProperty("Name")
    private String Name;
    @Schema(description = "Surname", required = true)
    @JsonProperty("Surname")
    private String Surname;

}
