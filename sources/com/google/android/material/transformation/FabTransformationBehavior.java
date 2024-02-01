package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import p000a.AbstractC1090US;
import p000a.C0030Ab;
import p000a.C1168Vr;
import p000a.C1493c6;
import p000a.C1624eZ;
import p000a.C1710g8;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: N */
    public final RectF f9553N;

    /* renamed from: P */
    public final RectF f9554P;

    /* renamed from: Q */
    public final int[] f9555Q;

    /* renamed from: o */
    public float f9556o;

    /* renamed from: u */
    public float f9557u;

    /* renamed from: v */
    public final Rect f9558v;

    public FabTransformationBehavior() {
        this.f9558v = new Rect();
        this.f9554P = new RectF();
        this.f9553N = new RectF();
        this.f9555Q = new int[2];
    }

    /* renamed from: f */
    public static float m5119f(C1624eZ c1624eZ, C1493c6 c1493c6, float f) {
        long j = c1493c6.f4636z;
        C1493c6 m72Q = ((C0030Ab) c1624eZ.f5013R).m72Q("expansion");
        float interpolation = c1493c6.m2892h().getInterpolation(((float) (((m72Q.f4636z + m72Q.f4634h) + 17) - j)) / ((float) c1493c6.f4634h));
        LinearInterpolator linearInterpolator = AbstractC1090US.f3564z;
        return ((0.0f - f) * interpolation) + f;
    }

    /* renamed from: s */
    public static Pair m5120s(float f, float f2, boolean z, C1624eZ c1624eZ) {
        C1493c6 m72Q;
        C0030Ab c0030Ab;
        String str;
        if (f == 0.0f || f2 == 0.0f) {
            m72Q = ((C0030Ab) c1624eZ.f5013R).m72Q("translationXLinear");
            c0030Ab = (C0030Ab) c1624eZ.f5013R;
            str = "translationYLinear";
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            m72Q = ((C0030Ab) c1624eZ.f5013R).m72Q("translationXCurveDownwards");
            c0030Ab = (C0030Ab) c1624eZ.f5013R;
            str = "translationYCurveDownwards";
        } else {
            m72Q = ((C0030Ab) c1624eZ.f5013R).m72Q("translationXCurveUpwards");
            c0030Ab = (C0030Ab) c1624eZ.f5013R;
            str = "translationYCurveUpwards";
        }
        return new Pair(m72Q, c0030Ab.m72Q(str));
    }

    /* renamed from: E */
    public final float m5121E(View view, View view2, C1710g8 c1710g8) {
        RectF rectF = this.f9554P;
        RectF rectF2 = this.f9553N;
        m5124r(view, rectF);
        rectF.offset(this.f9557u, this.f9556o);
        m5124r(view2, rectF2);
        c1710g8.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    /* renamed from: U */
    public final float m5122U(View view, View view2, C1710g8 c1710g8) {
        RectF rectF = this.f9554P;
        RectF rectF2 = this.f9553N;
        m5124r(view, rectF);
        rectF.offset(this.f9557u, this.f9556o);
        m5124r(view2, rectF2);
        c1710g8.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    /* renamed from: Y */
    public abstract C1624eZ mo5123Y(Context context, boolean z);

    @Override // com.google.android.material.transformation.ExpandableBehavior, p000a.AbstractC1131VA
    /* renamed from: h */
    public final boolean mo2321h(View view, View view2) {
        int i;
        if (view.getVisibility() != 8) {
            if ((view2 instanceof FloatingActionButton) && ((i = ((FloatingActionButton) view2).f9368f.f7756h) == 0 || i == view.getId())) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    /* renamed from: r */
    public final void m5124r(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f9555Q);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    @Override // p000a.AbstractC1131VA
    /* renamed from: v */
    public final void mo2326v(C1168Vr c1168Vr) {
        if (c1168Vr.f3813o == 0) {
            c1168Vr.f3813o = 80;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03ce A[LOOP:0: B:99:0x03cc->B:100:0x03ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0360  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.AnimatorSet mo5118y(android.view.View r25, android.view.View r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 987
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.mo5118y(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9558v = new Rect();
        this.f9554P = new RectF();
        this.f9553N = new RectF();
        this.f9555Q = new int[2];
    }
}
