package p000a;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;

/* renamed from: a.yB */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC2660yB implements View.OnClickListener {

    /* renamed from: R */
    public Object f8288R;

    /* renamed from: S */
    public final /* synthetic */ int f8289S;

    public ViewOnClickListenerC2660yB() {
        this.f8289S = 3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewGroup viewGroup;
        switch (this.f8289S) {
            case AbstractC0795Op.f2698E /* 0 */:
                Object obj = this.f8288R;
                C0789Oh c0789Oh = (C0789Oh) obj;
                Button button = c0789Oh.f2662Q;
                Button button2 = c0789Oh.f2675u;
                Button button3 = c0789Oh.f2672o;
                C0789Oh c0789Oh2 = (C0789Oh) obj;
                c0789Oh2.f2656E.obtainMessage(1, c0789Oh2.f2670h).sendToTarget();
                return;
            case 1:
                C2292rA c2292rA = (C2292rA) this.f8288R;
                int i = c2292rA.f7086he;
                if (i == 2) {
                    c2292rA.m3948D(1);
                    return;
                } else {
                    if (i == 1) {
                        c2292rA.m3948D(2);
                        return;
                    }
                    return;
                }
            case 2:
                C1117Uu c1117Uu = ((C0065BH) view).f263C;
                AbstractC1706g4 abstractC1706g4 = (AbstractC1706g4) this.f8288R;
                if (!abstractC1706g4.f5364t.m3801q(c1117Uu, abstractC1706g4.f5349T, 0)) {
                    c1117Uu.setChecked(true);
                    return;
                }
                return;
            default:
                C0256Eu c0256Eu = (C0256Eu) this.f8288R;
                c0256Eu.getClass();
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    AbstractC0795Op.m1859nB(viewGroup);
                }
                boolean z = c0256Eu.f913I;
                boolean z2 = !z;
                if (z != z2) {
                    c0256Eu.f913I = z2;
                    AbstractC0795Op.m1801B(c0256Eu, 11);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ViewOnClickListenerC2660yB(int i, Object obj) {
        this.f8289S = i;
        this.f8288R = obj;
    }
}
