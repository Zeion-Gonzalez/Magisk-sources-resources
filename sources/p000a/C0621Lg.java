package p000a;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: a.Lg */
/* loaded from: classes.dex */
public final class C0621Lg extends AbstractC1034TO {

    /* renamed from: N */
    public final int f2027N;

    /* renamed from: P */
    public final int f2028P;

    /* renamed from: h */
    public final int f2029h;

    /* renamed from: v */
    public final int f2030v;

    /* renamed from: z */
    public final /* synthetic */ int f2031z;

    public /* synthetic */ C0621Lg(int i, int i2, int i3, int i4, int i5) {
        this.f2031z = i5;
        this.f2029h = i;
        this.f2030v = i2;
        this.f2028P = i3;
        this.f2027N = i4;
    }

    @Override // p000a.AbstractC1034TO
    /* renamed from: z */
    public final void mo1388z(Rect rect, View view, RecyclerView recyclerView) {
        int i;
        boolean z;
        boolean z2;
        int i2 = this.f2031z;
        int i3 = this.f2028P;
        int i4 = this.f2029h;
        int i5 = this.f2027N;
        int i6 = this.f2030v;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                AbstractC0408Hk abstractC0408Hk = recyclerView.f9124r;
                if (abstractC0408Hk != null) {
                    AbstractC0249El m4894j = RecyclerView.m4894j(view);
                    if (m4894j != null) {
                        i = m4894j.m531v();
                    } else {
                        i = -1;
                    }
                    int mo918z = abstractC0408Hk.mo918z();
                    if (i == 0) {
                        rect.top = i6;
                    }
                    boolean z3 = true;
                    if (i == mo918z - 1) {
                        rect.bottom = i5;
                    }
                    AbstractC0667Md abstractC0667Md = recyclerView.f9077J;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if ((abstractC0667Md instanceof GridLayoutManager) && (layoutParams instanceof C2749zw)) {
                        int i7 = ((GridLayoutManager) abstractC0667Md).f9032F;
                        int i8 = ((C2749zw) layoutParams).f8615N;
                        if (i8 != 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (i8 != i7 - 1) {
                            z3 = false;
                        }
                        z = z3;
                        z3 = z2;
                    } else {
                        z = true;
                    }
                    if (z3) {
                        rect.left = i4;
                    }
                    if (z) {
                        rect.right = i3;
                        return;
                    }
                    return;
                }
                return;
            default:
                if (recyclerView.f9124r != null) {
                    rect.left = i4;
                    rect.top = i6;
                    rect.right = i3;
                    rect.bottom = i5;
                    return;
                }
                return;
        }
    }
}
