package p000a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.topjohnwu.magisk.R;
import java.util.WeakHashMap;

/* renamed from: a.QS */
/* loaded from: classes.dex */
public abstract class AbstractC0877QS extends CompoundButton {

    /* renamed from: UZ */
    public static final C0414Hq f2987UZ = new C0414Hq(Float.class, "thumbPos", 0);

    /* renamed from: n0 */
    public static final int[] f2988n0 = {16842912};

    /* renamed from: B */
    public int f2989B;

    /* renamed from: C */
    public final boolean f2990C;

    /* renamed from: D */
    public int f2991D;

    /* renamed from: E */
    public final int f2992E;

    /* renamed from: F */
    public CharSequence f2993F;

    /* renamed from: H */
    public CharSequence f2994H;

    /* renamed from: HL */
    public C1850ip f2995HL;

    /* renamed from: I */
    public boolean f2996I;

    /* renamed from: J */
    public final boolean f2997J;

    /* renamed from: K */
    public int f2998K;

    /* renamed from: L */
    public float f2999L;

    /* renamed from: O */
    public final int f3000O;

    /* renamed from: R */
    public ColorStateList f3001R;

    /* renamed from: S */
    public Drawable f3002S;

    /* renamed from: T */
    public int f3003T;

    /* renamed from: U */
    public final boolean f3004U;

    /* renamed from: Yd */
    public StaticLayout f3005Yd;

    /* renamed from: b */
    public final TextPaint f3006b;

    /* renamed from: c */
    public CharSequence f3007c;

    /* renamed from: d */
    public final VelocityTracker f3008d;

    /* renamed from: e */
    public CharSequence f3009e;

    /* renamed from: f */
    public final int f3010f;

    /* renamed from: g */
    public ColorStateList f3011g;

    /* renamed from: i */
    public float f3012i;

    /* renamed from: j */
    public final int f3013j;

    /* renamed from: k */
    public Drawable f3014k;

    /* renamed from: l */
    public final boolean f3015l;

    /* renamed from: m */
    public int f3016m;

    /* renamed from: n */
    public float f3017n;

    /* renamed from: nF */
    public C1624eZ f3018nF;

    /* renamed from: nP */
    public ColorStateList f3019nP;

    /* renamed from: od */
    public ObjectAnimator f3020od;

    /* renamed from: p */
    public int f3021p;

    /* renamed from: q */
    public final boolean f3022q;

    /* renamed from: qn */
    public StaticLayout f3023qn;

    /* renamed from: r */
    public final int f3024r;

    /* renamed from: s */
    public boolean f3025s;

    /* renamed from: t */
    public int f3026t;

    /* renamed from: w */
    public final PorterDuff.Mode f3027w;

    /* renamed from: x */
    public int f3028x;

    /* renamed from: y */
    public final PorterDuff.Mode f3029y;

    /* renamed from: zx */
    public final Rect f3030zx;

    public AbstractC0877QS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchStyle);
        Typeface typeface;
        C1850ip c1850ip;
        Typeface create;
        int i;
        int resourceId;
        this.f3001R = null;
        this.f3027w = null;
        this.f2996I = false;
        this.f3022q = false;
        this.f3011g = null;
        this.f3029y = null;
        this.f3025s = false;
        this.f3004U = false;
        this.f3008d = VelocityTracker.obtain();
        this.f3015l = true;
        this.f3030zx = new Rect();
        AbstractC1757h0.m3289z(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f3006b = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC0483J5.f1599E;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.switchStyle, 0);
        C2709z9 c2709z9 = new C2709z9(context, obtainStyledAttributes);
        AbstractC2446u3.m4215M(this, context, iArr, attributeSet, obtainStyledAttributes, R.attr.switchStyle);
        Drawable m4642N = c2709z9.m4642N(2);
        this.f3002S = m4642N;
        if (m4642N != null) {
            m4642N.setCallback(this);
        }
        Drawable m4642N2 = c2709z9.m4642N(11);
        this.f3014k = m4642N2;
        if (m4642N2 != null) {
            m4642N2.setCallback(this);
        }
        CharSequence m4641M = c2709z9.m4641M(0);
        this.f3007c = m4641M;
        TransformationMethod mo2033c = ((C1665fK) ((C2196pM) m2024v().f5015w).f6755R).mo2033c(this.f2995HL);
        this.f2994H = mo2033c != null ? mo2033c.getTransformation(m4641M, this) : m4641M;
        this.f3005Yd = null;
        if (this.f2990C && ((C1665fK) ((C2196pM) this.f3018nF.f5015w).f6755R).mo2035k()) {
            Object obj = AbstractC2473ua.f7574z;
        }
        CharSequence m4641M2 = c2709z9.m4641M(1);
        this.f3009e = m4641M2;
        TransformationMethod mo2033c2 = ((C1665fK) ((C2196pM) m2024v().f5015w).f6755R).mo2033c(this.f2995HL);
        this.f2993F = mo2033c2 != null ? mo2033c2.getTransformation(m4641M2, this) : m4641M2;
        this.f3023qn = null;
        if (this.f2990C && ((C1665fK) ((C2196pM) this.f3018nF.f5015w).f6755R).mo2035k()) {
            Object obj2 = AbstractC2473ua.f7574z;
        }
        boolean m4652z = c2709z9.m4652z(3, true);
        this.f2990C = m4652z;
        this.f2992E = c2709z9.m4643P(8, 0);
        this.f3010f = c2709z9.m4643P(5, 0);
        this.f3024r = c2709z9.m4643P(6, 0);
        this.f2997J = c2709z9.m4652z(4, false);
        ColorStateList m4647h = c2709z9.m4647h(9);
        if (m4647h != null) {
            this.f3001R = m4647h;
            this.f2996I = true;
        }
        PorterDuff.Mode m3508v = AbstractC1888jY.m3508v(c2709z9.m4648o(10, -1), null);
        if (m3508v != null) {
            this.f3027w = m3508v;
            this.f3022q = true;
        }
        if (this.f2996I || this.f3022q) {
            m2025z();
        }
        ColorStateList m4647h2 = c2709z9.m4647h(12);
        if (m4647h2 != null) {
            this.f3011g = m4647h2;
            this.f3025s = true;
        }
        PorterDuff.Mode m3508v2 = AbstractC1888jY.m3508v(c2709z9.m4648o(13, -1), null);
        if (m3508v2 != null) {
            this.f3029y = m3508v2;
            this.f3004U = true;
        }
        if (this.f3025s || this.f3004U) {
            m2023h();
        }
        int m4646W = c2709z9.m4646W(7, 0);
        if (m4646W != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(m4646W, AbstractC0483J5.f1614f);
            ColorStateList colorStateList = (!obtainStyledAttributes2.hasValue(3) || (resourceId = obtainStyledAttributes2.getResourceId(3, 0)) == 0 || (colorStateList = AbstractC0865QC.m1999h(context, resourceId)) == null) ? obtainStyledAttributes2.getColorStateList(3) : colorStateList;
            this.f3019nP = colorStateList == null ? getTextColors() : colorStateList;
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i2 = obtainStyledAttributes2.getInt(1, -1);
            int i3 = obtainStyledAttributes2.getInt(2, -1);
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        typeface = null;
                    } else {
                        typeface = Typeface.MONOSPACE;
                    }
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.SANS_SERIF;
            }
            if (i3 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(i3);
                } else {
                    create = Typeface.create(typeface, i3);
                }
                m2022Q(create);
                if (create != null) {
                    i = create.getStyle();
                } else {
                    i = 0;
                }
                int i4 = (~i) & i3;
                textPaint.setFakeBoldText((i4 & 1) != 0);
                textPaint.setTextSkewX((i4 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                m2022Q(typeface);
            }
            if (obtainStyledAttributes2.getBoolean(14, false)) {
                c1850ip = new C1850ip(getContext());
            } else {
                c1850ip = null;
            }
            this.f2995HL = c1850ip;
            CharSequence charSequence = this.f3007c;
            this.f3007c = charSequence;
            TransformationMethod mo2033c3 = ((C1665fK) ((C2196pM) m2024v().f5015w).f6755R).mo2033c(this.f2995HL);
            this.f2994H = mo2033c3 != null ? mo2033c3.getTransformation(charSequence, this) : charSequence;
            this.f3005Yd = null;
            if (m4652z && ((C1665fK) ((C2196pM) this.f3018nF.f5015w).f6755R).mo2035k()) {
                Object obj3 = AbstractC2473ua.f7574z;
            }
            CharSequence charSequence2 = this.f3009e;
            this.f3009e = charSequence2;
            TransformationMethod mo2033c4 = ((C1665fK) ((C2196pM) m2024v().f5015w).f6755R).mo2033c(this.f2995HL);
            this.f2993F = mo2033c4 != null ? mo2033c4.getTransformation(charSequence2, this) : charSequence2;
            this.f3023qn = null;
            if (m4652z && ((C1665fK) ((C2196pM) this.f3018nF.f5015w).f6755R).mo2035k()) {
                Object obj4 = AbstractC2473ua.f7574z;
            }
            obtainStyledAttributes2.recycle();
        }
        new C1791hh(this).m3336P(attributeSet, R.attr.switchStyle);
        c2709z9.m4651w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3013j = viewConfiguration.getScaledTouchSlop();
        this.f3000O = viewConfiguration.getScaledMinimumFlingVelocity();
        m2024v().m3085o(attributeSet, R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* renamed from: N */
    public final StaticLayout m2020N(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f3006b, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: P */
    public final int m2021P() {
        Drawable drawable = this.f3014k;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f3030zx;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f3002S;
        Rect m3507h = drawable2 != null ? AbstractC1888jY.m3507h(drawable2) : AbstractC1888jY.f5901v;
        return ((((this.f3028x - this.f3026t) - rect.left) - rect.right) - m3507h.left) - m3507h.right;
    }

    /* renamed from: Q */
    public final void m2022Q(Typeface typeface) {
        TextPaint textPaint = this.f3006b;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        float f;
        Rect rect;
        int i;
        int i2;
        int i3 = this.f2989B;
        int i4 = this.f2998K;
        int i5 = this.f2991D;
        int i6 = this.f3016m;
        if (AbstractC1586ds.m3062z(this)) {
            f = 1.0f - this.f3017n;
        } else {
            f = this.f3017n;
        }
        int m2021P = ((int) ((f * m2021P()) + 0.5f)) + i3;
        Drawable drawable = this.f3002S;
        if (drawable != null) {
            rect = AbstractC1888jY.m3507h(drawable);
        } else {
            rect = AbstractC1888jY.f5901v;
        }
        Drawable drawable2 = this.f3014k;
        Rect rect2 = this.f3030zx;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            m2021P += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                if (i9 > i10) {
                    i = (i9 - i10) + i4;
                } else {
                    i = i4;
                }
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f3014k.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f3014k.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f3002S;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = m2021P - rect2.left;
            int i16 = m2021P + this.f3026t + rect2.right;
            this.f3002S.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                AbstractC0235ET.m475Q(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f3002S;
        if (drawable != null) {
            AbstractC0235ET.m473N(drawable, f, f2);
        }
        Drawable drawable2 = this.f3014k;
        if (drawable2 != null) {
            AbstractC0235ET.m473N(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3002S;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f3014k;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingLeft() {
        if (!AbstractC1586ds.m3062z(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f3028x;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f3024r : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public final int getCompoundPaddingRight() {
        if (AbstractC1586ds.m3062z(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f3028x;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f3024r : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC1843ih.m3461tJ(super.getCustomSelectionActionModeCallback());
    }

    /* renamed from: h */
    public final void m2023h() {
        Drawable drawable = this.f3014k;
        if (drawable != null) {
            boolean z = this.f3025s;
            boolean z2 = this.f3004U;
            if (z || z2) {
                Drawable mutate = drawable.mutate();
                this.f3014k = mutate;
                if (this.f3025s) {
                    AbstractC0235ET.m478o(mutate, this.f3011g);
                }
                if (z2) {
                    AbstractC0235ET.m476W(this.f3014k, this.f3029y);
                }
                if (this.f3014k.isStateful()) {
                    this.f3014k.setState(getDrawableState());
                }
            }
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3002S;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3014k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f3020od;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f3020od.end();
        this.f3020od = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2988n0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        StaticLayout staticLayout;
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f3014k;
        Rect rect = this.f3030zx;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f2998K;
        int i2 = this.f3016m;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f3002S;
        if (drawable != null) {
            if (this.f2997J && drawable2 != null) {
                Rect m3507h = AbstractC1888jY.m3507h(drawable2);
                drawable2.copyBounds(rect);
                rect.left += m3507h.left;
                rect.right -= m3507h.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (this.f3017n > 0.5f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            staticLayout = this.f3005Yd;
        } else {
            staticLayout = this.f3023qn;
        }
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f3019nP;
            TextPaint textPaint = this.f3006b;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f3007c : this.f3009e;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.f3002S != null) {
            Drawable drawable = this.f3014k;
            Rect rect = this.f3030zx;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect m3507h = AbstractC1888jY.m3507h(this.f3002S);
            i5 = Math.max(0, m3507h.left - rect.left);
            i9 = Math.max(0, m3507h.right - rect.right);
        } else {
            i5 = 0;
        }
        if (AbstractC1586ds.m3062z(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.f3028x + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.f3028x) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i10 = this.f3003T;
            int i11 = height - (i10 / 2);
            i7 = i10 + i11;
            i8 = i11;
        } else if (gravity != 80) {
            i8 = getPaddingTop();
            i7 = this.f3003T + i8;
        } else {
            i7 = getHeight() - getPaddingBottom();
            i8 = i7 - this.f3003T;
        }
        this.f2989B = i6;
        this.f2998K = i8;
        this.f3016m = i7;
        this.f2991D = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z = this.f2990C;
        if (z) {
            if (this.f3005Yd == null) {
                this.f3005Yd = m2020N(this.f2994H);
            }
            if (this.f3023qn == null) {
                this.f3023qn = m2020N(this.f2993F);
            }
        }
        Drawable drawable = this.f3002S;
        int i6 = 0;
        Rect rect = this.f3030zx;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.f3002S.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.f3002S.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (z) {
            i5 = (this.f2992E * 2) + Math.max(this.f3005Yd.getWidth(), this.f3023qn.getWidth());
        } else {
            i5 = 0;
        }
        this.f3026t = Math.max(i5, i3);
        Drawable drawable2 = this.f3014k;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.f3014k.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i7 = rect.left;
        int i8 = rect.right;
        Drawable drawable3 = this.f3002S;
        if (drawable3 != null) {
            Rect m3507h = AbstractC1888jY.m3507h(drawable3);
            i7 = Math.max(i7, m3507h.left);
            i8 = Math.max(i8, m3507h.right);
        }
        boolean z2 = this.f3015l;
        int i9 = this.f3010f;
        if (z2) {
            i9 = Math.max(i9, (this.f3026t * 2) + i7 + i8);
        }
        int max = Math.max(i6, i4);
        this.f3028x = i9;
        this.f3003T = max;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f3007c : this.f3009e;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r1 != 3) goto L90;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC0877QS.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m2024v().m3081R(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        int i = 2;
        int i2 = 64;
        int i3 = R.id.tag_state_description;
        int i4 = 30;
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.f3007c;
                if (obj == null) {
                    obj = getResources().getString(R.string.abc_capital_on);
                }
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                new C2588wm(i3, i2, i4, i).m2972v(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj2 = this.f3009e;
            if (obj2 == null) {
                obj2 = getResources().getString(R.string.abc_capital_off);
            }
            WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
            new C2588wm(i3, i2, i4, i).m2972v(this, obj2);
        }
        float f = 1.0f;
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap3 = AbstractC2446u3.f7488z;
            if (AbstractC1285Y3.m2635v(this)) {
                if (!isChecked) {
                    f = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f2987UZ, f);
                this.f3020od = ofFloat;
                ofFloat.setDuration(250L);
                AbstractC2141oO.m3761z(this.f3020od, true);
                this.f3020od.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f3020od;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!isChecked) {
            f = 0.0f;
        }
        this.f3017n = f;
        invalidate();
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1843ih.m3423Rh(callback, this));
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(m2024v().m3084h(inputFilterArr));
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    /* renamed from: v */
    public final C1624eZ m2024v() {
        if (this.f3018nF == null) {
            this.f3018nF = new C1624eZ(this, 1);
        }
        return this.f3018nF;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3002S || drawable == this.f3014k;
    }

    /* renamed from: z */
    public final void m2025z() {
        Drawable drawable = this.f3002S;
        if (drawable != null) {
            boolean z = this.f2996I;
            boolean z2 = this.f3022q;
            if (z || z2) {
                Drawable mutate = drawable.mutate();
                this.f3002S = mutate;
                if (this.f2996I) {
                    AbstractC0235ET.m478o(mutate, this.f3001R);
                }
                if (z2) {
                    AbstractC0235ET.m476W(this.f3002S, this.f3027w);
                }
                if (this.f3002S.isStateful()) {
                    this.f3002S.setState(getDrawableState());
                }
            }
        }
    }
}
