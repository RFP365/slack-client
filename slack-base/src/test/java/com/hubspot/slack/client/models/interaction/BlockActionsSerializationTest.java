package com.hubspot.slack.client.models.interaction;

import java.io.IOException;

import org.junit.Test;

import com.hubspot.slack.client.SerializationTestBase;

public class BlockActionsSerializationTest extends SerializationTestBase {

  @Test
  public void testBlockSerialization() throws IOException {
    testSerialization("block_actions.json", BlockActions.class);
  }

}
