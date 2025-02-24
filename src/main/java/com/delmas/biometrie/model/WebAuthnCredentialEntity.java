package com.delmas.biometrie.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WebAuthnCredential {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String credentialId;
    private String publicKey;
    private String attestationObject;

    @ManyToOne
    private Utilisateur utilisateur;
}

