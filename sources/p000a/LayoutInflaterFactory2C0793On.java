package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* renamed from: a.On */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0793On implements LayoutInflater.Factory2 {

    /* renamed from: S */
    public final AbstractC2173oy f2696S;

    /* renamed from: R */
    public final ArrayList f2695R = new ArrayList();

    /* renamed from: w */
    public final ArrayList f2697w = new ArrayList();

    public LayoutInflaterFactory2C0793On(AbstractC2173oy abstractC2173oy) {
        this.f2696S = abstractC2173oy;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View view2 = null;
        AbstractC2173oy abstractC2173oy = this.f2696S;
        View mo2802h = abstractC2173oy != null ? abstractC2173oy.mo2802h(str, context, attributeSet) : null;
        if (mo2802h == null) {
            Iterator it = this.f2695R.iterator();
            if (it.hasNext()) {
                AbstractC2441tz.m4202q(it.next());
                throw null;
            }
        }
        if (mo2802h == null) {
            Class[] clsArr = AbstractC1250XM.f4058z;
            if (Objects.equals(str, "view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                if (-1 != str.indexOf(46)) {
                    view2 = AbstractC1250XM.m2555z(context, str, attributeSet, null);
                } else {
                    String[] strArr = AbstractC1250XM.f4056h;
                    for (int i = 0; i < 3; i++) {
                        View m2555z = AbstractC1250XM.m2555z(context, str, attributeSet, strArr[i]);
                        if (m2555z != null) {
                            view2 = m2555z;
                            break;
                        }
                    }
                }
            } catch (Exception unused) {
            }
            mo2802h = view2;
        }
        if (mo2802h != null) {
            Iterator it2 = this.f2697w.iterator();
            while (it2.hasNext()) {
                ((C1124V2) it2.next()).getClass();
                TypedArray obtainStyledAttributes = mo2802h.getContext().obtainStyledAttributes(attributeSet, AbstractC1762h6.f5558z, 0, 0);
                boolean z = obtainStyledAttributes.getType(1) == 1 ? mo2802h.getContext().getResources().getBoolean(obtainStyledAttributes.getResourceId(1, 0)) : obtainStyledAttributes.getBoolean(1, false);
                int i2 = 2;
                int m3146N = C1665fK.m3146N(obtainStyledAttributes, mo2802h, 2);
                int m3146N2 = C1665fK.m3146N(obtainStyledAttributes, mo2802h, 3);
                int m3146N3 = C1665fK.m3146N(obtainStyledAttributes, mo2802h, 0);
                obtainStyledAttributes.recycle();
                if (z) {
                    mo2802h.setSystemUiVisibility(mo2802h.getSystemUiVisibility() | 256 | 1024 | 512);
                }
                if (m3146N != 0 || m3146N2 != 0 || m3146N3 != 0) {
                    C0018AK c0018ak = new C0018AK(mo2802h, m3146N, m3146N2, m3146N3);
                    WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                    AbstractC1548d9.m3014s(mo2802h, c0018ak);
                    mo2802h.setTag(R.id.tag_rikka_material_WindowInsetsHelper, c0018ak);
                    if (!mo2802h.isAttachedToWindow()) {
                        mo2802h.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0544KF(i2));
                    }
                }
            }
        }
        return mo2802h;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
