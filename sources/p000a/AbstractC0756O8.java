package p000a;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.topjohnwu.magisk.R;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;

/* renamed from: a.O8 */
/* loaded from: classes.dex */
public abstract class AbstractC0756O8 {

    /* renamed from: z */
    public static String f2569z;

    static {
        AbstractC1292YB.m2661T(Integer.valueOf((int) R.string.no_info_provided), Integer.valueOf((int) R.string.release_notes), Integer.valueOf((int) R.string.invalid_update_channel), Integer.valueOf((int) R.string.update_available), Integer.valueOf((int) R.drawable.ic_device), Integer.valueOf((int) R.drawable.ic_more), Integer.valueOf((int) R.drawable.ic_magisk_delete), Integer.valueOf((int) R.drawable.ic_refresh_data_md2), Integer.valueOf((int) R.drawable.ic_order_date), Integer.valueOf((int) R.drawable.ic_order_name), Integer.valueOf((int) R.array.allow_timeout));
    }

    /* renamed from: h */
    public static final ComponentName m1728h(Class cls, String str) {
        String name;
        Map map;
        C0175DP c0175dp = C1910jw.f5962h;
        if (c0175dp == null || (map = (Map) ((Object[]) c0175dp.f541R)[1]) == null || (name = (String) map.get(cls.getName())) == null) {
            name = cls.getName();
        }
        return new ComponentName(str, name);
    }

    /* renamed from: v */
    public static final void m1729v(Context context) {
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        Resources resources = context.getResources();
        if (AbstractC0795Op.m1857n()) {
            String str = f2569z;
            if (str == null) {
                str = null;
            }
            m1730z(resources, str);
        }
        Locale locale = AbstractC1685fh.f5274z;
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(AbstractC1685fh.f5274z);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }

    /* renamed from: z */
    public static final void m1730z(Resources resources, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ResourcesLoader[] resourcesLoaderArr = new ResourcesLoader[1];
                File file = new File(str);
                ResourcesLoader m660N = AbstractC0309Fu.m660N();
                m660N.addProvider(file.isDirectory() ? ResourcesProvider.loadFromDirectory(file.getPath(), null) : ResourcesProvider.loadFromApk(ParcelFileDescriptor.open(file, 268435456)));
                resourcesLoaderArr[0] = m660N;
                resources.addLoaders(resourcesLoaderArr);
                return;
            } catch (IOException | Exception unused) {
                return;
            }
        }
        AssetManager assets = resources.getAssets();
        if (AbstractC2575wW.f7882i == null) {
            AbstractC2575wW.f7882i = AssetManager.class.getMethod("addAssetPath", String.class);
        }
        AbstractC2575wW.f7882i.invoke(assets, str);
    }
}
