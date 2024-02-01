package p000a;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* renamed from: a.p9 */
/* loaded from: classes.dex */
public final class C2184p9 extends Spinner {

    /* renamed from: s */
    public static final int[] f6683s = {16843505};

    /* renamed from: I */
    public SpinnerAdapter f6684I;

    /* renamed from: R */
    public final Context f6685R;

    /* renamed from: S */
    public final C2226py f6686S;

    /* renamed from: g */
    public int f6687g;

    /* renamed from: k */
    public final InterfaceC1037TS f6688k;

    /* renamed from: q */
    public final boolean f6689q;

    /* renamed from: w */
    public final C0681Ms f6690w;

    /* renamed from: y */
    public final Rect f6691y;

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0059, code lost:
    
        if (r6 == null) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2184p9(android.content.Context r12, android.util.AttributeSet r13) {
        /*
            r11 = this;
            r0 = 2130969603(0x7f040403, float:1.7547893E38)
            r11.<init>(r12, r13, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r11.f6691y = r1
            android.content.Context r1 = r11.getContext()
            p000a.AbstractC1757h0.m3289z(r11, r1)
            int[] r1 = p000a.AbstractC0483J5.f1609U
            r2 = 0
            android.content.res.TypedArray r3 = r12.obtainStyledAttributes(r13, r1, r0, r2)
            a.py r4 = new a.py
            r4.<init>(r11)
            r11.f6686S = r4
            r4 = 4
            int r4 = r3.getResourceId(r4, r2)
            if (r4 == 0) goto L31
            a.VN r5 = new a.VN
            r5.<init>(r12, r4)
            r11.f6685R = r5
            goto L33
        L31:
            r11.f6685R = r12
        L33:
            r4 = -1
            r5 = 0
            int[] r6 = p000a.C2184p9.f6683s     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            android.content.res.TypedArray r6 = r12.obtainStyledAttributes(r13, r6, r0, r2)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            boolean r7 = r6.hasValue(r2)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4a
            if (r7 == 0) goto L5b
            int r4 = r6.getInt(r2, r2)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4a
            goto L5b
        L46:
            r12 = move-exception
            r5 = r6
            goto Ld0
        L4a:
            r7 = move-exception
            goto L52
        L4c:
            r12 = move-exception
            goto Ld0
        L4f:
            r6 = move-exception
            r7 = r6
            r6 = r5
        L52:
            java.lang.String r8 = "AppCompatSpinner"
            java.lang.String r9 = "Could not read android:spinnerMode"
            android.util.Log.i(r8, r9, r7)     // Catch: java.lang.Throwable -> L46
            if (r6 == 0) goto L5e
        L5b:
            r6.recycle()
        L5e:
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L98
            if (r4 == r7) goto L65
            goto La5
        L65:
            a.p2 r4 = new a.p2
            android.content.Context r8 = r11.f6685R
            r4.<init>(r11, r8, r13)
            android.content.Context r8 = r11.f6685R
            a.z9 r1 = p000a.C2709z9.m4639S(r8, r13, r1, r0)
            java.lang.Object r8 = r1.f8534h
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            r9 = 3
            r10 = -2
            int r8 = r8.getLayoutDimension(r9, r10)
            r11.f6687g = r8
            android.graphics.drawable.Drawable r8 = r1.m4642N(r7)
            r4.m1464R(r8)
            java.lang.String r6 = r3.getString(r6)
            r4.f6675x = r6
            r1.m4651w()
            r11.f6688k = r4
            a.Ms r1 = new a.Ms
            r1.<init>(r11, r11, r4, r7)
            r11.f6690w = r1
            goto La5
        L98:
            a.yI r1 = new a.yI
            r1.<init>(r11)
            r11.f6688k = r1
            java.lang.String r4 = r3.getString(r6)
            r1.f8312w = r4
        La5:
            java.lang.CharSequence[] r1 = r3.getTextArray(r2)
            if (r1 == 0) goto Lbc
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r2.<init>(r12, r4, r1)
            r12 = 2131493010(0x7f0c0092, float:1.8609488E38)
            r2.setDropDownViewResource(r12)
            r11.setAdapter(r2)
        Lbc:
            r3.recycle()
            r11.f6689q = r7
            android.widget.SpinnerAdapter r12 = r11.f6684I
            if (r12 == 0) goto Lca
            r11.setAdapter(r12)
            r11.f6684I = r5
        Lca:
            a.py r12 = r11.f6686S
            r12.m3864N(r13, r0)
            return
        Ld0:
            if (r5 == 0) goto Ld5
            r5.recycle()
        Ld5:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2184p9.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2226py c2226py = this.f6686S;
        if (c2226py != null) {
            c2226py.m3871z();
        }
    }

    @Override // android.widget.Spinner
    public final int getDropDownHorizontalOffset() {
        InterfaceC1037TS interfaceC1037TS = this.f6688k;
        return interfaceC1037TS != null ? interfaceC1037TS.mo2206P() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownVerticalOffset() {
        InterfaceC1037TS interfaceC1037TS = this.f6688k;
        return interfaceC1037TS != null ? interfaceC1037TS.mo2212u() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public final int getDropDownWidth() {
        return this.f6688k != null ? this.f6687g : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public final Drawable getPopupBackground() {
        InterfaceC1037TS interfaceC1037TS = this.f6688k;
        return interfaceC1037TS != null ? interfaceC1037TS.mo2209W() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public final Context getPopupContext() {
        return this.f6685R;
    }

    @Override // android.widget.Spinner
    public final CharSequence getPrompt() {
        InterfaceC1037TS interfaceC1037TS = this.f6688k;
        return interfaceC1037TS != null ? interfaceC1037TS.mo2204G() : super.getPrompt();
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1037TS interfaceC1037TS = this.f6688k;
        if (interfaceC1037TS == null || !interfaceC1037TS.mo2210h()) {
            return;
        }
        interfaceC1037TS.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f6688k == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m3791z(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C1679fY c1679fY = (C1679fY) parcelable;
        super.onRestoreInstanceState(c1679fY.getSuperState());
        if (!c1679fY.f5266S || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1238X7(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1679fY c1679fY = new C1679fY(super.onSaveInstanceState());
        InterfaceC1037TS interfaceC1037TS = this.f6688k;
        c1679fY.f5266S = interfaceC1037TS != null && interfaceC1037TS.mo2210h();
        return c1679fY;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0681Ms c0681Ms = this.f6690w;
        if (c0681Ms == null || !c0681Ms.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC1037TS interfaceC1037TS = this.f6688k;
        if (interfaceC1037TS != null) {
            if (!interfaceC1037TS.mo2210h()) {
                interfaceC1037TS.mo2205N(AbstractC1263Xf.m2564h(this), AbstractC1263Xf.m2566z(this));
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2226py c2226py = this.f6686S;
        if (c2226py != null) {
            c2226py.m3866Q();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2226py c2226py = this.f6686S;
        if (c2226py != null) {
            c2226py.m3869u(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownHorizontalOffset(int i) {
        InterfaceC1037TS interfaceC1037TS = this.f6688k;
        if (interfaceC1037TS == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            interfaceC1037TS.mo2211q(i);
            interfaceC1037TS.mo2213v(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownVerticalOffset(int i) {
        InterfaceC1037TS interfaceC1037TS = this.f6688k;
        if (interfaceC1037TS != null) {
            interfaceC1037TS.mo2214w(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setDropDownWidth(int i) {
        if (this.f6688k != null) {
            this.f6687g = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC1037TS interfaceC1037TS = this.f6688k;
        if (interfaceC1037TS != null) {
            interfaceC1037TS.mo2207R(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public final void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(AbstractC1843ih.m3431X(this.f6685R, i));
    }

    @Override // android.widget.Spinner
    public final void setPrompt(CharSequence charSequence) {
        InterfaceC1037TS interfaceC1037TS = this.f6688k;
        if (interfaceC1037TS != null) {
            interfaceC1037TS.mo2208S(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    /* renamed from: z */
    public final int m3791z(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        Rect rect = this.f6691y;
        drawable.getPadding(rect);
        return i2 + rect.left + rect.right;
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f6689q) {
            this.f6684I = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC1037TS interfaceC1037TS = this.f6688k;
        if (interfaceC1037TS != null) {
            Context context = this.f6685R;
            if (context == null) {
                context = getContext();
            }
            interfaceC1037TS.mo1462I(new C0509Jc(spinnerAdapter, context.getTheme()));
        }
    }
}
