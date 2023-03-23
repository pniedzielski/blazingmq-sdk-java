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

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProtocolUtilTest {

    @Test
    public void testPadding() {
        for (int i = 1; i < 5; i++) {
            byte[] p = ProtocolUtil.getPaddingBytes(i);

            assertEquals(4, p.length); // Returned array is always of length 4

            for (byte b : p) {
                assertEquals(b, i);
            }
        }
    }
}
