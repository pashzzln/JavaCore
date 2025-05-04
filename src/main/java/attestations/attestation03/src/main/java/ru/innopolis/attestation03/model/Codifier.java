package ru.innopolis.attestation03.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "doctors")
public class Codifier {
    @Id
    private Long id;
    @Column(name = "description", nullable = false)
    private String description;
}
