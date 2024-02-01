package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.topjohnwu.magisk.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* renamed from: a.hL */
/* loaded from: classes.dex */
public final class C1773hL extends Drawable implements InterfaceC0879QU {

    /* renamed from: E */
    public float f5575E;

    /* renamed from: I */
    public final Rect f5576I;

    /* renamed from: R */
    public final C2281qz f5577R;

    /* renamed from: S */
    public final WeakReference f5578S;

    /* renamed from: U */
    public float f5579U;

    /* renamed from: f */
    public WeakReference f5580f;

    /* renamed from: g */
    public float f5581g;

    /* renamed from: k */
    public float f5582k;

    /* renamed from: q */
    public final C1971l4 f5583q;

    /* renamed from: r */
    public WeakReference f5584r;

    /* renamed from: s */
    public float f5585s;

    /* renamed from: w */
    public final C0131CY f5586w;

    /* renamed from: y */
    public int f5587y;

    public C1773hL(Context context, C0053B2 c0053b2) {
        int intValue;
        int intValue2;
        int i;
        FrameLayout frameLayout;
        C1726gW c1726gW;
        WeakReference weakReference = new WeakReference(context);
        this.f5578S = weakReference;
        AbstractC0795Op.m1834W(context, AbstractC0795Op.f2715s, "Theme.MaterialComponents");
        this.f5576I = new Rect();
        C0131CY c0131cy = new C0131CY(this);
        this.f5586w = c0131cy;
        TextPaint textPaint = c0131cy.f451z;
        textPaint.setTextAlign(Paint.Align.CENTER);
        C1971l4 c1971l4 = new C1971l4(context, c0053b2);
        this.f5583q = c1971l4;
        boolean m3298N = m3298N();
        C0053B2 c0053b22 = c1971l4.f6102h;
        if (m3298N) {
            intValue = c0053b22.f224g.intValue();
        } else {
            intValue = c0053b22.f230q.intValue();
        }
        if (m3298N()) {
            intValue2 = c0053b22.f235y.intValue();
        } else {
            intValue2 = c0053b22.f227k.intValue();
        }
        C2281qz c2281qz = new C2281qz(new C0099Bw(C0099Bw.m210z(context, intValue, intValue2, new C1012T(0))));
        this.f5577R = c2281qz;
        m3304u();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && c0131cy.f449u != (c1726gW = new C1726gW(context2, c0053b22.f210I.intValue()))) {
            c0131cy.m259h(c1726gW, context2);
            textPaint.setColor(c0053b22.f233w.intValue());
            invalidateSelf();
            m3301W();
            invalidateSelf();
        }
        int i2 = c0053b22.f223f;
        if (i2 != -2) {
            i = ((int) Math.pow(10.0d, i2 - 1.0d)) - 1;
        } else {
            i = c0053b22.f231r;
        }
        this.f5587y = i;
        c0131cy.f445N = true;
        m3301W();
        invalidateSelf();
        c0131cy.f445N = true;
        m3304u();
        m3301W();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(c0053b22.f214R.intValue());
        if (c2281qz.f7021S.f4613v != valueOf) {
            c2281qz.m3934R(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(c0053b22.f233w.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f5580f;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f5580f.get();
            WeakReference weakReference3 = this.f5584r;
            if (weakReference3 != null) {
                frameLayout = (FrameLayout) weakReference3.get();
            } else {
                frameLayout = null;
            }
            m3303o(view, frameLayout);
        }
        m3301W();
        setVisible(c0053b22.f208F.booleanValue(), false);
    }

    /* renamed from: N */
    public final boolean m3298N() {
        boolean z;
        if (this.f5583q.f6102h.f216U != null) {
            z = true;
        } else {
            z = false;
        }
        if (z || m3300Q()) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public final int m3299P() {
        boolean z;
        int i = this.f5583q.f6102h.f207E;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return 0;
        }
        return i;
    }

    /* renamed from: Q */
    public final boolean m3300Q() {
        boolean z;
        boolean z2;
        C0053B2 c0053b2 = this.f5583q.f6102h;
        if (c0053b2.f216U != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (c0053b2.f207E != -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:325:0x0172, code lost:
    
        if (p000a.AbstractC0095Bq.m199P(r2) == 0) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x017b, code lost:
    
        if (p000a.AbstractC0095Bq.m199P(r2) == 0) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x017d, code lost:
    
        r3 = (r5.left - r14.f5579U) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0186, code lost:
    
        r3 = (r5.right + r14.f5579U) - r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x026b  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3301W() {
        /*
            Method dump skipped, instructions count: 715
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1773hL.m3301W():void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String m3302h;
        int round;
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f5577R.draw(canvas);
            if (m3298N() && (m3302h = m3302h()) != null) {
                Rect rect = new Rect();
                C0131CY c0131cy = this.f5586w;
                c0131cy.f451z.getTextBounds(m3302h, 0, m3302h.length(), rect);
                float exactCenterY = this.f5581g - rect.exactCenterY();
                float f = this.f5582k;
                if (rect.bottom <= 0) {
                    round = (int) exactCenterY;
                } else {
                    round = Math.round(exactCenterY);
                }
                canvas.drawText(m3302h, f, round, c0131cy.f451z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f5583q.f6102h.f232s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f5576I.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f5576I.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public final String m3302h() {
        boolean z;
        C1971l4 c1971l4 = this.f5583q;
        C0053B2 c0053b2 = c1971l4.f6102h;
        String str = c0053b2.f216U;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        WeakReference weakReference = this.f5578S;
        if (z) {
            int i = c0053b2.f223f;
            if (i != -2 && str != null && str.length() > i) {
                Context context = (Context) weakReference.get();
                if (context == null) {
                    return "";
                }
                str = String.format(context.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i - 1), "…");
            }
            return str;
        }
        if (m3300Q()) {
            if (this.f5587y != -2 && m3299P() > this.f5587y) {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    return "";
                }
                return String.format(c1971l4.f6102h.f218Y, context2.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f5587y), "+");
            }
            return NumberFormat.getInstance(c1971l4.f6102h.f218Y).format(m3299P());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    /* renamed from: o */
    public final void m3303o(View view, FrameLayout frameLayout) {
        this.f5580f = new WeakReference(view);
        this.f5584r = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        m3301W();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, p000a.InterfaceC0879QU
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C1971l4 c1971l4 = this.f5583q;
        c1971l4.f6106z.f232s = i;
        c1971l4.f6102h.f232s = i;
        this.f5586w.f451z.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: u */
    public final void m3304u() {
        int intValue;
        int intValue2;
        Context context = (Context) this.f5578S.get();
        if (context == null) {
            return;
        }
        boolean m3298N = m3298N();
        C1971l4 c1971l4 = this.f5583q;
        if (m3298N) {
            intValue = c1971l4.f6102h.f224g.intValue();
        } else {
            intValue = c1971l4.f6102h.f230q.intValue();
        }
        if (m3298N()) {
            intValue2 = c1971l4.f6102h.f235y.intValue();
        } else {
            intValue2 = c1971l4.f6102h.f227k.intValue();
        }
        this.f5577R.mo3137h(new C0099Bw(C0099Bw.m210z(context, intValue, intValue2, new C1012T(0))));
        invalidateSelf();
    }

    /* renamed from: v */
    public final FrameLayout m3305v() {
        WeakReference weakReference = this.f5584r;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // p000a.InterfaceC0879QU
    /* renamed from: z */
    public final void mo2027z() {
        invalidateSelf();
    }
}
