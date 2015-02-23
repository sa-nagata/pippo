/*
 * Copyright (C) 2014 the original author or authors.
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
package ro.pippo.core.controller;

import ro.pippo.core.util.ListenerList;

/**
 * @author Decebal Suiu
 */
public class ControllerInitializationListenerList extends ListenerList<ControllerInitializationListener>
    implements ControllerInitializationListener {

    @Override
    public void onInitialize(final Controller controller) {
        notify(new Notifier<ControllerInitializationListener>() {

            @Override
            public void notify(ControllerInitializationListener listener) {
                listener.onInitialize(controller);
            }

        });
    }

}
