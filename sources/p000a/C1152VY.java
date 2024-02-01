package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: a.VY */
/* loaded from: classes.dex */
public final class C1152VY extends AbstractC0411Hn implements Animatable {

    /* renamed from: g */
    public static final /* synthetic */ int f3738g = 0;

    /* renamed from: R */
    public final C0120CJ f3740R;

    /* renamed from: k */
    public final C0881QX f3741k;

    /* renamed from: w */
    public final Context f3743w;

    /* renamed from: I */
    public C2558wC f3739I = null;

    /* renamed from: q */
    public ArrayList f3742q = null;

    public C1152VY(Context context) {
        C0881QX c0881qx = new C0881QX(this);
        this.f3741k = c0881qx;
        this.f3743w = context;
        this.f3740R = new C0120CJ(c0881qx);
    }

    @Override // p000a.AbstractC0411Hn, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            AbstractC0235ET.m481z(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            return AbstractC0235ET.m477h(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C0120CJ c0120cj = this.f3740R;
        c0120cj.f420z.draw(canvas);
        if (c0120cj.f418h.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            return AbstractC2338rz.m3995z(drawable);
        }
        return this.f3740R.f420z.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f3740R.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            return AbstractC0235ET.m480v(drawable);
        }
        return this.f3740R.f420z.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f1387S == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C1649f0(this.f1387S.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f1387S;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3740R.f420z.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f1387S;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3740R.f420z.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f1387S;
        return drawable != null ? drawable.getOpacity() : this.f3740R.f420z.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            return AbstractC2338rz.m3992P(drawable);
        }
        return this.f3740R.f420z.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f1387S;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3740R.f418h.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f1387S;
        return drawable != null ? drawable.isStateful() : this.f3740R.f420z.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3740R.f420z.setBounds(rect);
        }
    }

    @Override // p000a.AbstractC0411Hn, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f1387S;
        return drawable != null ? drawable.setLevel(i) : this.f3740R.f420z.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f1387S;
        return drawable != null ? drawable.setState(iArr) : this.f3740R.f420z.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f3740R.f420z.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            AbstractC2338rz.m3991N(drawable, z);
        } else {
            this.f3740R.f420z.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3740R.f420z.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            AbstractC1843ih.m3440dx(drawable, i);
        } else {
            this.f3740R.f420z.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            AbstractC1843ih.m3434ZH(drawable, colorStateList);
        } else {
            this.f3740R.f420z.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            AbstractC1843ih.m3416Lq(drawable, mode);
        } else {
            this.f3740R.f420z.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f3740R.f420z.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C0120CJ c0120cj = this.f3740R;
        if (c0120cj.f418h.isStarted()) {
            return;
        }
        c0120cj.f418h.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f1387S;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3740R.f418h.end();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x017a, code lost:
    
        if (r8.f418h != null) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x017c, code lost:
    
        r8.f418h = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0183, code lost:
    
        r8.f418h.playTogether(r8.f419v);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x018a, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00a2  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1152VY.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }
}
