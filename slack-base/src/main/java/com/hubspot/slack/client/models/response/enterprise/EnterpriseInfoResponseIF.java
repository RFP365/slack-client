package com.hubspot.slack.client.models.response.enterprise;

import com.hubspot.immutables.style.HubSpotStyle;
import com.hubspot.slack.client.models.enterprise.EnterpriseInfoIF;
import org.immutables.value.Value;

@Value.Immutable
@HubSpotStyle
public interface EnterpriseInfoResponseIF {
    EnterpriseInfoIF getEnterprise();
}
