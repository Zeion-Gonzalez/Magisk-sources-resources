package androidx.appcompat.widget;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import p000a.C0455Id;
import p000a.C1117Uu;
import p000a.C2189pE;
import p000a.C2543vs;
import p000a.InterfaceC1748gs;
import p000a.InterfaceC2687yj;
import p000a.SubMenuC1188WE;
import p000a.ViewOnClickListenerC0061BD;

/* renamed from: androidx.appcompat.widget.N */
/* loaded from: classes.dex */
public final class C2755N implements InterfaceC2687yj {

    /* renamed from: R */
    public C1117Uu f8781R;

    /* renamed from: S */
    public C2189pE f8782S;

    /* renamed from: w */
    public final /* synthetic */ Toolbar f8783w;

    public C2755N(Toolbar toolbar) {
        this.f8783w = toolbar;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: G */
    public final void mo217G(Context context, C2189pE c2189pE) {
        C1117Uu c1117Uu;
        C2189pE c2189pE2 = this.f8782S;
        if (c2189pE2 != null && (c1117Uu = this.f8781R) != null) {
            c2189pE2.mo2453P(c1117Uu);
        }
        this.f8782S = c2189pE;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: N */
    public final boolean mo218N() {
        return false;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: P */
    public final boolean mo219P(SubMenuC1188WE subMenuC1188WE) {
        return false;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: R */
    public final boolean mo220R(C1117Uu c1117Uu) {
        Toolbar toolbar = this.f8783w;
        C2543vs c2543vs = toolbar.f8862y;
        int i = toolbar.f8827J;
        if (c2543vs == null) {
            C2543vs c2543vs2 = new C2543vs(toolbar.getContext(), null, R.attr.toolbarNavigationButtonStyle);
            toolbar.f8862y = c2543vs2;
            c2543vs2.setImageDrawable(toolbar.f8846k);
            toolbar.f8862y.setContentDescription(toolbar.f8843g);
            C0455Id c0455Id = new C0455Id();
            c0455Id.f298z = (i & 112) | 8388611;
            c0455Id.f1526h = 2;
            toolbar.f8862y.setLayoutParams(c0455Id);
            toolbar.f8862y.setOnClickListener(new ViewOnClickListenerC0061BD(toolbar));
        }
        ViewParent parent = toolbar.f8862y.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f8862y);
            }
            toolbar.addView(toolbar.f8862y);
        }
        View actionView = c1117Uu.getActionView();
        toolbar.f8858s = actionView;
        this.f8781R = c1117Uu;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f8858s);
            }
            C0455Id c0455Id2 = new C0455Id();
            c0455Id2.f298z = (i & 112) | 8388611;
            c0455Id2.f1526h = 2;
            toolbar.f8858s.setLayoutParams(c0455Id2);
            toolbar.addView(toolbar.f8858s);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar.getChildAt(childCount);
            if (((C0455Id) childAt.getLayoutParams()).f1526h != 2 && childAt != toolbar.f8832S) {
                toolbar.removeViewAt(childCount);
                toolbar.f8828K.add(childAt);
            }
        }
        toolbar.requestLayout();
        c1117Uu.f3627H = true;
        c1117Uu.f3634R.m3793I(false);
        View view = toolbar.f8858s;
        if (view instanceof InterfaceC1748gs) {
            ((InterfaceC1748gs) view).mo1324h();
        }
        toolbar.m4745c();
        return true;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: S */
    public final void mo221S(boolean z) {
        if (this.f8781R != null) {
            C2189pE c2189pE = this.f8782S;
            boolean z2 = false;
            if (c2189pE != null) {
                int size = c2189pE.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    if (this.f8782S.getItem(i) == this.f8781R) {
                        z2 = true;
                        break;
                    }
                    i++;
                }
            }
            if (z2) {
                return;
            }
            mo222V(this.f8781R);
        }
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: V */
    public final boolean mo222V(C1117Uu c1117Uu) {
        Toolbar toolbar = this.f8783w;
        View view = toolbar.f8858s;
        if (view instanceof InterfaceC1748gs) {
            ((InterfaceC1748gs) view).mo1323P();
        }
        toolbar.removeView(toolbar.f8858s);
        toolbar.removeView(toolbar.f8862y);
        toolbar.f8858s = null;
        ArrayList arrayList = toolbar.f8828K;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                toolbar.addView((View) arrayList.get(size));
            } else {
                arrayList.clear();
                this.f8781R = null;
                toolbar.requestLayout();
                c1117Uu.f3627H = false;
                c1117Uu.f3634R.m3793I(false);
                toolbar.m4745c();
                return true;
            }
        }
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: o */
    public final void mo224o(Parcelable parcelable) {
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: u */
    public final Parcelable mo225u() {
        return null;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: v */
    public final int mo226v() {
        return 0;
    }

    @Override // p000a.InterfaceC2687yj
    /* renamed from: z */
    public final void mo227z(C2189pE c2189pE, boolean z) {
    }
}
