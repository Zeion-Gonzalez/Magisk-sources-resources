package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000a.AbstractC0795Op;
import p000a.AbstractC0863Q8;
import p000a.AbstractC1090US;
import p000a.AbstractC2397t8;
import p000a.AbstractC2446u3;
import p000a.InterfaceC1291YA;

/* loaded from: classes.dex */
public class ClockHandView extends View {

    /* renamed from: E */
    public double f9530E;

    /* renamed from: I */
    public final int f9531I;

    /* renamed from: R */
    public boolean f9532R;

    /* renamed from: S */
    public final ValueAnimator f9533S;

    /* renamed from: U */
    public boolean f9534U;

    /* renamed from: f */
    public int f9535f;

    /* renamed from: g */
    public final RectF f9536g;

    /* renamed from: k */
    public final Paint f9537k;

    /* renamed from: q */
    public final float f9538q;

    /* renamed from: r */
    public int f9539r;

    /* renamed from: s */
    public float f9540s;

    /* renamed from: w */
    public final ArrayList f9541w;

    /* renamed from: y */
    public final int f9542y;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f9533S = new ValueAnimator();
        this.f9541w = new ArrayList();
        Paint paint = new Paint();
        this.f9537k = paint;
        this.f9536g = new RectF();
        this.f9539r = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0863Q8.f2928W, R.attr.materialClockStyle, 2131952778);
        AbstractC0795Op.m1831U8(context, R.attr.motionDurationLong2, 200);
        AbstractC0795Op.m1802BO(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC1090US.f3562h);
        this.f9535f = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f9531I = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f9542y = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f9538q = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m5113h(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        AbstractC2397t8.m4123g(this, 2);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: h */
    public final void m5113h(float f) {
        ValueAnimator valueAnimator = this.f9533S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        m5114v(f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float m5115z = m5115z(this.f9539r);
        float cos = (((float) Math.cos(this.f9530E)) * m5115z) + f;
        float f2 = height;
        float sin = (m5115z * ((float) Math.sin(this.f9530E))) + f2;
        Paint paint = this.f9537k;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f9531I, paint);
        double sin2 = Math.sin(this.f9530E);
        paint.setStrokeWidth(this.f9542y);
        canvas.drawLine(f, f2, width + ((int) (Math.cos(this.f9530E) * r12)), height + ((int) (r12 * sin2)), paint);
        canvas.drawCircle(f, f2, this.f9538q, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f9533S.isRunning()) {
            m5113h(this.f9540s);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z4 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z2 = false;
                z = false;
            } else {
                z2 = this.f9534U;
                if (this.f9532R) {
                    if (((float) Math.hypot(x - (getWidth() / 2), y - (getHeight() / 2))) <= m5115z(2) + TypedValue.applyDimension(1, 12, getContext().getResources().getDisplayMetrics())) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    this.f9539r = i;
                }
                z = false;
            }
        } else {
            this.f9534U = false;
            z = true;
            z2 = false;
        }
        boolean z5 = this.f9534U;
        int degrees = ((int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)))) + 90;
        if (degrees < 0) {
            degrees += 360;
        }
        float f = degrees;
        if (this.f9540s != f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z || !z3) {
            if (z3 || z2) {
                m5113h(f);
            }
            this.f9534U = z5 | z4;
            return true;
        }
        z4 = true;
        this.f9534U = z5 | z4;
        return true;
    }

    /* renamed from: v */
    public final void m5114v(float f) {
        float f2 = f % 360.0f;
        this.f9540s = f2;
        this.f9530E = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float m5115z = m5115z(this.f9539r);
        float cos = (((float) Math.cos(this.f9530E)) * m5115z) + width;
        float sin = (m5115z * ((float) Math.sin(this.f9530E))) + height;
        float f3 = this.f9531I;
        this.f9536g.set(cos - f3, sin - f3, cos + f3, sin + f3);
        Iterator it = this.f9541w.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((InterfaceC1291YA) it.next());
            if (Math.abs(clockFaceView.f9517D - f2) > 0.001f) {
                clockFaceView.f9517D = f2;
                clockFaceView.m5112S();
            }
        }
        invalidate();
    }

    /* renamed from: z */
    public final int m5115z(int i) {
        return i == 2 ? Math.round(this.f9535f * 0.66f) : this.f9535f;
    }
}
