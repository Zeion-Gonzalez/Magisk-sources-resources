package p000a;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: a.WD */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1187WD extends Activity implements InterfaceC1546d7, InterfaceC2680yc {

    /* renamed from: S */
    public final C0326GG f3865S = new C0326GG(this);

    @Override // p000a.InterfaceC2680yc
    /* renamed from: P */
    public final boolean mo2449P(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !AbstractC2575wW.m4431g(decorView, keyEvent)) {
            return AbstractC2575wW.m4457y(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !AbstractC2575wW.m4431g(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = FragmentC0177DR.f544R;
        C1665fK.m3152q(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        EnumC1632eh enumC1632eh = EnumC1632eh.f5092w;
        C0326GG c0326gg = this.f3865S;
        c0326gg.m722P("markState");
        c0326gg.m726u(enumC1632eh);
        super.onSaveInstanceState(bundle);
    }
}
