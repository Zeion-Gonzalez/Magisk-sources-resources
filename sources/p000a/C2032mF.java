package p000a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: a.mF */
/* loaded from: classes.dex */
public class C2032mF extends C1707g5 {

    /* renamed from: C */
    public boolean f6326C;

    /* renamed from: E */
    public Drawable f6327E;

    /* renamed from: F */
    public int[] f6328F;

    /* renamed from: H */
    public final PorterDuff.Mode f6329H;

    /* renamed from: J */
    public ColorStateList f6330J;

    /* renamed from: L */
    public final C1152VY f6331L;

    /* renamed from: U */
    public final CharSequence f6332U;

    /* renamed from: c */
    public final ColorStateList f6333c;

    /* renamed from: e */
    public int f6334e;

    /* renamed from: f */
    public Drawable f6335f;

    /* renamed from: g */
    public boolean f6336g;

    /* renamed from: i */
    public final C0167DF f6337i;

    /* renamed from: j */
    public CompoundButton.OnCheckedChangeListener f6338j;

    /* renamed from: k */
    public ColorStateList f6339k;

    /* renamed from: p */
    public CharSequence f6340p;

    /* renamed from: q */
    public final LinkedHashSet f6341q;

    /* renamed from: r */
    public boolean f6342r;

    /* renamed from: s */
    public final boolean f6343s;

    /* renamed from: y */
    public final boolean f6344y;

    /* renamed from: d */
    public static final int[] f6323d = {R.attr.state_indeterminate};

    /* renamed from: O */
    public static final int[] f6322O = {R.attr.state_error};

    /* renamed from: n */
    public static final int[][] f6324n = {new int[]{16842910, R.attr.state_error}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: x */
    public static final int f6325x = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* JADX WARN: Removed duplicated region for block: B:102:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2032mF(android.content.Context r12, android.util.AttributeSet r13) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2032mF.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* renamed from: P */
    public final void m3670P() {
        Resources resources;
        int i;
        if (Build.VERSION.SDK_INT >= 30 && this.f6340p == null) {
            int i2 = this.f6334e;
            if (i2 == 1) {
                resources = getResources();
                i = R.string.mtrl_checkbox_state_description_checked;
            } else if (i2 == 0) {
                resources = getResources();
                i = R.string.mtrl_checkbox_state_description_unchecked;
            } else {
                resources = getResources();
                i = R.string.mtrl_checkbox_state_description_indeterminate;
            }
            super.setStateDescription(resources.getString(i));
        }
    }

    @Override // android.widget.CompoundButton
    public final Drawable getButtonDrawable() {
        return this.f6327E;
    }

    @Override // android.widget.CompoundButton
    public final ColorStateList getButtonTintList() {
        return this.f6330J;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f6334e == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6336g && this.f6330J == null && this.f6333c == null) {
            this.f6336g = true;
            if (this.f6339k == null) {
                int m1816J = AbstractC0795Op.m1816J(this, R.attr.colorControlActivated);
                int m1816J2 = AbstractC0795Op.m1816J(this, R.attr.colorError);
                int m1816J3 = AbstractC0795Op.m1816J(this, R.attr.colorSurface);
                int m1816J4 = AbstractC0795Op.m1816J(this, R.attr.colorOnSurface);
                this.f6339k = new ColorStateList(f6324n, new int[]{AbstractC0795Op.m1829T(m1816J3, m1816J2, 1.0f), AbstractC0795Op.m1829T(m1816J3, m1816J, 1.0f), AbstractC0795Op.m1829T(m1816J3, m1816J4, 0.54f), AbstractC0795Op.m1829T(m1816J3, m1816J4, 0.38f), AbstractC0795Op.m1829T(m1816J3, m1816J4, 0.38f)});
            }
            AbstractC2293rB.m3952v(this, this.f6339k);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.f6334e == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f6323d);
        }
        if (this.f6343s) {
            View.mergeDrawableStates(onCreateDrawableState, f6322O);
        }
        int i2 = 0;
        while (true) {
            if (i2 < onCreateDrawableState.length) {
                int i3 = onCreateDrawableState[i2];
                if (i3 == 16842912) {
                    copyOf = onCreateDrawableState;
                    break;
                }
                if (i3 == 0) {
                    copyOf = (int[]) onCreateDrawableState.clone();
                    copyOf[i2] = 16842912;
                    break;
                }
                i2++;
            } else {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
        }
        this.f6328F = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable m2929z;
        int i;
        if (this.f6344y && TextUtils.isEmpty(getText()) && (m2929z = AbstractC1511cT.m2929z(this)) != null) {
            if (AbstractC0795Op.m1842d(this)) {
                i = -1;
            } else {
                i = 1;
            }
            int width = ((getWidth() - m2929z.getIntrinsicWidth()) / 2) * i;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = m2929z.getBounds();
                AbstractC0235ET.m475Q(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f6343s) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f6332U));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1053Tj)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1053Tj c1053Tj = (C1053Tj) parcelable;
        super.onRestoreInstanceState(c1053Tj.getSuperState());
        m3671v(c1053Tj.f3477S);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        C1053Tj c1053Tj = new C1053Tj(super.onSaveInstanceState());
        c1053Tj.f3477S = this.f6334e;
        return c1053Tj;
    }

    @Override // p000a.C1707g5, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC1843ih.m3431X(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintList(ColorStateList colorStateList) {
        if (this.f6330J == colorStateList) {
            return;
        }
        this.f6330J = colorStateList;
        m3672z();
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintMode(PorterDuff.Mode mode) {
        C0375H9 c0375h9 = this.f5370S;
        if (c0375h9 != null) {
            c0375h9.f1287v = mode;
            c0375h9.f1282N = true;
            c0375h9.m865z();
        }
        m3672z();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        m3671v(z ? 1 : 0);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f6338j = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public final void setStateDescription(CharSequence charSequence) {
        this.f6340p = charSequence;
        if (charSequence == null) {
            m3670P();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* renamed from: v */
    public final void m3671v(int i) {
        AutofillManager m4305Q;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f6334e != i) {
            this.f6334e = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            m3670P();
            if (this.f6326C) {
                return;
            }
            this.f6326C = true;
            LinkedHashSet linkedHashSet = this.f6341q;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    AbstractC2441tz.m4202q(it.next());
                    throw null;
                }
            }
            if (this.f6334e != 2 && (onCheckedChangeListener = this.f6338j) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (m4305Q = AbstractC2494v.m4305Q(getContext().getSystemService(AbstractC2494v.m4322u()))) != null) {
                m4305Q.notifyValueChanged(this);
            }
            this.f6326C = false;
        }
    }

    /* renamed from: z */
    public final void m3672z() {
        ColorStateList colorStateList;
        C2558wC c2558wC;
        Drawable drawable = this.f6327E;
        ColorStateList colorStateList2 = this.f6330J;
        PorterDuff.Mode m3951h = AbstractC2293rB.m3951h(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList2 != null) {
            drawable = drawable.mutate();
            if (m3951h != null) {
                AbstractC0235ET.m476W(drawable, m3951h);
            }
        }
        this.f6327E = drawable;
        Drawable drawable2 = this.f6335f;
        ColorStateList colorStateList3 = this.f6333c;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList3 != null) {
            drawable2 = drawable2.mutate();
            PorterDuff.Mode mode = this.f6329H;
            if (mode != null) {
                AbstractC0235ET.m476W(drawable2, mode);
            }
        }
        this.f6335f = drawable2;
        int i = 2;
        if (this.f6342r) {
            C1152VY c1152vy = this.f6331L;
            if (c1152vy != null) {
                Drawable drawable3 = c1152vy.f1387S;
                C0167DF c0167df = this.f6337i;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (c0167df.f526z == null) {
                        c0167df.f526z = new C1214Wg(c0167df);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c0167df.f526z);
                }
                ArrayList arrayList = c1152vy.f3742q;
                C0120CJ c0120cj = c1152vy.f3740R;
                if (arrayList != null && c0167df != null) {
                    arrayList.remove(c0167df);
                    if (c1152vy.f3742q.size() == 0 && (c2558wC = c1152vy.f3739I) != null) {
                        c0120cj.f418h.removeListener(c2558wC);
                        c1152vy.f3739I = null;
                    }
                }
                Drawable drawable4 = c1152vy.f1387S;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (c0167df.f526z == null) {
                        c0167df.f526z = new C1214Wg(c0167df);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c0167df.f526z);
                } else if (c0167df != null) {
                    if (c1152vy.f3742q == null) {
                        c1152vy.f3742q = new ArrayList();
                    }
                    if (!c1152vy.f3742q.contains(c0167df)) {
                        c1152vy.f3742q.add(c0167df);
                        if (c1152vy.f3739I == null) {
                            c1152vy.f3739I = new C2558wC(i, c1152vy);
                        }
                        c0120cj.f418h.addListener(c1152vy.f3739I);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable5 = this.f6327E;
                if ((drawable5 instanceof AnimatedStateListDrawable) && c1152vy != null) {
                    ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, c1152vy, false);
                    ((AnimatedStateListDrawable) this.f6327E).addTransition(R.id.indeterminate, R.id.unchecked, c1152vy, false);
                }
            }
        }
        Drawable drawable6 = this.f6327E;
        if (drawable6 != null && (colorStateList = this.f6330J) != null) {
            AbstractC0235ET.m478o(drawable6, colorStateList);
        }
        Drawable drawable7 = this.f6335f;
        if (drawable7 != null && colorStateList3 != null) {
            AbstractC0235ET.m478o(drawable7, colorStateList3);
        }
        Drawable drawable8 = this.f6327E;
        Drawable drawable9 = this.f6335f;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // p000a.C1707g5, android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        this.f6327E = drawable;
        this.f6342r = false;
        m3672z();
    }
}
