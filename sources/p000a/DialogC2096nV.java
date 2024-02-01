package p000a;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C2752h;
import com.topjohnwu.magisk.R;

/* renamed from: a.nV */
/* loaded from: classes.dex */
public class DialogC2096nV extends Dialog implements InterfaceC1546d7, InterfaceC2112no, InterfaceC0277FG {

    /* renamed from: R */
    public final C1330Yx f6468R;

    /* renamed from: S */
    public C0326GG f6469S;

    /* renamed from: w */
    public final C2752h f6470w;

    public DialogC2096nV(Context context, int i) {
        super(context, i);
        this.f6468R = new C1330Yx(this);
        this.f6470w = new C2752h(new RunnableC0308Fs(2, this));
    }

    /* renamed from: z */
    public static void m3721z(DialogC2096nV dialogC2096nV) {
        super.onBackPressed();
    }

    @Override // p000a.InterfaceC1546d7
    /* renamed from: C */
    public final C0326GG mo1354C() {
        C0326GG c0326gg = this.f6469S;
        if (c0326gg == null) {
            C0326GG c0326gg2 = new C0326GG(this);
            this.f6469S = c0326gg2;
            return c0326gg2;
        }
        return c0326gg;
    }

    /* renamed from: P */
    public final void m3722P() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m3722P();
        super.addContentView(view, layoutParams);
    }

    @Override // p000a.InterfaceC0277FG
    /* renamed from: h */
    public final C1934kN mo576h() {
        return this.f6468R.f4218h;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f6470w.m4683h();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            C2752h c2752h = this.f6470w;
            c2752h.f8634N = onBackInvokedDispatcher;
            c2752h.m4684v(c2752h.f8638u);
        }
        this.f6468R.m2711h(bundle);
        C0326GG c0326gg = this.f6469S;
        if (c0326gg == null) {
            c0326gg = new C0326GG(this);
            this.f6469S = c0326gg;
        }
        c0326gg.m721N(EnumC2241qF.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        this.f6468R.m2712v(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0326GG c0326gg = this.f6469S;
        if (c0326gg == null) {
            c0326gg = new C0326GG(this);
            this.f6469S = c0326gg;
        }
        c0326gg.m721N(EnumC2241qF.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C0326GG c0326gg = this.f6469S;
        if (c0326gg == null) {
            c0326gg = new C0326GG(this);
            this.f6469S = c0326gg;
        }
        c0326gg.m721N(EnumC2241qF.ON_DESTROY);
        this.f6469S = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m3722P();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m3722P();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m3722P();
        super.setContentView(view, layoutParams);
    }
}
