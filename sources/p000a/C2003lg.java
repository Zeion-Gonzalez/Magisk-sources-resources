package p000a;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C2755N;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: a.lg */
/* loaded from: classes.dex */
public final class C2003lg extends AbstractC1500cH {

    /* renamed from: N */
    public boolean f6220N;

    /* renamed from: P */
    public final C2236q9 f6221P;

    /* renamed from: Q */
    public boolean f6222Q;

    /* renamed from: W */
    public final RunnableC1286Y5 f6223W;

    /* renamed from: h */
    public final C2444u1 f6224h;

    /* renamed from: o */
    public final ArrayList f6225o;

    /* renamed from: u */
    public boolean f6226u;

    /* renamed from: v */
    public final Window.Callback f6227v;

    public C2003lg(MaterialToolbar materialToolbar, CharSequence charSequence, WindowCallbackC0319G6 windowCallbackC0319G6) {
        super(0);
        this.f6225o = new ArrayList();
        this.f6223W = new RunnableC1286Y5(1, this);
        C2236q9 c2236q9 = new C2236q9(this);
        C2444u1 c2444u1 = new C2444u1(materialToolbar, false);
        this.f6224h = c2444u1;
        windowCallbackC0319G6.getClass();
        this.f6227v = windowCallbackC0319G6;
        c2444u1.f7469M = windowCallbackC0319G6;
        materialToolbar.f8838b = c2236q9;
        if (!c2444u1.f7479u) {
            c2444u1.f7478o = charSequence;
            if ((c2444u1.f7477h & 8) != 0) {
                materialToolbar.m4744Y(charSequence);
                if (c2444u1.f7479u) {
                    AbstractC2446u3.m4220S(materialToolbar.getRootView(), charSequence);
                }
            }
        }
        this.f6221P = new C2236q9(this);
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: G */
    public final void mo2900G(boolean z) {
        if (z == this.f6226u) {
            return;
        }
        this.f6226u = z;
        ArrayList arrayList = this.f6225o;
        if (arrayList.size() <= 0) {
            return;
        }
        AbstractC2441tz.m4202q(arrayList.get(0));
        throw null;
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: H */
    public final void mo2901H(CharSequence charSequence) {
        C2444u1 c2444u1 = this.f6224h;
        if (!c2444u1.f7479u) {
            c2444u1.f7478o = charSequence;
            if ((c2444u1.f7477h & 8) != 0) {
                Toolbar toolbar = c2444u1.f7482z;
                toolbar.m4744Y(charSequence);
                if (c2444u1.f7479u) {
                    AbstractC2446u3.m4220S(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: I */
    public final void mo2902I() {
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: J */
    public final void mo2903J(int i) {
        CharSequence charSequence;
        C2444u1 c2444u1 = this.f6224h;
        if (i != 0) {
            charSequence = c2444u1.f7482z.getContext().getText(i);
        } else {
            charSequence = null;
        }
        c2444u1.m4211h(charSequence);
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: S */
    public final Context mo2905S() {
        return this.f6224h.f7482z.getContext();
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: V */
    public final int mo2906V() {
        return this.f6224h.f7477h;
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: Y */
    public final void mo2909Y(boolean z) {
    }

    /* renamed from: Z */
    public final C2189pE m3627Z() {
        boolean z = this.f6222Q;
        C2444u1 c2444u1 = this.f6224h;
        if (!z) {
            C1379Zo c1379Zo = new C1379Zo(this);
            C2236q9 c2236q9 = new C2236q9(this);
            Toolbar toolbar = c2444u1.f7482z;
            toolbar.f8853od = c1379Zo;
            toolbar.f8851nF = c2236q9;
            ActionMenuView actionMenuView = toolbar.f8832S;
            if (actionMenuView != null) {
                actionMenuView.f8765j = c1379Zo;
                actionMenuView.f8760L = c2236q9;
            }
            this.f6222Q = true;
        }
        return c2444u1.f7482z.m4737M();
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: c */
    public final void mo2910c(CharSequence charSequence) {
        this.f6224h.m4211h(null);
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: g */
    public final boolean mo2912g(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo2918s();
        }
        return true;
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: k */
    public final boolean mo2914k(int i, KeyEvent keyEvent) {
        C2189pE m3627Z = m3627Z();
        if (m3627Z == null) {
            return false;
        }
        m3627Z.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return m3627Z.performShortcut(i, keyEvent, 0);
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: o */
    public final boolean mo2915o() {
        boolean z;
        C1117Uu c1117Uu;
        C2755N c2755n = this.f6224h.f7482z.f8825HL;
        if (c2755n != null && c2755n.f8781R != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (c2755n == null) {
            c1117Uu = null;
        } else {
            c1117Uu = c2755n.f8781R;
        }
        if (c1117Uu != null) {
            c1117Uu.collapseActionView();
        }
        return true;
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: q */
    public final void mo2916q() {
        this.f6224h.f7482z.removeCallbacks(this.f6223W);
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: r */
    public final void mo2917r(boolean z) {
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: s */
    public final boolean mo2918s() {
        boolean z;
        ActionMenuView actionMenuView = this.f6224h.f7482z.f8832S;
        if (actionMenuView == null) {
            return false;
        }
        C2192pI c2192pI = actionMenuView.f8767p;
        if (c2192pI != null && c2192pI.m3809w()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: u */
    public final boolean mo2919u() {
        boolean z;
        ActionMenuView actionMenuView = this.f6224h.f7482z.f8832S;
        if (actionMenuView == null) {
            return false;
        }
        C2192pI c2192pI = actionMenuView.f8767p;
        if (c2192pI != null && c2192pI.m3807Q()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // p000a.AbstractC1500cH
    /* renamed from: w */
    public final boolean mo2921w() {
        C2444u1 c2444u1 = this.f6224h;
        Toolbar toolbar = c2444u1.f7482z;
        RunnableC1286Y5 runnableC1286Y5 = this.f6223W;
        toolbar.removeCallbacks(runnableC1286Y5);
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        AbstractC2397t8.m4120S(c2444u1.f7482z, runnableC1286Y5);
        return true;
    }
}
