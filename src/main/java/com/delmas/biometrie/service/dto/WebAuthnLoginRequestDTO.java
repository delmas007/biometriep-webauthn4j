package com.delmas.biometrie.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WebAuthnLoginRequest {
    private String username;
    private String credentialId;
}
