package ua.lelpel.coloredcircles;

import android.app.Application;

/**
 * @author bruce
 * @date 22.04.2018
 */
public class App extends Application {
    private ResourceManager resourceManager;

    @Override
    public void onCreate() {
        super.onCreate();

        resourceManager = new ResourceManager(this);
    }

    public ResourceManager getResourceManager() {
        return resourceManager;
    }
}
