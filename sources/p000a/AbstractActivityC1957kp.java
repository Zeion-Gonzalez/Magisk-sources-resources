package p000a;

import android.view.KeyEvent;
import androidx.navigation.fragment.NavHostFragment;

/* renamed from: a.kp */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1957kp extends AbstractActivityC0819PG {

    /* renamed from: l */
    public final C1146VR f6062l = new C1146VR(new C1407aQ(5, this));

    @Override // p000a.AbstractActivityC0510Jd, p000a.AbstractActivityC1187WD, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        boolean z2 = false;
        if (this.f2782D != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AbstractC1890ja m3581f = m3581f();
            if (m3581f != null && m3581f.mo3520nP(keyEvent)) {
                z2 = true;
            }
            if (z2) {
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: f */
    public final AbstractC1890ja m3581f() {
        Object m4288d3 = AbstractC2486us.m4288d3(0, ((NavHostFragment) this.f6062l.getValue()).m4008W().f1262v.m1239w());
        if (m4288d3 instanceof AbstractC1890ja) {
            return (AbstractC1890ja) m4288d3;
        }
        return null;
    }

    @Override // androidx.activity.AbstractActivityC2754z, android.app.Activity
    public final void onBackPressed() {
        boolean z;
        boolean z2 = true;
        if (this.f2782D != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AbstractC1890ja m3581f = m3581f();
            if (m3581f == null || m3581f.mo3516b()) {
                z2 = false;
            }
            if (z2) {
                super.onBackPressed();
            }
        }
    }
}
