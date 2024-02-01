package p000a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: a.RC */
/* loaded from: classes.dex */
public abstract class AbstractC0913RC extends Drawable implements Drawable.Callback {

    /* renamed from: r */
    public static final /* synthetic */ int f3127r = 0;

    /* renamed from: E */
    public long f3128E;

    /* renamed from: I */
    public Drawable f3129I;

    /* renamed from: R */
    public Rect f3130R;

    /* renamed from: S */
    public AbstractC2451uB f3131S;

    /* renamed from: U */
    public long f3132U;

    /* renamed from: f */
    public C0881QX f3133f;

    /* renamed from: k */
    public boolean f3135k;

    /* renamed from: s */
    public RunnableC1286Y5 f3137s;

    /* renamed from: w */
    public Drawable f3138w;

    /* renamed from: y */
    public boolean f3139y;

    /* renamed from: q */
    public int f3136q = 255;

    /* renamed from: g */
    public int f3134g = -1;

    /* renamed from: P */
    public abstract void mo434P(C1991lS c1991lS);

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        AbstractC2451uB abstractC2451uB = this.f3131S;
        if (theme != null) {
            abstractC2451uB.m4237v();
            int i = abstractC2451uB.f7515o;
            Drawable[] drawableArr = abstractC2451uB.f7519u;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null && AbstractC0235ET.m477h(drawable)) {
                    AbstractC0235ET.m481z(drawableArr[i2], theme);
                    abstractC2451uB.f7498N |= drawableArr[i2].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                abstractC2451uB.f7513h = resources;
                int i3 = resources.getDisplayMetrics().densityDpi;
                if (i3 == 0) {
                    i3 = 160;
                }
                int i4 = abstractC2451uB.f7520v;
                abstractC2451uB.f7520v = i3;
                if (i4 != i3) {
                    abstractC2451uB.f7502S = false;
                    abstractC2451uB.f7493G = false;
                    return;
                }
                return;
            }
            return;
        }
        abstractC2451uB.getClass();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f3131S.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f3138w;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f3129I;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f3136q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        AbstractC2451uB abstractC2451uB = this.f3131S;
        return changingConfigurations | abstractC2451uB.f7498N | abstractC2451uB.f7499P;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        AbstractC2451uB abstractC2451uB = this.f3131S;
        if (abstractC2451uB.f7518s) {
            z = abstractC2451uB.f7503U;
        } else {
            abstractC2451uB.m4237v();
            abstractC2451uB.f7518s = true;
            int i = abstractC2451uB.f7515o;
            Drawable[] drawableArr = abstractC2451uB.f7519u;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (drawableArr[i2].getConstantState() == null) {
                        abstractC2451uB.f7503U = false;
                        z = false;
                        break;
                    }
                    i2++;
                } else {
                    abstractC2451uB.f7503U = true;
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            this.f3131S.f7499P = getChangingConfigurations();
            return this.f3131S;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f3138w;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f3130R;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        AbstractC2451uB abstractC2451uB = this.f3131S;
        if (abstractC2451uB.f7504V) {
            if (!abstractC2451uB.f7502S) {
                abstractC2451uB.m4236h();
            }
            return abstractC2451uB.f7521w;
        }
        Drawable drawable = this.f3138w;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        AbstractC2451uB abstractC2451uB = this.f3131S;
        if (abstractC2451uB.f7504V) {
            if (!abstractC2451uB.f7502S) {
                abstractC2451uB.m4236h();
            }
            return abstractC2451uB.f7501R;
        }
        Drawable drawable = this.f3138w;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        AbstractC2451uB abstractC2451uB = this.f3131S;
        if (abstractC2451uB.f7504V) {
            if (!abstractC2451uB.f7502S) {
                abstractC2451uB.m4236h();
            }
            return abstractC2451uB.f7516q;
        }
        Drawable drawable = this.f3138w;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        AbstractC2451uB abstractC2451uB = this.f3131S;
        if (abstractC2451uB.f7504V) {
            if (!abstractC2451uB.f7502S) {
                abstractC2451uB.m4236h();
            }
            return abstractC2451uB.f7495I;
        }
        Drawable drawable = this.f3138w;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3138w;
        int i = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        AbstractC2451uB abstractC2451uB = this.f3131S;
        if (abstractC2451uB.f7514k) {
            return abstractC2451uB.f7512g;
        }
        abstractC2451uB.m4237v();
        int i2 = abstractC2451uB.f7515o;
        Drawable[] drawableArr = abstractC2451uB.f7519u;
        if (i2 > 0) {
            i = drawableArr[0].getOpacity();
        }
        for (int i3 = 1; i3 < i2; i3++) {
            i = Drawable.resolveOpacity(i, drawableArr[i3].getOpacity());
        }
        abstractC2451uB.f7512g = i;
        abstractC2451uB.f7514k = true;
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f3138w;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        boolean padding;
        AbstractC2451uB abstractC2451uB = this.f3131S;
        boolean z = false;
        Rect rect2 = null;
        if (!abstractC2451uB.f7505W) {
            Rect rect3 = abstractC2451uB.f7497M;
            if (rect3 == null && !abstractC2451uB.f7493G) {
                abstractC2451uB.m4237v();
                Rect rect4 = new Rect();
                int i = abstractC2451uB.f7515o;
                Drawable[] drawableArr = abstractC2451uB.f7519u;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                abstractC2451uB.f7493G = true;
                abstractC2451uB.f7497M = rect2;
            } else {
                rect2 = rect3;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            } else {
                padding = false;
            }
        } else {
            Drawable drawable = this.f3138w;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (this.f3131S.f7496J && AbstractC2340s1.m4000z(this) == 1) {
            z = true;
        }
        if (z) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    /* renamed from: h */
    public final void m2066h(Drawable drawable) {
        if (this.f3133f == null) {
            this.f3133f = new C0881QX();
        }
        C0881QX c0881qx = this.f3133f;
        c0881qx.f3041R = drawable.getCallback();
        drawable.setCallback(c0881qx);
        try {
            if (this.f3131S.f7517r <= 0 && this.f3135k) {
                drawable.setAlpha(this.f3136q);
            }
            AbstractC2451uB abstractC2451uB = this.f3131S;
            if (abstractC2451uB.f7494H) {
                drawable.setColorFilter(abstractC2451uB.f7509c);
            } else {
                if (abstractC2451uB.f7492F) {
                    AbstractC0235ET.m478o(drawable, abstractC2451uB.f7510e);
                }
                AbstractC2451uB abstractC2451uB2 = this.f3131S;
                if (abstractC2451uB2.f7508Z) {
                    AbstractC0235ET.m476W(drawable, abstractC2451uB2.f7506X);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f3131S.f7491E);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            AbstractC2340s1.m3999h(drawable, AbstractC2340s1.m4000z(this));
            AbstractC2338rz.m3991N(drawable, this.f3131S.f7496J);
            Rect rect = this.f3130R;
            if (rect != null) {
                AbstractC0235ET.m475Q(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C0881QX c0881qx2 = this.f3133f;
            Drawable.Callback callback = (Drawable.Callback) c0881qx2.f3041R;
            c0881qx2.f3041R = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        AbstractC2451uB abstractC2451uB = this.f3131S;
        if (abstractC2451uB != null) {
            abstractC2451uB.f7514k = false;
            abstractC2451uB.f7522y = false;
        }
        if (drawable == this.f3138w && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f3131S.f7496J;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f3129I;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f3129I = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f3138w;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f3135k) {
                this.f3138w.setAlpha(this.f3136q);
            }
        }
        if (this.f3128E != 0) {
            this.f3128E = 0L;
            z = true;
        }
        if (this.f3132U != 0) {
            this.f3132U = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f3139y && super.mutate() == this) {
            C0224EF c0224ef = (C0224EF) this;
            C1991lS c1991lS = new C1991lS(c0224ef.f737c, c0224ef, null);
            c1991lS.mo3602N();
            mo434P(c1991lS);
            this.f3139y = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3129I;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f3138w;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        AbstractC2451uB abstractC2451uB = this.f3131S;
        int i2 = this.f3134g;
        int i3 = abstractC2451uB.f7515o;
        Drawable[] drawableArr = abstractC2451uB.f7519u;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean m3999h = AbstractC2340s1.m3999h(drawable, i);
                if (i4 == i2) {
                    z = m3999h;
                }
            }
        }
        abstractC2451uB.f7511f = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f3129I;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f3138w;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f3138w || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f3135k && this.f3136q == i) {
            return;
        }
        this.f3135k = true;
        this.f3136q = i;
        Drawable drawable = this.f3138w;
        if (drawable != null) {
            if (this.f3132U == 0) {
                drawable.setAlpha(i);
            } else {
                m2068z(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        AbstractC2451uB abstractC2451uB = this.f3131S;
        if (abstractC2451uB.f7496J != z) {
            abstractC2451uB.f7496J = z;
            Drawable drawable = this.f3138w;
            if (drawable != null) {
                AbstractC2338rz.m3991N(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        AbstractC2451uB abstractC2451uB = this.f3131S;
        abstractC2451uB.f7494H = true;
        if (abstractC2451uB.f7509c != colorFilter) {
            abstractC2451uB.f7509c = colorFilter;
            Drawable drawable = this.f3138w;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        AbstractC2451uB abstractC2451uB = this.f3131S;
        if (abstractC2451uB.f7491E != z) {
            abstractC2451uB.f7491E = z;
            Drawable drawable = this.f3138w;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.f3138w;
        if (drawable != null) {
            AbstractC0235ET.m473N(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f3130R;
        if (rect == null) {
            this.f3130R = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f3138w;
        if (drawable != null) {
            AbstractC0235ET.m475Q(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        AbstractC2451uB abstractC2451uB = this.f3131S;
        abstractC2451uB.f7492F = true;
        if (abstractC2451uB.f7510e != colorStateList) {
            abstractC2451uB.f7510e = colorStateList;
            AbstractC1843ih.m3434ZH(this.f3138w, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        AbstractC2451uB abstractC2451uB = this.f3131S;
        abstractC2451uB.f7508Z = true;
        if (abstractC2451uB.f7506X != mode) {
            abstractC2451uB.f7506X = mode;
            AbstractC1843ih.m3416Lq(this.f3138w, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f3129I;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f3138w;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f3138w || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0074  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m2067v(int r10) {
        /*
            r9 = this;
            int r0 = r9.f3134g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            a.uB r0 = r9.f3131S
            int r0 = r0.f7507Y
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f3129I
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f3138w
            if (r0 == 0) goto L29
            r9.f3129I = r0
            a.uB r0 = r9.f3131S
            int r0 = r0.f7507Y
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f3128E = r0
            goto L35
        L29:
            r9.f3129I = r4
            r9.f3128E = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f3138w
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            a.uB r0 = r9.f3131S
            int r1 = r0.f7515o
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m4235P(r10)
            r9.f3138w = r0
            r9.f3134g = r10
            if (r0 == 0) goto L5a
            a.uB r10 = r9.f3131S
            int r10 = r10.f7517r
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f3132U = r2
        L51:
            r9.m2066h(r0)
            goto L5a
        L55:
            r9.f3138w = r4
            r10 = -1
            r9.f3134g = r10
        L5a:
            long r0 = r9.f3132U
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f3128E
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L7a
        L67:
            a.Y5 r10 = r9.f3137s
            if (r10 != 0) goto L74
            a.Y5 r10 = new a.Y5
            r1 = 2
            r10.<init>(r1, r9)
            r9.f3137s = r10
            goto L77
        L74:
            r9.unscheduleSelf(r10)
        L77:
            r9.m2068z(r0)
        L7a:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC0913RC.m2067v(int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2068z(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f3135k = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f3138w
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L34
            long r9 = r13.f3132U
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L36
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L20
            int r9 = r13.f3136q
            r3.setAlpha(r9)
            goto L34
        L20:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            a.uB r10 = r13.f3131S
            int r10 = r10.f7517r
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f3136q
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L37
        L34:
            r13.f3132U = r6
        L36:
            r3 = r8
        L37:
            android.graphics.drawable.Drawable r9 = r13.f3129I
            if (r9 == 0) goto L5d
            long r10 = r13.f3128E
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L5f
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L4c
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f3129I = r0
            goto L5d
        L4c:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            a.uB r4 = r13.f3131S
            int r4 = r4.f7507Y
            int r3 = r3 / r4
            int r4 = r13.f3136q
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L60
        L5d:
            r13.f3128E = r6
        L5f:
            r0 = r3
        L60:
            if (r14 == 0) goto L6c
            if (r0 == 0) goto L6c
            a.Y5 r14 = r13.f3137s
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC0913RC.m2068z(boolean):void");
    }
}
