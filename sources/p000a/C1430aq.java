package p000a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: a.aq */
/* loaded from: classes.dex */
public final class C1430aq extends AbstractC0411Hn {

    /* renamed from: U */
    public static final PorterDuff.Mode f4478U = PorterDuff.Mode.SRC_IN;

    /* renamed from: I */
    public ColorFilter f4479I;

    /* renamed from: R */
    public C0212E2 f4480R;

    /* renamed from: g */
    public final float[] f4481g;

    /* renamed from: k */
    public boolean f4482k;

    /* renamed from: q */
    public boolean f4483q;

    /* renamed from: s */
    public final Rect f4484s;

    /* renamed from: w */
    public PorterDuffColorFilter f4485w;

    /* renamed from: y */
    public final Matrix f4486y;

    public C1430aq() {
        this.f4482k = true;
        this.f4481g = new float[9];
        this.f4486y = new Matrix();
        this.f4484s = new Rect();
        this.f4480R = new C0212E2();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            AbstractC0235ET.m477h(drawable);
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x00bb, code lost:
    
        if (r10 == false) goto L115;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1430aq.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            return AbstractC2338rz.m3995z(drawable);
        }
        return this.f4480R.f675h.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f1387S;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f4480R.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            return AbstractC0235ET.m480v(drawable);
        }
        return this.f4479I;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f1387S != null && Build.VERSION.SDK_INT >= 24) {
            return new C2048mb(this.f1387S.getConstantState());
        }
        this.f4480R.f679z = getChangingConfigurations();
        return this.f4480R;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f1387S;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f4480R.f675h.f3494W;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f1387S;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f4480R.f675h.f3496o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            return AbstractC2338rz.m3992P(drawable);
        }
        return this.f4480R.f670N;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C0212E2 c0212e2 = this.f4480R;
            if (c0212e2 != null) {
                C1061Tu c1061Tu = c0212e2.f675h;
                if (c1061Tu.f3491R == null) {
                    c1061Tu.f3491R = Boolean.valueOf(c1061Tu.f3497u.mo1248z());
                }
                if (c1061Tu.f3491R.booleanValue() || ((colorStateList = this.f4480R.f678v) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f4483q && super.mutate() == this) {
            this.f4480R = new C0212E2(this.f4480R);
            this.f4483q = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0212E2 c0212e2 = this.f4480R;
        ColorStateList colorStateList = c0212e2.f678v;
        if (colorStateList != null && (mode = c0212e2.f671P) != null) {
            this.f4485w = m2860z(colorStateList, mode);
            invalidateSelf();
            z = true;
        } else {
            z = false;
        }
        C1061Tu c1061Tu = c0212e2.f675h;
        if (c1061Tu.f3491R == null) {
            c1061Tu.f3491R = Boolean.valueOf(c1061Tu.f3497u.mo1248z());
        }
        if (c1061Tu.f3491R.booleanValue()) {
            boolean mo1247h = c0212e2.f675h.f3497u.mo1247h(iArr);
            c0212e2.f669M |= mo1247h;
            if (mo1247h) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f4480R.f675h.getRootAlpha() != i) {
            this.f4480R.f675h.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            AbstractC2338rz.m3991N(drawable, z);
        } else {
            this.f4480R.f670N = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4479I = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            AbstractC1843ih.m3440dx(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            AbstractC0235ET.m478o(drawable, colorStateList);
            return;
        }
        C0212E2 c0212e2 = this.f4480R;
        if (c0212e2.f678v != colorStateList) {
            c0212e2.f678v = colorStateList;
            this.f4485w = m2860z(colorStateList, c0212e2.f671P);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            AbstractC0235ET.m476W(drawable, mode);
            return;
        }
        C0212E2 c0212e2 = this.f4480R;
        if (c0212e2.f671P != mode) {
            c0212e2.f671P = mode;
            this.f4485w = m2860z(c0212e2.f678v, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f1387S;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: z */
    public final PorterDuffColorFilter m2860z(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public C1430aq(C0212E2 c0212e2) {
        this.f4482k = true;
        this.f4481g = new float[9];
        this.f4486y = new Matrix();
        this.f4484s = new Rect();
        this.f4480R = c0212e2;
        this.f4485w = m2860z(c0212e2.f678v, c0212e2.f671P);
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03d0  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r23, org.xmlpull.v1.XmlPullParser r24, android.util.AttributeSet r25, android.content.res.Resources.Theme r26) {
        /*
            Method dump skipped, instructions count: 1014
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1430aq.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }
}
