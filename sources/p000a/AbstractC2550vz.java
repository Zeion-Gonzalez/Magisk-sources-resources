package p000a;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* renamed from: a.vz */
/* loaded from: classes.dex */
public abstract class AbstractC2550vz {
    /* renamed from: z */
    public static void m4367z(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i) {
        callback.onProvideKeyboardShortcuts(list, menu, i);
    }
}
