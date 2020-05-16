package com.gregPetCollection.jdbc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Pet {
    private Long id;

    private String petName;
    private String ownerName;

    private int petAge;
    private double weight;

    private boolean pureRace;

}
