package p000a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;

/* renamed from: a.BY */
/* loaded from: classes.dex */
public abstract class AbstractC0081BY {

    /* renamed from: N */
    public C0030Ab f314N;

    /* renamed from: P */
    public final C2196pM f315P;

    /* renamed from: Q */
    public C0030Ab f316Q;

    /* renamed from: h */
    public final ExtendedFloatingActionButton f317h;

    /* renamed from: v */
    public final ArrayList f318v = new ArrayList();

    /* renamed from: z */
    public final Context f319z;

    public AbstractC0081BY(ExtendedFloatingActionButton extendedFloatingActionButton, C2196pM c2196pM) {
        this.f317h = extendedFloatingActionButton;
        this.f319z = extendedFloatingActionButton.getContext();
        this.f315P = c2196pM;
    }

    /* renamed from: N */
    public abstract void mo179N();

    /* renamed from: P */
    public void mo180P() {
        this.f315P.f6755R = null;
    }

    /* renamed from: Q */
    public abstract void mo181Q(Animator animator);

    /* renamed from: W */
    public abstract boolean mo182W();

    /* renamed from: h */
    public final AnimatorSet m183h(C0030Ab c0030Ab) {
        ArrayList arrayList = new ArrayList();
        boolean m74u = c0030Ab.m74u("opacity");
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f317h;
        if (m74u) {
            arrayList.add(c0030Ab.m71P("opacity", extendedFloatingActionButton, View.ALPHA));
        }
        if (c0030Ab.m74u("scale")) {
            arrayList.add(c0030Ab.m71P("scale", extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(c0030Ab.m71P("scale", extendedFloatingActionButton, View.SCALE_X));
        }
        if (c0030Ab.m74u("width")) {
            arrayList.add(c0030Ab.m71P("width", extendedFloatingActionButton, ExtendedFloatingActionButton.f9345l));
        }
        if (c0030Ab.m74u("height")) {
            arrayList.add(c0030Ab.m71P("height", extendedFloatingActionButton, ExtendedFloatingActionButton.f9344b));
        }
        if (c0030Ab.m74u("paddingStart")) {
            arrayList.add(c0030Ab.m71P("paddingStart", extendedFloatingActionButton, ExtendedFloatingActionButton.f9346nP));
        }
        if (c0030Ab.m74u("paddingEnd")) {
            arrayList.add(c0030Ab.m71P("paddingEnd", extendedFloatingActionButton, ExtendedFloatingActionButton.f9343Yd));
        }
        if (c0030Ab.m74u("labelOpacity")) {
            arrayList.add(c0030Ab.m71P("labelOpacity", extendedFloatingActionButton, new C0083Bb(this)));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AbstractC0795Op.m1855l(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: o */
    public abstract void mo184o();

    /* renamed from: u */
    public abstract void mo185u();

    /* renamed from: v */
    public abstract int mo186v();

    /* renamed from: z */
    public AnimatorSet mo187z() {
        C0030Ab c0030Ab = this.f316Q;
        if (c0030Ab == null) {
            if (this.f314N == null) {
                this.f314N = C0030Ab.m67h(this.f319z, mo186v());
            }
            c0030Ab = this.f314N;
            c0030Ab.getClass();
        }
        return m183h(c0030Ab);
    }
}
