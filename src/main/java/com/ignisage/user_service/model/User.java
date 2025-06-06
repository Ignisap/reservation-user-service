package com.ignisage.user_service.model;

import jakarta.persistence.*;
import lombok.*;

import javax.management.relation.Role;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name="user")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    private LocalDateTime registerDate;
}
