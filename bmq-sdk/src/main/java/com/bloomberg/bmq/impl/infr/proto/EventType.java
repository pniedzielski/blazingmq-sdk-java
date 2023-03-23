/*
 * Copyright 2022 Bloomberg Finance L.P.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bloomberg.bmq.impl.infr.proto;

public enum EventType {
    UNDEFINED(0),
    CONTROL(1),
    PUT(2),
    CONFIRM(3),
    PUSH(4),
    ACK(5);

    private int id;

    EventType(int id) {
        this.id = id;
    }

    public int toInt() {
        return id;
    }

    public static EventType fromInt(int i) {
        for (EventType t : EventType.values()) {
            if (t.toInt() == i) return t;
        }
        return null;
    }
}
