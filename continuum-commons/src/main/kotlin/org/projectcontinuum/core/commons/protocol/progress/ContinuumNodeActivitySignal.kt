package org.projectcontinuum.core.commons.protocol.progress

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class ContinuumNodeActivitySignal @JsonCreator constructor(
  @JsonProperty("nodeId") val nodeId: String = "",
  @JsonProperty("nodeProgress") val nodeProgress: NodeProgress = NodeProgress()
)