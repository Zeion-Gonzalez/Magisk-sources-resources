package p000a;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: a.sb */
/* loaded from: classes.dex */
public abstract class AbstractC2370sb extends AbstractC1131VA {

    /* renamed from: h */
    public int f7287h;

    /* renamed from: z */
    public C0087Bg f7288z;

    public AbstractC2370sb() {
        this.f7287h = 0;
    }

    /* renamed from: g */
    public final int m4095g() {
        C0087Bg c0087Bg = this.f7288z;
        if (c0087Bg != null) {
            return c0087Bg.f333P;
        }
        return 0;
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: o */
    public boolean mo2323o(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo250y(coordinatorLayout, view, i);
        if (this.f7288z == null) {
            this.f7288z = new C0087Bg(view);
        }
        C0087Bg c0087Bg = this.f7288z;
        View view2 = c0087Bg.f336z;
        c0087Bg.f334h = view2.getTop();
        c0087Bg.f335v = view2.getLeft();
        this.f7288z.m193z();
        int i2 = this.f7287h;
        if (i2 != 0) {
            C0087Bg c0087Bg2 = this.f7288z;
            if (c0087Bg2.f333P != i2) {
                c0087Bg2.f333P = i2;
                c0087Bg2.m193z();
            }
            this.f7287h = 0;
            return true;
        }
        return true;
    }

    /* renamed from: y */
    public void mo250y(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.m4784k(view, i);
    }

    public AbstractC2370sb(int i) {
        super(0);
        this.f7287h = 0;
    }
}
