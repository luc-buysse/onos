/*
 * Copyright 2017-present Open Networking Laboratory
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

package org.onosproject.dhcprelay.store;


import org.onosproject.event.AbstractEvent;

/**
 * Event class for DHCP relay store.
 */
public class DhcpRelayStoreEvent extends AbstractEvent<DhcpRelayStoreEvent.Type, DhcpRecord> {

    /**
     * Types of the event.
     */
    public enum Type {
        /**
         * A DHCP record has been created or updated.
         */
        UPDATED,

        /**
         * A DHCP record has been removed.
         */
        REMOVED
    }

    /**
     * Creates a DHCP relay store event by given information.
     *
     * @param type the type of event
     * @param subject the DHCP record of this event
     */
    protected DhcpRelayStoreEvent(Type type, DhcpRecord subject) {
        super(type, subject);
    }
}