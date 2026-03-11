package org.projectcontinuum.core.commons.activity

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import org.projectcontinuum.core.commons.model.ContinuumWorkflowModel
import org.projectcontinuum.core.commons.model.PortData
import io.temporal.activity.ActivityInterface

@ActivityInterface
interface IContinuumNodeActivity {
  fun run(
    node: ContinuumWorkflowModel.Node,
    inputs: Map<String, PortData>
  ): NodeActivityOutput

  enum class NodeOutputSystemPort(
    val key: String
  ) {
    ERROR("\$error")
  }

  data class NodeActivityOutput @JsonCreator constructor(
    @JsonProperty("nodeId") val nodeId: String,
    @JsonProperty("outputs") val outputs: Map<String, PortData>
  )
}