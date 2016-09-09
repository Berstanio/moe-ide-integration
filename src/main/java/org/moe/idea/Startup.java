/*
Copyright (C) 2016 Migeran

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe.idea;

import com.intellij.openapi.application.ApplicationInfo;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupActivity;
import org.moe.idea.utils.logger.LoggerFactory;

/**
 * This is our StartupActivity used to execute code on project open.
 */
public class Startup implements StartupActivity {

    private static final Logger LOG = LoggerFactory.getLogger(Startup.class);

    @Override
    public void runActivity(Project project) {
        LOG.info("Plugin started " + ApplicationInfo.getInstance().getBuild().asString()
                + " (" + ApplicationInfo.getInstance().getVersionName()
                + " " + ApplicationInfo.getInstance().getFullVersion() + ")");
    }

}
