package com.mdm.scenarios

import com.mdm.requests.{CreateUserRequest, GetTokenRequest}
import io.gatling.core.Predef.scenario

object CreateUserScenario {
  val createUserScenario = scenario("Create User Scenario")
    .exec(GetTokenRequest.get_token)
    .exec(CreateUserRequest.create_user)
}