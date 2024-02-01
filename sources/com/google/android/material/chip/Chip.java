package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.Arrays;
import java.util.WeakHashMap;
import p000a.AbstractC0095Bq;
import p000a.AbstractC0567Ke;
import p000a.AbstractC0795Op;
import p000a.AbstractC1486bz;
import p000a.AbstractC2397t8;
import p000a.AbstractC2446u3;
import p000a.C0099Bw;
import p000a.C0131CY;
import p000a.C1340Z6;
import p000a.C1707g5;
import p000a.C1726gW;
import p000a.C2694yr;
import p000a.InterfaceC1099Uc;
import p000a.InterfaceC1661fF;
import p000a.InterfaceC2517vM;

/* loaded from: classes.dex */
public class Chip extends C1707g5 implements InterfaceC1099Uc, InterfaceC1661fF, Checkable {

    /* renamed from: C */
    public final C1340Z6 f9319C;

    /* renamed from: E */
    public boolean f9320E;

    /* renamed from: F */
    public final RectF f9321F;

    /* renamed from: H */
    public CharSequence f9322H;

    /* renamed from: J */
    public int f9323J;

    /* renamed from: U */
    public boolean f9324U;

    /* renamed from: c */
    public int f9325c;

    /* renamed from: e */
    public final Rect f9326e;

    /* renamed from: f */
    public boolean f9327f;

    /* renamed from: g */
    public RippleDrawable f9328g;

    /* renamed from: k */
    public InsetDrawable f9329k;

    /* renamed from: q */
    public C2694yr f9330q;

    /* renamed from: r */
    public boolean f9331r;

    /* renamed from: s */
    public boolean f9332s;

    /* renamed from: y */
    public CompoundButton.OnCheckedChangeListener f9333y;

    /* renamed from: p */
    public static final Rect f9318p = new Rect();

    /* renamed from: j */
    public static final int[] f9317j = {16842913};

    /* renamed from: L */
    public static final int[] f9316L = {16842911};

    /* JADX WARN: Removed duplicated region for block: B:349:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x059a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Chip(android.content.Context r17, android.util.AttributeSet r18) {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: P */
    public final void m5043P(boolean z) {
        if (this.f9320E != z) {
            this.f9320E = z;
            refreshDrawableState();
        }
    }

    /* renamed from: W */
    public final void m5044W() {
        C1726gW c1726gW;
        TextPaint paint = getPaint();
        C2694yr c2694yr = this.f9330q;
        if (c2694yr != null) {
            paint.drawableState = c2694yr.getState();
        }
        C2694yr c2694yr2 = this.f9330q;
        if (c2694yr2 != null) {
            c1726gW = c2694yr2.f8473d2.f449u;
        } else {
            c1726gW = null;
        }
        if (c1726gW != null) {
            c1726gW.m3257N(getContext(), paint, this.f9319C);
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, boolean] */
    @Override // p000a.C1707g5, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        C2694yr c2694yr = this.f9330q;
        boolean z = false;
        if (c2694yr != null && C2694yr.m4601r(c2694yr.f8471b)) {
            C2694yr c2694yr2 = this.f9330q;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.f9327f) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.f9320E) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f9324U) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.f9327f) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f9320E) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f9324U) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(c2694yr2.f8498zd, iArr)) {
                c2694yr2.f8498zd = iArr;
                if (c2694yr2.m4609Z()) {
                    z = c2694yr2.m4605J(c2694yr2.getState(), iArr);
                }
            }
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        boolean z;
        if (!TextUtils.isEmpty(this.f9322H)) {
            return this.f9322H;
        }
        C2694yr c2694yr = this.f9330q;
        if (c2694yr != null && c2694yr.f8450HL) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            getParent();
            return "android.widget.Button";
        }
        if (isClickable()) {
            return "android.widget.Button";
        }
        return "android.view.View";
    }

    @Override // android.widget.TextView
    public final TextUtils.TruncateAt getEllipsize() {
        C2694yr c2694yr = this.f9330q;
        if (c2694yr != null) {
            return c2694yr.f8463S3;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
    }

    @Override // p000a.InterfaceC1661fF
    /* renamed from: h */
    public final void mo3137h(C0099Bw c0099Bw) {
        this.f9330q.mo3137h(c0099Bw);
    }

    /* renamed from: o */
    public final void m5045o() {
        C2694yr c2694yr;
        if (!TextUtils.isEmpty(getText()) && (c2694yr = this.f9330q) != null) {
            int m4606U = (int) (c2694yr.m4606U() + c2694yr.f8470ZH + c2694yr.f8443BO);
            C2694yr c2694yr2 = this.f9330q;
            int m4613s = (int) (c2694yr2.m4613s() + c2694yr2.f8467UZ + c2694yr2.f8466U8);
            if (this.f9329k != null) {
                Rect rect = new Rect();
                this.f9329k.getPadding(rect);
                m4613s += rect.left;
                m4606U += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            AbstractC0095Bq.m197M(this, m4613s, paddingTop, m4606U, paddingBottom);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0795Op.m1811G5(this, this.f9330q);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        boolean z;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f9317j);
        }
        C2694yr c2694yr = this.f9330q;
        if (c2694yr != null && c2694yr.f8450HL) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View.mergeDrawableStates(onCreateDrawableState, f9316L);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                contains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        RectF rectF = this.f9321F;
        rectF.setEmpty();
        m5047v();
        contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
        m5043P(contains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        C2694yr c2694yr = this.f9330q;
        if (c2694yr != null && c2694yr.f8450HL) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        RectF rectF = this.f9321F;
        rectF.setEmpty();
        m5047v();
        if (rectF.contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f9323J != i) {
            this.f9323J = i;
            m5045o();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0022, code lost:
    
        if (r0 != 3) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0041  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.f9321F
            r1.setEmpty()
            r5.m5047v()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L47
            if (r0 == r2) goto L33
            r4 = 2
            if (r0 == r4) goto L25
            r1 = 3
            if (r0 == r1) goto L3c
            goto L52
        L25:
            boolean r0 = r5.f9324U
            if (r0 == 0) goto L52
            if (r1 != 0) goto L50
            if (r0 == 0) goto L50
            r5.f9324U = r3
        L2f:
            r5.refreshDrawableState()
            goto L50
        L33:
            boolean r0 = r5.f9324U
            if (r0 == 0) goto L3c
            r5.playSoundEffect(r3)
            r0 = r2
            goto L3d
        L3c:
            r0 = r3
        L3d:
            boolean r1 = r5.f9324U
            if (r1 == 0) goto L53
            r5.f9324U = r3
            r5.refreshDrawableState()
            goto L53
        L47:
            if (r1 == 0) goto L52
            boolean r0 = r5.f9324U
            if (r0 == r2) goto L50
            r5.f9324U = r2
            goto L2f
        L50:
            r0 = r2
            goto L53
        L52:
            r0 = r3
        L53:
            if (r0 != 0) goto L5d
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5c
            goto L5d
        L5c:
            r2 = r3
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        Drawable drawable2 = this.f9329k;
        if (drawable2 == null) {
            drawable2 = this.f9330q;
        }
        if (drawable != drawable2 && drawable != this.f9328g) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // p000a.C1707g5, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        Drawable drawable2 = this.f9329k;
        if (drawable2 == null) {
            drawable2 = this.f9330q;
        }
        if (drawable != drawable2 && drawable != this.f9328g) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // p000a.C1707g5, android.view.View
    public final void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        C2694yr c2694yr = this.f9330q;
        if (c2694yr == null) {
            this.f9332s = z;
        } else if (c2694yr.f8450HL) {
            super.setChecked(z);
        }
    }

    @Override // p000a.C1707g5, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // p000a.C1707g5, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        C2694yr c2694yr = this.f9330q;
        if (c2694yr != null) {
            c2694yr.m3935S(f);
        }
    }

    @Override // android.widget.TextView
    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f9330q == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            C2694yr c2694yr = this.f9330q;
            if (c2694yr != null) {
                c2694yr.f8463S3 = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    @Override // android.widget.TextView
    public final void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        if (this.f9330q == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public final void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public final void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public final void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C2694yr c2694yr = this.f9330q;
        if (c2694yr != null) {
            c2694yr.f8453KM = i;
        }
    }

    @Override // android.widget.TextView
    public final void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f9333y = onCheckedChangeListener;
    }

    @Override // android.widget.TextView
    public final void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        C2694yr c2694yr = this.f9330q;
        if (c2694yr == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (c2694yr.f8480hs) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        super.setText(charSequence2, bufferType);
        C2694yr c2694yr2 = this.f9330q;
        if (c2694yr2 != null && !TextUtils.equals(c2694yr2.f8464T, charSequence)) {
            c2694yr2.f8464T = charSequence;
            c2694yr2.f8473d2.f445N = true;
            c2694yr2.invalidateSelf();
            c2694yr2.m4608Y();
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C2694yr c2694yr = this.f9330q;
        if (c2694yr != null) {
            Context context = c2694yr.f8456Lq;
            c2694yr.f8473d2.m259h(new C1726gW(context, i), context);
        }
        m5044W();
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C2694yr c2694yr = this.f9330q;
        if (c2694yr != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            C0131CY c0131cy = c2694yr.f8473d2;
            C1726gW c1726gW = c0131cy.f449u;
            if (c1726gW != null) {
                c1726gW.f5434M = applyDimension;
                c0131cy.f451z.setTextSize(applyDimension);
                c2694yr.mo2027z();
            }
        }
        m5044W();
    }

    /* renamed from: u */
    public final void m5046u() {
        int[] iArr = AbstractC0567Ke.f1845z;
        ColorStateList m1282h = AbstractC0567Ke.m1282h(this.f9330q.f8496x);
        Drawable drawable = this.f9329k;
        if (drawable == null) {
            drawable = this.f9330q;
        }
        this.f9328g = new RippleDrawable(m1282h, drawable, null);
        C2694yr c2694yr = this.f9330q;
        if (c2694yr.f8477fH) {
            c2694yr.f8477fH = false;
            c2694yr.f8455LN = null;
            c2694yr.onStateChange(c2694yr.getState());
        }
        RippleDrawable rippleDrawable = this.f9328g;
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        AbstractC2397t8.m4127q(this, rippleDrawable);
        m5045o();
    }

    /* renamed from: v */
    public final boolean m5047v() {
        C2694yr c2694yr = this.f9330q;
        if (c2694yr != null) {
            Drawable drawable = c2694yr.f8471b;
            if (drawable != null) {
                if (drawable instanceof InterfaceC2517vM) {
                    ((AbstractC1486bz) ((InterfaceC2517vM) drawable)).getClass();
                    drawable = null;
                }
            } else {
                drawable = null;
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    public final void m5048z(int i) {
        int i2;
        this.f9325c = i;
        float f = 0.0f;
        int i3 = 0;
        if (!this.f9331r) {
            InsetDrawable insetDrawable = this.f9329k;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.f9329k = null;
                    setMinWidth(0);
                    C2694yr c2694yr = this.f9330q;
                    if (c2694yr != null) {
                        f = c2694yr.f8481i;
                    }
                    setMinHeight((int) f);
                    m5046u();
                    return;
                }
                return;
            }
            m5046u();
            return;
        }
        int max = Math.max(0, i - ((int) this.f9330q.f8481i));
        int max2 = Math.max(0, i - this.f9330q.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f9329k;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.f9329k = null;
                    setMinWidth(0);
                    C2694yr c2694yr2 = this.f9330q;
                    if (c2694yr2 != null) {
                        f = c2694yr2.f8481i;
                    }
                    setMinHeight((int) f);
                    m5046u();
                    return;
                }
                return;
            }
            m5046u();
            return;
        }
        if (max2 > 0) {
            i2 = max2 / 2;
        } else {
            i2 = 0;
        }
        if (max > 0) {
            i3 = max / 2;
        }
        int i4 = i3;
        if (this.f9329k != null) {
            Rect rect = new Rect();
            this.f9329k.getPadding(rect);
            if (rect.top == i4 && rect.bottom == i4 && rect.left == i2 && rect.right == i2) {
                m5046u();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f9329k = new InsetDrawable((Drawable) this.f9330q, i2, i4, i2, i4);
        m5046u();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2694yr c2694yr = this.f9330q;
        if (c2694yr != null) {
            Context context2 = c2694yr.f8456Lq;
            c2694yr.f8473d2.m259h(new C1726gW(context2, i), context2);
        }
        m5044W();
    }
}
