package ua.lelpel.coloredcircles;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;

/**
 * @author bruce
 * @date 22.04.2018
 */
public class ResourceManager {
    private Resources resources;

    public ResourceManager(Context context) {
        this.resources = context.getResources();
    }

    public Drawable getDrawable(@DrawableRes int id) {
        return resources.getDrawable(id);
    }

    @ColorInt
    public int getColor(@ColorRes int color) {
        return resources.getColor(color);
    }
}
