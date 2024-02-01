package p000a;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;

/* renamed from: a.My */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0685My {
    /* renamed from: G */
    public static /* bridge */ /* synthetic */ ShortcutManager m1582G(Object obj) {
        return (ShortcutManager) obj;
    }

    /* renamed from: M */
    public static /* bridge */ /* synthetic */ Class m1584M() {
        return ShortcutManager.class;
    }

    /* renamed from: V */
    public static /* synthetic */ void m1591V() {
    }

    /* renamed from: g */
    public static /* synthetic */ ShortcutInfo.Builder m1593g(Context context) {
        return new ShortcutInfo.Builder(context, "modules");
    }

    /* renamed from: h */
    public static /* synthetic */ ShortcutInfo.Builder m1594h(Context context, String str) {
        return new ShortcutInfo.Builder(context, str);
    }

    /* renamed from: z */
    public static /* synthetic */ ShortcutInfo.Builder m1603z(Context context) {
        return new ShortcutInfo.Builder(context, "superuser");
    }
}
