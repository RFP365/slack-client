package com.hubspot.slack.client.methods.params.oauth;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hubspot.immutables.style.HubSpotStyle;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@HubSpotStyle
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public interface OauthAccessParamsIF {
    String getClientId();
    String getClientSecret();
    String getCode();
    Optional<String> getRedirectUrl();
    Optional<Boolean> getSingleChannel();
}
