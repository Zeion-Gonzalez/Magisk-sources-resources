package p000a;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Method;

/* renamed from: a.gM */
/* loaded from: classes.dex */
public final class ActionModeCallbackC1719gM implements ActionMode.Callback {

    /* renamed from: N */
    public boolean f5397N;

    /* renamed from: P */
    public Method f5398P;

    /* renamed from: Q */
    public boolean f5399Q = false;

    /* renamed from: h */
    public final TextView f5400h;

    /* renamed from: v */
    public Class f5401v;

    /* renamed from: z */
    public final ActionMode.Callback f5402z;

    public ActionModeCallbackC1719gM(ActionMode.Callback callback, TextView textView) {
        this.f5402z = callback;
        this.f5400h = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f5402z.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f5402z.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f5402z.onDestroyActionMode(actionMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:221:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x009f A[SYNTHETIC] */
    @Override // android.view.ActionMode.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onPrepareActionMode(android.view.ActionMode r14, android.view.Menu r15) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.ActionModeCallbackC1719gM.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
    }
}
