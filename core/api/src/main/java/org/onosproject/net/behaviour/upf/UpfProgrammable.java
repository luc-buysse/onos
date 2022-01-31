/*
 * Copyright 2021-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onosproject.net.behaviour.upf;

import com.google.common.annotations.Beta;
import org.onosproject.net.driver.HandlerBehaviour;
import org.onosproject.net.flow.FlowRule;

/**
 * Provides means to update the device forwarding state to implement a 3GPP
 * User Plane Function. An implementation of this API should not write state
 * directly to the device, but instead, always rely on core ONOS subsystems
 * (e.g., FlowRuleService, GroupService, etc).
 */
@Beta
public interface UpfProgrammable extends HandlerBehaviour, UpfDevice {
    /**
     * Apps are expected to call this method as the first one when they are ready
     * to install any UPF entity.
     *
     * @return True if initialized, false otherwise.
     */
    boolean init();

    /**
     * Checks if the given flow rule has been generated by this UPF behaviour.
     *
     * @param flowRule the flow rule to check
     * @return True if the given flow rule has been created by this UPF behaviour, False otherwise.
     */
    boolean fromThisUpf(FlowRule flowRule);
}