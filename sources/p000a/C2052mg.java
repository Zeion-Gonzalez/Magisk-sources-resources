package p000a;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: a.mg */
/* loaded from: classes.dex */
public final class C2052mg implements InterfaceC0910R9, InterfaceC1468bb, InterfaceC1047Td {

    /* renamed from: R */
    public final Object f6382R;

    /* renamed from: S */
    public final /* synthetic */ int f6383S;

    public /* synthetic */ C2052mg(int i, Object obj) {
        this.f6383S = i;
        this.f6382R = obj;
    }

    /* renamed from: N */
    public int m3680N(View view) {
        int bottom;
        int i;
        int i2 = this.f6383S;
        Object obj = this.f6382R;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                C0419Hv c0419Hv = (C0419Hv) view.getLayoutParams();
                ((AbstractC0667Md) obj).getClass();
                bottom = view.getRight() + ((C0419Hv) view.getLayoutParams()).f1395h.right;
                i = ((ViewGroup.MarginLayoutParams) c0419Hv).rightMargin;
                break;
            default:
                C0419Hv c0419Hv2 = (C0419Hv) view.getLayoutParams();
                ((AbstractC0667Md) obj).getClass();
                bottom = view.getBottom() + ((C0419Hv) view.getLayoutParams()).f1395h.bottom;
                i = ((ViewGroup.MarginLayoutParams) c0419Hv2).bottomMargin;
                break;
        }
        return bottom + i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000a.InterfaceC0910R9
    /* renamed from: P */
    public C2621xJ mo47P(View view, C2621xJ c2621xJ) {
        boolean z;
        int i = 0;
        boolean z2 = true;
        int i2 = this.f6383S;
        C2621xJ c2621xJ2 = null;
        Object obj = this.f6382R;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                int m4515N = c2621xJ.m4515N();
                int m2798d = ((LayoutInflaterFactory2C1392a6) obj).m2798d(c2621xJ, null);
                if (m4515N != m2798d) {
                    int m4519v = c2621xJ.m4519v();
                    int m4516P = c2621xJ.m4516P();
                    int m4517h = c2621xJ.m4517h();
                    C2196pM c2196pM = new C2196pM(c2621xJ);
                    ((AbstractC1522cj) c2196pM.f6755R).mo2380u(C2739zj.m4673h(m4519v, m2798d, m4516P, m4517h));
                    c2621xJ = c2196pM.m3817R();
                }
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                WindowInsets m4518u = c2621xJ.m4518u();
                if (m4518u != null) {
                    WindowInsets m3063h = AbstractC1589dw.m3063h(view, m4518u);
                    if (!m3063h.equals(m4518u)) {
                        return C2621xJ.m4514o(view, m3063h);
                    }
                    return c2621xJ;
                }
                return c2621xJ;
            case 1:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                if (!AbstractC1451bD.m2871z(coordinatorLayout.f8901J, c2621xJ)) {
                    coordinatorLayout.f8901J = c2621xJ;
                    if (c2621xJ.m4515N() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    coordinatorLayout.f8905c = z;
                    if (z || coordinatorLayout.getBackground() != null) {
                        z2 = false;
                    }
                    coordinatorLayout.setWillNotDraw(z2);
                    C2194pK c2194pK = c2621xJ.f8107z;
                    if (!c2194pK.mo1087S()) {
                        int childCount = coordinatorLayout.getChildCount();
                        while (i < childCount) {
                            View childAt = coordinatorLayout.getChildAt(i);
                            WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
                            if (!AbstractC2397t8.m4124h(childAt) || ((C1168Vr) childAt.getLayoutParams()).f3818z == null || !c2194pK.mo1087S()) {
                                i++;
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                return c2621xJ;
            case 2:
                AppBarLayout appBarLayout = (AppBarLayout) obj;
                appBarLayout.getClass();
                WeakHashMap weakHashMap3 = AbstractC2446u3.f7488z;
                if (AbstractC2397t8.m4124h(appBarLayout)) {
                    c2621xJ2 = c2621xJ;
                }
                if (!AbstractC1451bD.m2871z(appBarLayout.f9172g, c2621xJ2)) {
                    appBarLayout.f9172g = c2621xJ2;
                    if (appBarLayout.f9175p != null && appBarLayout.m4986Q() > 0) {
                        i = 1;
                    }
                    appBarLayout.setWillNotDraw(i ^ 1);
                    appBarLayout.requestLayout();
                }
                return c2621xJ;
            default:
                AbstractC2691yn abstractC2691yn = (AbstractC2691yn) obj;
                abstractC2691yn.f8398R = c2621xJ.m4517h();
                abstractC2691yn.f8411w = c2621xJ.m4519v();
                abstractC2691yn.f8393I = c2621xJ.m4516P();
                abstractC2691yn.m4595Q();
                return c2621xJ;
        }
    }

    /* renamed from: Q */
    public int m3681Q(View view) {
        int top;
        int i;
        int i2 = this.f6383S;
        Object obj = this.f6382R;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                C0419Hv c0419Hv = (C0419Hv) view.getLayoutParams();
                ((AbstractC0667Md) obj).getClass();
                top = view.getLeft() - ((C0419Hv) view.getLayoutParams()).f1395h.left;
                i = ((ViewGroup.MarginLayoutParams) c0419Hv).leftMargin;
                break;
            default:
                C0419Hv c0419Hv2 = (C0419Hv) view.getLayoutParams();
                ((AbstractC0667Md) obj).getClass();
                top = view.getTop() - ((C0419Hv) view.getLayoutParams()).f1395h.top;
                i = ((ViewGroup.MarginLayoutParams) c0419Hv2).topMargin;
                break;
        }
        return top - i;
    }

    /* renamed from: W */
    public void m3682W(C1440b0 c1440b0) {
        StringBuilder sb;
        StringBuilder sb2;
        int i = this.f6383S;
        Object obj = this.f6382R;
        switch (i) {
            case 2:
                C0364Gx c0364Gx = (C0364Gx) obj;
                C2730zX c2730zX = (C2730zX) c0364Gx.f1249e.pollLast();
                if (c2730zX == null) {
                    sb2 = new StringBuilder("No Activities were started for result for ");
                    sb2.append(this);
                } else {
                    C0525Ju c0525Ju = c0364Gx.f1262v;
                    String str = c2730zX.f8576S;
                    AbstractComponentCallbacksC2342s3 m1221G = c0525Ju.m1221G(str);
                    if (m1221G == null) {
                        sb2 = new StringBuilder("Activity result delivered for unknown Fragment ");
                        sb2.append(str);
                    } else {
                        m1221G.m4001E(c2730zX.f8575R, c1440b0.f4513S, c1440b0.f4512R);
                        return;
                    }
                }
                Log.w("FragmentManager", sb2.toString());
                return;
            default:
                C0364Gx c0364Gx2 = (C0364Gx) obj;
                C2730zX c2730zX2 = (C2730zX) c0364Gx2.f1249e.pollFirst();
                if (c2730zX2 == null) {
                    sb = new StringBuilder("No IntentSenders were started for ");
                    sb.append(this);
                } else {
                    C0525Ju c0525Ju2 = c0364Gx2.f1262v;
                    String str2 = c2730zX2.f8576S;
                    AbstractComponentCallbacksC2342s3 m1221G2 = c0525Ju2.m1221G(str2);
                    if (m1221G2 == null) {
                        sb = new StringBuilder("Intent Sender result delivered for unknown Fragment ");
                        sb.append(str2);
                    } else {
                        m1221G2.m4001E(c2730zX2.f8575R, c1440b0.f4513S, c1440b0.f4512R);
                        return;
                    }
                }
                Log.w("FragmentManager", sb.toString());
                return;
        }
    }

    @Override // p000a.InterfaceC1468bb
    /* renamed from: h */
    public void mo2259h(Object obj) {
        StringBuilder sb;
        int i;
        switch (this.f6383S) {
            case AbstractC0795Op.f2698E /* 0 */:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (((Boolean) arrayList.get(i2)).booleanValue()) {
                        i = 0;
                    } else {
                        i = -1;
                    }
                    iArr[i2] = i;
                }
                C0364Gx c0364Gx = (C0364Gx) this.f6382R;
                C2730zX c2730zX = (C2730zX) c0364Gx.f1249e.pollFirst();
                if (c2730zX == null) {
                    sb = new StringBuilder("No permissions were requested for ");
                    sb.append(this);
                } else {
                    C0525Ju c0525Ju = c0364Gx.f1262v;
                    String str = c2730zX.f8576S;
                    if (c0525Ju.m1221G(str) == null) {
                        sb = new StringBuilder("Permission request result delivered for unknown Fragment ");
                        sb.append(str);
                    } else {
                        return;
                    }
                }
                Log.w("FragmentManager", sb.toString());
                return;
            case 1:
            default:
                m3682W((C1440b0) obj);
                return;
            case 2:
                m3682W((C1440b0) obj);
                return;
        }
    }

    /* renamed from: o */
    public void m3683o() {
        ((C0852Pu) this.f6382R).f2883q.m842x();
    }

    /* renamed from: u */
    public int m3684u() {
        int i;
        int m1523c;
        int i2 = this.f6383S;
        Object obj = this.f6382R;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                AbstractC0667Md abstractC0667Md = (AbstractC0667Md) obj;
                i = abstractC0667Md.f2165R;
                m1523c = abstractC0667Md.m1529e();
                break;
            default:
                AbstractC0667Md abstractC0667Md2 = (AbstractC0667Md) obj;
                i = abstractC0667Md2.f2173w;
                m1523c = abstractC0667Md2.m1523c();
                break;
        }
        return i - m1523c;
    }
}
