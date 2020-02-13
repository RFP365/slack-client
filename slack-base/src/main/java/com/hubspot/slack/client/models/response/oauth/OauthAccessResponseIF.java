package com.hubspot.slack.client.models.response.oauth;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hubspot.immutables.style.HubSpotStyle;
import com.hubspot.slack.client.models.response.SlackResponse;
import com.hubspot.slack.client.models.response.enterprise.EnterpriseInfoResponse;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@HubSpotStyle
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public interface OauthAccessResponseIF extends SlackResponse {
    //V2 Stuff
    String getAccessToken();
    String getTokenType();
    String getBotUserId();
    String getAppId();
    String getScope();
    OauthTeamResponse getTeam();
    Optional<EnterpriseInfoResponse> getEnterprise();
    Optional<AuthedUserResponse> getAuthedUser();
}
