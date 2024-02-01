package p000a;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: a.Bh */
/* loaded from: classes.dex */
public final class C0088Bh extends WindowInsetsAnimation$Callback {

    /* renamed from: P */
    public final HashMap f337P;

    /* renamed from: h */
    public List f338h;

    /* renamed from: v */
    public ArrayList f339v;

    /* renamed from: z */
    public final C1829iR f340z;

    public C0088Bh(C1829iR c1829iR) {
        super(0);
        this.f337P = new HashMap();
        this.f340z = c1829iR;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C1829iR c1829iR = this.f340z;
        m194z(windowInsetsAnimation);
        c1829iR.f5721h.setTranslationY(0.0f);
        this.f337P.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C1829iR c1829iR = this.f340z;
        m194z(windowInsetsAnimation);
        View view = c1829iR.f5721h;
        int[] iArr = c1829iR.f5719N;
        view.getLocationOnScreen(iArr);
        c1829iR.f5722v = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f339v;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f339v = arrayList2;
            this.f338h = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                WindowInsetsAnimation m664S = AbstractC0309Fu.m664S(list.get(size));
                C1482bt m194z = m194z(m664S);
                fraction = m664S.getFraction();
                m194z.f4621z.mo3216P(fraction);
                this.f339v.add(m194z);
            } else {
                C1829iR c1829iR = this.f340z;
                C2621xJ m4514o = C2621xJ.m4514o(null, windowInsets);
                c1829iR.m3382z(m4514o, this.f338h);
                return m4514o.m4518u();
            }
        }
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C1829iR c1829iR = this.f340z;
        m194z(windowInsetsAnimation);
        C1624eZ c1624eZ = new C1624eZ(bounds);
        View view = c1829iR.f5721h;
        int[] iArr = c1829iR.f5719N;
        view.getLocationOnScreen(iArr);
        int i = c1829iR.f5722v - iArr[1];
        c1829iR.f5720P = i;
        view.setTranslationY(i);
        AbstractC0309Fu.m657I();
        return AbstractC0309Fu.m659M(((C2739zj) c1624eZ.f5013R).m4676P(), ((C2739zj) c1624eZ.f5015w).m4676P());
    }

    /* renamed from: z */
    public final C1482bt m194z(WindowInsetsAnimation windowInsetsAnimation) {
        C1482bt c1482bt = (C1482bt) this.f337P.get(windowInsetsAnimation);
        if (c1482bt == null) {
            C1482bt c1482bt2 = new C1482bt(windowInsetsAnimation);
            this.f337P.put(windowInsetsAnimation, c1482bt2);
            return c1482bt2;
        }
        return c1482bt;
    }
}
