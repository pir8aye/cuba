/*
 * Copyright (c) 2008-2017 Haulmont.
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

package com.haulmont.cuba.gui.components;

import java.util.Collection;

/**
 * A component which can be set as lookup component for a screen.
 */
public interface LookupComponent extends Component {
    /**
     * @param selectHandler handler that should be triggered if a LookupComponent
     *                      want to trigger Select action of Window.Lookup
     */
    void setLookupSelectHandler(Runnable selectHandler);

    /**
     * @return items selected in lookup component
     */
    Collection getLookupSelectedItems();
}
