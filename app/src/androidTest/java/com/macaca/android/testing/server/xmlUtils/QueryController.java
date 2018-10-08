/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.macaca.android.testing.server.xmlUtils;

import android.view.accessibility.AccessibilityNodeInfo;

import static com.macaca.android.testing.server.xmlUtils.ReflectionUtils.invoke;
import static com.macaca.android.testing.server.xmlUtils.ReflectionUtils.method;

public class QueryController {

    private static final String CLASS_QUERY_CONTROLLER = "android.support.test.uiautomator.QueryController";
    private static final String METHOD_GET_ACCESSIBILITY_ROOT_NODE = "getRootNode";

    private final Object queryController;

    public QueryController(Object queryController) {
        this.queryController = queryController;
    }

    public AccessibilityNodeInfo getAccessibilityRootNode() throws Exception {
        return (AccessibilityNodeInfo) invoke(method(CLASS_QUERY_CONTROLLER, METHOD_GET_ACCESSIBILITY_ROOT_NODE), queryController);
    }

}
