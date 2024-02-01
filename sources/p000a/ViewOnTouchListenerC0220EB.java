package p000a;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

/* renamed from: a.EB */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0220EB implements View.OnTouchListener {

    /* renamed from: e */
    public static final int f693e = ViewConfiguration.getTapTimeout();

    /* renamed from: E */
    public final float[] f694E;

    /* renamed from: H */
    public final ListView f695H;

    /* renamed from: I */
    public RunnableC1286Y5 f696I;

    /* renamed from: J */
    public boolean f697J;

    /* renamed from: R */
    public final AccelerateInterpolator f698R;

    /* renamed from: S */
    public final C2017lw f699S;

    /* renamed from: U */
    public final float[] f700U;

    /* renamed from: Y */
    public boolean f701Y;

    /* renamed from: c */
    public boolean f702c;

    /* renamed from: f */
    public boolean f703f;

    /* renamed from: g */
    public int f704g;

    /* renamed from: k */
    public final float[] f705k;

    /* renamed from: q */
    public final float[] f706q;

    /* renamed from: r */
    public boolean f707r;

    /* renamed from: s */
    public final float[] f708s;

    /* renamed from: w */
    public final View f709w;

    /* renamed from: y */
    public int f710y;

    public ViewOnTouchListenerC0220EB(ListView listView) {
        C2017lw c2017lw = new C2017lw();
        this.f699S = c2017lw;
        this.f698R = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f706q = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f705k = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f708s = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f700U = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f694E = fArr5;
        this.f709w = listView;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f704g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f710y = f693e;
        c2017lw.f6271z = 500;
        c2017lw.f6267h = 500;
        this.f695H = listView;
    }

    /* renamed from: h */
    public static float m422h(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: N */
    public final void m423N() {
        int i = 0;
        if (this.f707r) {
            this.f697J = false;
            return;
        }
        C2017lw c2017lw = this.f699S;
        c2017lw.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - c2017lw.f6263N);
        int i3 = c2017lw.f6267h;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c2017lw.f6266W = i;
        c2017lw.f6268o = c2017lw.m3655z(currentAnimationTimeMillis);
        c2017lw.f6269u = currentAnimationTimeMillis;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0013, code lost:
    
        if (r0 != 3) goto L86;
     */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m424P(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            boolean r0 = r8.f702c
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r10.getActionMasked()
            r2 = 3
            r3 = 1
            if (r0 == 0) goto L1a
            if (r0 == r3) goto L16
            r4 = 2
            if (r0 == r4) goto L1e
            if (r0 == r2) goto L16
            goto L7b
        L16:
            r8.m423N()
            goto L7b
        L1a:
            r8.f701Y = r3
            r8.f703f = r1
        L1e:
            float r0 = r10.getX()
            int r4 = r9.getWidth()
            float r4 = (float) r4
            android.view.View r5 = r8.f709w
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r0 = r8.m427z(r0, r4, r6, r1)
            float r10 = r10.getY()
            int r9 = r9.getHeight()
            float r9 = (float) r9
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r9 = r8.m427z(r10, r9, r4, r3)
            a.lw r10 = r8.f699S
            r10.f6270v = r0
            r10.f6264P = r9
            boolean r9 = r8.f697J
            if (r9 != 0) goto L7b
            boolean r9 = r8.m425Q()
            if (r9 == 0) goto L7b
            a.Y5 r9 = r8.f696I
            if (r9 != 0) goto L5f
            a.Y5 r9 = new a.Y5
            r9.<init>(r2, r8)
            r8.f696I = r9
        L5f:
            r8.f697J = r3
            r8.f707r = r3
            boolean r9 = r8.f703f
            if (r9 != 0) goto L74
            int r9 = r8.f710y
            if (r9 <= 0) goto L74
            a.Y5 r10 = r8.f696I
            long r6 = (long) r9
            java.util.WeakHashMap r9 = p000a.AbstractC2446u3.f7488z
            p000a.AbstractC2397t8.m4119R(r5, r10, r6)
            goto L79
        L74:
            a.Y5 r9 = r8.f696I
            r9.run()
        L79:
            r8.f703f = r3
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.ViewOnTouchListenerC0220EB.m424P(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m425Q() {
        /*
            r8 = this;
            a.lw r0 = r8.f699S
            float r1 = r0.f6264P
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f6270v
            java.lang.Math.abs(r0)
            r0 = 0
            if (r1 == 0) goto L50
            android.widget.ListView r2 = r8.f695H
            int r3 = r2.getCount()
            r4 = 1
            if (r3 != 0) goto L1c
            goto L4b
        L1c:
            int r5 = r2.getChildCount()
            int r6 = r2.getFirstVisiblePosition()
            int r7 = r6 + r5
            if (r1 <= 0) goto L3a
            if (r7 < r3) goto L49
            int r5 = r5 - r4
            android.view.View r1 = r2.getChildAt(r5)
            int r1 = r1.getBottom()
            int r2 = r2.getHeight()
            if (r1 > r2) goto L49
            goto L4b
        L3a:
            if (r1 >= 0) goto L4b
            if (r6 > 0) goto L49
            android.view.View r1 = r2.getChildAt(r0)
            int r1 = r1.getTop()
            if (r1 < 0) goto L49
            goto L4b
        L49:
            r1 = r4
            goto L4c
        L4b:
            r1 = r0
        L4c:
            if (r1 != 0) goto L4f
            goto L50
        L4f:
            r0 = r4
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.ViewOnTouchListenerC0220EB.m425Q():boolean");
    }

    @Override // android.view.View.OnTouchListener
    public final /* bridge */ /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
        m424P(view, motionEvent);
        return false;
    }

    /* renamed from: v */
    public final float m426v(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f704g;
        if (i != 0 && i != 1) {
            if (i != 2 || f >= 0.0f) {
                return 0.0f;
            }
            return f / (-f2);
        }
        if (f >= f2) {
            return 0.0f;
        }
        if (f >= 0.0f) {
            return 1.0f - (f / f2);
        }
        if (!this.f697J || i != 1) {
            return 0.0f;
        }
        return 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float m427z(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f706q
            r0 = r0[r7]
            float[] r1 = r3.f705k
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = m422h(r0, r2, r1)
            float r1 = r3.m426v(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.m426v(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f698R
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = m422h(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            goto L58
        L3c:
            float[] r0 = r3.f708s
            r0 = r0[r7]
            float[] r1 = r3.f700U
            r1 = r1[r7]
            float[] r2 = r3.f694E
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r2 = m422h(r4, r1, r7)
            goto L58
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = m422h(r4, r1, r7)
            float r2 = -r4
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.ViewOnTouchListenerC0220EB.m427z(float, float, float, int):float");
    }
}
