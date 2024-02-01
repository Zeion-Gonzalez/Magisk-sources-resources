package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import p000a.AbstractC0795Op;
import p000a.C0964S5;
import p000a.C2716zG;
import p000a.InterfaceC1944kb;

/* loaded from: classes.dex */
public class CircularRevealCardView extends MaterialCardView implements InterfaceC1944kb {

    /* renamed from: f */
    public final C0964S5 f9334f;

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9334f = new C0964S5(this);
    }

    /* renamed from: P */
    public final void m5049P(C2716zG c2716zG) {
        boolean z;
        C0964S5 c0964s5 = this.f9334f;
        if (c2716zG == null) {
            c0964s5.f3276P = null;
        } else {
            C2716zG c2716zG2 = c0964s5.f3276P;
            if (c2716zG2 == null) {
                c0964s5.f3276P = new C2716zG(c2716zG);
            } else {
                float f = c2716zG.f8548z;
                float f2 = c2716zG.f8546h;
                float f3 = c2716zG.f8547v;
                c2716zG2.f8548z = f;
                c2716zG2.f8546h = f2;
                c2716zG2.f8547v = f3;
            }
            float f4 = c2716zG.f8547v;
            float f5 = c2716zG.f8548z;
            float f6 = c2716zG.f8546h;
            View view = c0964s5.f3277h;
            if (f4 + 1.0E-4f >= AbstractC0795Op.m1815I(f5, f6, view.getWidth(), view.getHeight())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c0964s5.f3276P.f8547v = Float.MAX_VALUE;
            }
        }
        c0964s5.f3277h.invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0045, code lost:
    
        if (r1 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0047, code lost:
    
        r1 = r0.f3277h;
        r11.drawRect(0.0f, 0.0f, r1.getWidth(), r1.getHeight(), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0035, code lost:
    
        if (r1 != false) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0028  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            a.S5 r0 = r10.f9334f
            if (r0 == 0) goto L8e
            a.zG r1 = r0.f3276P
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1b
            float r1 = r1.f8547v
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L15
            r1 = r3
            goto L16
        L15:
            r1 = r2
        L16:
            if (r1 == 0) goto L19
            goto L1b
        L19:
            r1 = r2
            goto L1c
        L1b:
            r1 = r3
        L1c:
            r1 = r1 ^ r3
            android.graphics.Paint r9 = r0.f3278v
            a.Yg r4 = r0.f3279z
            com.google.android.material.circularreveal.cardview.CircularRevealCardView r4 = (com.google.android.material.circularreveal.cardview.CircularRevealCardView) r4
            super.draw(r11)
            if (r1 == 0) goto L38
            int r1 = r9.getColor()
            int r1 = android.graphics.Color.alpha(r1)
            if (r1 == 0) goto L34
            r1 = r3
            goto L35
        L34:
            r1 = r2
        L35:
            if (r1 == 0) goto L59
            goto L47
        L38:
            int r1 = r9.getColor()
            int r1 = android.graphics.Color.alpha(r1)
            if (r1 == 0) goto L44
            r1 = r3
            goto L45
        L44:
            r1 = r2
        L45:
            if (r1 == 0) goto L59
        L47:
            r5 = 0
            r6 = 0
            android.view.View r1 = r0.f3277h
            int r4 = r1.getWidth()
            float r7 = (float) r4
            int r1 = r1.getHeight()
            float r8 = (float) r1
            r4 = r11
            r4.drawRect(r5, r6, r7, r8, r9)
        L59:
            android.graphics.drawable.Drawable r1 = r0.f3275N
            if (r1 == 0) goto L62
            a.zG r4 = r0.f3276P
            if (r4 == 0) goto L62
            r2 = r3
        L62:
            if (r2 == 0) goto L91
            android.graphics.Rect r1 = r1.getBounds()
            a.zG r2 = r0.f3276P
            float r2 = r2.f8548z
            int r3 = r1.width()
            float r3 = (float) r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            float r2 = r2 - r3
            a.zG r3 = r0.f3276P
            float r3 = r3.f8546h
            int r1 = r1.height()
            float r1 = (float) r1
            float r1 = r1 / r4
            float r3 = r3 - r1
            r11.translate(r2, r3)
            android.graphics.drawable.Drawable r0 = r0.f3275N
            r0.draw(r11)
            float r0 = -r2
            float r1 = -r3
            r11.translate(r0, r1)
            goto L91
        L8e:
            super.draw(r11)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.cardview.CircularRevealCardView.draw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isOpaque() {
        /*
            r4 = this;
            a.S5 r0 = r4.f9334f
            if (r0 == 0) goto L2b
            a.Yg r1 = r0.f3279z
            com.google.android.material.circularreveal.cardview.CircularRevealCardView r1 = (com.google.android.material.circularreveal.cardview.CircularRevealCardView) r1
            boolean r1 = super.isOpaque()
            r2 = 0
            if (r1 == 0) goto L2a
            a.zG r0 = r0.f3276P
            r1 = 1
            if (r0 == 0) goto L25
            float r0 = r0.f8547v
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L1f
            r0 = r1
            goto L20
        L1f:
            r0 = r2
        L20:
            if (r0 == 0) goto L23
            goto L25
        L23:
            r0 = r2
            goto L26
        L25:
            r0 = r1
        L26:
            r0 = r0 ^ r1
            if (r0 != 0) goto L2a
            r2 = r1
        L2a:
            return r2
        L2b:
            boolean r0 = super.isOpaque()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.cardview.CircularRevealCardView.isOpaque():boolean");
    }

    /* renamed from: v */
    public final C2716zG m5050v() {
        boolean z;
        C0964S5 c0964s5 = this.f9334f;
        C2716zG c2716zG = c0964s5.f3276P;
        if (c2716zG == null) {
            return null;
        }
        C2716zG c2716zG2 = new C2716zG(c2716zG);
        if (c2716zG2.f8547v == Float.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float f = c2716zG2.f8548z;
            float f2 = c2716zG2.f8546h;
            View view = c0964s5.f3277h;
            c2716zG2.f8547v = AbstractC0795Op.m1815I(f, f2, view.getWidth(), view.getHeight());
        }
        return c2716zG2;
    }
}
