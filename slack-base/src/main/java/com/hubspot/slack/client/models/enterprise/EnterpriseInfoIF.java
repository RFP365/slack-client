package com.hubspot.slack.client.models.enterprise;

import com.hubspot.immutables.style.HubSpotStyle;
import org.immutables.value.Value.Immutable;

@Immutable
@HubSpotStyle
public interface EnterpriseInfoIF {
    String getId();
    String getName();
}
