package p000a;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* renamed from: a.Ky */
/* loaded from: classes.dex */
public abstract class AbstractC0586Ky {
    /* renamed from: h */
    public static ActionMode m1313h(Window.Callback callback, ActionMode.Callback callback2, int i) {
        return callback.onWindowStartingActionMode(callback2, i);
    }

    /* renamed from: z */
    public static boolean m1314z(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }
}
