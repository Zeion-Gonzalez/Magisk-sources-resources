package p000a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.topjohnwu.magisk.R;
import java.util.WeakHashMap;

/* renamed from: a.ax */
/* loaded from: classes.dex */
public final class C1436ax extends LinearLayout {

    /* renamed from: I */
    public final CheckableImageButton f4491I;

    /* renamed from: R */
    public final C0610LT f4492R;

    /* renamed from: S */
    public final TextInputLayout f4493S;

    /* renamed from: g */
    public int f4494g;

    /* renamed from: k */
    public PorterDuff.Mode f4495k;

    /* renamed from: q */
    public ColorStateList f4496q;

    /* renamed from: s */
    public boolean f4497s;

    /* renamed from: w */
    public CharSequence f4498w;

    /* renamed from: y */
    public View.OnLongClickListener f4499y;

    public C1436ax(TextInputLayout textInputLayout, C2709z9 c2709z9) {
        super(textInputLayout.getContext());
        boolean z;
        CharSequence m4641M;
        boolean z2;
        this.f4493S = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f4491I = checkableImageButton;
        C0610LT c0610lt = new C0610LT(getContext(), null);
        this.f4492R = c0610lt;
        if (AbstractC0795Op.m1852i(getContext())) {
            AbstractC0293FZ.m614u((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f4499y;
        checkableImageButton.setOnClickListener(null);
        AbstractC0795Op.m1825Pm(checkableImageButton, onLongClickListener);
        this.f4499y = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0795Op.m1825Pm(checkableImageButton, null);
        if (c2709z9.m4645V(69)) {
            this.f4496q = AbstractC0795Op.m1841c(getContext(), c2709z9, 69);
        }
        if (c2709z9.m4645V(70)) {
            this.f4495k = AbstractC0795Op.m1856m(c2709z9.m4648o(70, -1), null);
        }
        if (c2709z9.m4645V(66)) {
            Drawable m4642N = c2709z9.m4642N(66);
            checkableImageButton.setImageDrawable(m4642N);
            if (m4642N != null) {
                AbstractC0795Op.m1850h(textInputLayout, checkableImageButton, this.f4496q, this.f4495k);
                if (checkableImageButton.getVisibility() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    checkableImageButton.setVisibility(0);
                    m2862h();
                    m2863v();
                }
                AbstractC0795Op.m1879zx(textInputLayout, checkableImageButton, this.f4496q);
            } else {
                if (checkableImageButton.getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    checkableImageButton.setVisibility(8);
                    m2862h();
                    m2863v();
                }
                View.OnLongClickListener onLongClickListener2 = this.f4499y;
                checkableImageButton.setOnClickListener(null);
                AbstractC0795Op.m1825Pm(checkableImageButton, onLongClickListener2);
                this.f4499y = null;
                checkableImageButton.setOnLongClickListener(null);
                AbstractC0795Op.m1825Pm(checkableImageButton, null);
                if (checkableImageButton.getContentDescription() != null) {
                    checkableImageButton.setContentDescription(null);
                }
            }
            if (c2709z9.m4645V(65) && checkableImageButton.getContentDescription() != (m4641M = c2709z9.m4641M(65))) {
                checkableImageButton.setContentDescription(m4641M);
            }
            boolean m4652z = c2709z9.m4652z(64, true);
            if (checkableImageButton.f9382q != m4652z) {
                checkableImageButton.f9382q = m4652z;
                checkableImageButton.sendAccessibilityEvent(0);
            }
        }
        int m4643P = c2709z9.m4643P(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (m4643P >= 0) {
            if (m4643P != this.f4494g) {
                this.f4494g = m4643P;
                checkableImageButton.setMinimumWidth(m4643P);
                checkableImageButton.setMinimumHeight(m4643P);
            }
            if (c2709z9.m4645V(68)) {
                checkableImageButton.setScaleType(AbstractC0795Op.m1820M(c2709z9.m4648o(68, -1)));
            }
            c0610lt.setVisibility(8);
            c0610lt.setId(R.id.textinput_prefix_text);
            c0610lt.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            AbstractC1285Y3.m2632Q(c0610lt, 1);
            c0610lt.setTextAppearance(c2709z9.m4646W(60, 0));
            if (c2709z9.m4645V(61)) {
                c0610lt.setTextColor(c2709z9.m4647h(61));
            }
            CharSequence m4641M2 = c2709z9.m4641M(59);
            this.f4498w = TextUtils.isEmpty(m4641M2) ? null : m4641M2;
            c0610lt.setText(m4641M2);
            m2863v();
            addView(checkableImageButton);
            addView(c0610lt);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    /* renamed from: h */
    public final void m2862h() {
        boolean z;
        EditText editText = this.f4493S.f9453I;
        if (editText == null) {
            return;
        }
        int i = 0;
        if (this.f4491I.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            i = AbstractC0095Bq.m200Q(editText);
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
        AbstractC0095Bq.m197M(this.f4492R, i, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m2862h();
    }

    /* renamed from: v */
    public final void m2863v() {
        int i = (this.f4498w == null || this.f4497s) ? 8 : 0;
        setVisibility(this.f4491I.getVisibility() == 0 || i == 0 ? 0 : 8);
        this.f4492R.setVisibility(i);
        this.f4493S.m5103s();
    }

    /* renamed from: z */
    public final int m2864z() {
        boolean z;
        CheckableImageButton checkableImageButton = this.f4491I;
        int i = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = AbstractC0293FZ.m612h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        }
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        return AbstractC0095Bq.m200Q(this.f4492R) + AbstractC0095Bq.m200Q(this) + i;
    }
}
