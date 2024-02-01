package p000a;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: a.LH */
/* loaded from: classes.dex */
public final class C0602LH extends AbstractC1034TO implements InterfaceC2383sq {

    /* renamed from: H */
    public static final int[] f1930H = {16842919};

    /* renamed from: e */
    public static final int[] f1931e = new int[0];

    /* renamed from: G */
    public final int f1933G;

    /* renamed from: I */
    public float f1934I;

    /* renamed from: J */
    public int f1935J;

    /* renamed from: M */
    public int f1936M;

    /* renamed from: N */
    public final int f1937N;

    /* renamed from: P */
    public final Drawable f1938P;

    /* renamed from: Q */
    public final int f1939Q;

    /* renamed from: R */
    public int f1940R;

    /* renamed from: S */
    public float f1941S;

    /* renamed from: V */
    public int f1943V;

    /* renamed from: W */
    public final int f1944W;

    /* renamed from: Y */
    public final ValueAnimator f1945Y;

    /* renamed from: c */
    public final RunnableC1484bv f1946c;

    /* renamed from: g */
    public RecyclerView f1948g;

    /* renamed from: h */
    public final int f1949h;

    /* renamed from: o */
    public final Drawable f1951o;

    /* renamed from: u */
    public final StateListDrawable f1955u;

    /* renamed from: v */
    public final StateListDrawable f1956v;

    /* renamed from: w */
    public int f1957w;

    /* renamed from: z */
    public final int f1959z;

    /* renamed from: q */
    public int f1952q = 0;

    /* renamed from: k */
    public int f1950k = 0;

    /* renamed from: y */
    public boolean f1958y = false;

    /* renamed from: s */
    public boolean f1954s = false;

    /* renamed from: U */
    public int f1942U = 0;

    /* renamed from: E */
    public int f1932E = 0;

    /* renamed from: f */
    public final int[] f1947f = new int[2];

    /* renamed from: r */
    public final int[] f1953r = new int[2];

    public C0602LH(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1945Y = ofFloat;
        this.f1935J = 0;
        RunnableC1484bv runnableC1484bv = new RunnableC1484bv(r0 ? 1 : 0, this);
        this.f1946c = runnableC1484bv;
        C0056B5 c0056b5 = new C0056B5(r0 ? 1 : 0, this);
        this.f1956v = stateListDrawable;
        this.f1938P = drawable;
        this.f1955u = stateListDrawable2;
        this.f1951o = drawable2;
        this.f1937N = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f1939Q = Math.max(i, drawable.getIntrinsicWidth());
        this.f1944W = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f1933G = Math.max(i, drawable2.getIntrinsicWidth());
        this.f1959z = i2;
        this.f1949h = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0027AV(this));
        ofFloat.addUpdateListener(new C1272Xq(this));
        RecyclerView recyclerView2 = this.f1948g;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            AbstractC0667Md abstractC0667Md = recyclerView2.f9077J;
            if (abstractC0667Md != null) {
                abstractC0667Md.mo1553v("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f9073H;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m4918T();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f1948g;
            recyclerView3.f9103e.remove(this);
            if (recyclerView3.f9070F == this) {
                recyclerView3.f9070F = null;
            }
            ArrayList arrayList2 = this.f1948g.f9099d2;
            if (arrayList2 != null) {
                arrayList2.remove(c0056b5);
            }
            this.f1948g.removeCallbacks(runnableC1484bv);
        }
        this.f1948g = recyclerView;
        if (recyclerView != null) {
            recyclerView.m4922W(this);
            this.f1948g.f9103e.add(this);
            this.f1948g.m4907G(c0056b5);
        }
    }

    /* renamed from: N */
    public final boolean m1325N(float f, float f2) {
        boolean z;
        RecyclerView recyclerView = this.f1948g;
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        if (AbstractC0095Bq.m199P(recyclerView) == 1) {
            z = true;
        } else {
            z = false;
        }
        int i = this.f1937N;
        if (z) {
            if (f > i) {
                return false;
            }
        } else if (f < this.f1952q - i) {
            return false;
        }
        int i2 = this.f1943V;
        int i3 = this.f1936M / 2;
        if (f2 < i2 - i3 || f2 > i3 + i2) {
            return false;
        }
        return true;
    }

    /* renamed from: P */
    public final boolean m1326P(float f, float f2) {
        if (f2 >= this.f1950k - this.f1944W) {
            int i = this.f1957w;
            int i2 = this.f1940R;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Q */
    public final void m1327Q(int i) {
        RecyclerView recyclerView = this.f1948g;
        RunnableC1484bv runnableC1484bv = this.f1946c;
        recyclerView.removeCallbacks(runnableC1484bv);
        this.f1948g.postDelayed(runnableC1484bv, i);
    }

    /* renamed from: o */
    public final void m1328o() {
        int i = this.f1935J;
        ValueAnimator valueAnimator = this.f1945Y;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f1935J = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    /* renamed from: u */
    public final void m1329u(int i) {
        int i2;
        StateListDrawable stateListDrawable = this.f1956v;
        if (i == 2 && this.f1942U != 2) {
            stateListDrawable.setState(f1930H);
            this.f1948g.removeCallbacks(this.f1946c);
        }
        if (i == 0) {
            this.f1948g.invalidate();
        } else {
            m1328o();
        }
        if (this.f1942U == 2 && i != 2) {
            stateListDrawable.setState(f1931e);
            i2 = 1200;
        } else {
            if (i == 1) {
                i2 = 1500;
            }
            this.f1942U = i;
        }
        m1327Q(i2);
        this.f1942U = i;
    }

    @Override // p000a.AbstractC1034TO
    /* renamed from: v */
    public final void mo1330v(Canvas canvas, RecyclerView recyclerView) {
        int i;
        if (this.f1952q == this.f1948g.getWidth() && this.f1950k == this.f1948g.getHeight()) {
            if (this.f1935J != 0) {
                if (this.f1958y) {
                    int i2 = this.f1952q;
                    int i3 = this.f1937N;
                    int i4 = i2 - i3;
                    int i5 = this.f1943V;
                    int i6 = this.f1936M;
                    int i7 = i5 - (i6 / 2);
                    StateListDrawable stateListDrawable = this.f1956v;
                    stateListDrawable.setBounds(0, 0, i3, i6);
                    int i8 = this.f1950k;
                    int i9 = this.f1939Q;
                    Drawable drawable = this.f1938P;
                    drawable.setBounds(0, 0, i9, i8);
                    RecyclerView recyclerView2 = this.f1948g;
                    WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                    boolean z = true;
                    if (AbstractC0095Bq.m199P(recyclerView2) != 1) {
                        z = false;
                    }
                    if (z) {
                        drawable.draw(canvas);
                        canvas.translate(i3, i7);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        i = -i3;
                    } else {
                        canvas.translate(i4, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i7);
                        stateListDrawable.draw(canvas);
                        i = -i4;
                    }
                    canvas.translate(i, -i7);
                }
                if (this.f1954s) {
                    int i10 = this.f1950k;
                    int i11 = this.f1944W;
                    int i12 = i10 - i11;
                    int i13 = this.f1957w;
                    int i14 = this.f1940R;
                    int i15 = i13 - (i14 / 2);
                    StateListDrawable stateListDrawable2 = this.f1955u;
                    stateListDrawable2.setBounds(0, 0, i14, i11);
                    int i16 = this.f1952q;
                    int i17 = this.f1933G;
                    Drawable drawable2 = this.f1951o;
                    drawable2.setBounds(0, 0, i16, i17);
                    canvas.translate(0.0f, i12);
                    drawable2.draw(canvas);
                    canvas.translate(i15, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i15, -i12);
                    return;
                }
                return;
            }
            return;
        }
        this.f1952q = this.f1948g.getWidth();
        this.f1950k = this.f1948g.getHeight();
        m1329u(0);
    }
}
