package com.redhat.ceylon.intellij;

import com.intellij.ide.ApplicationLoadListener;
import com.intellij.openapi.application.Application;
import org.intellij.plugins.ceylon.runtime.CeylonRuntime;
import org.intellij.plugins.ceylon.runtime.PluginCeylonStartup;
import org.jetbrains.annotations.NotNull;

/**
 * This is both an {@link com.intellij.openapi.components.ApplicationComponent ApplicationComponent} and
 * an {@link ApplicationLoadListener}. See the comments in <code>plugin.xml</code> for more information.
 */
public class CeylonPluginInitializer extends PluginCeylonStartup implements ApplicationLoadListener {

    @Override
    public void beforeApplicationLoaded(@NotNull Application application, @NotNull String configPath) {
        super.initComponent();
    }

    @Override
    public void initComponent() {
        CeylonRuntime.registerIntellijApiModules();
    }

    @NotNull
    @Override
    public String getComponentName() {
        return "CeylonPluginInitializer";
    }
}
