package p000a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: a.IU */
/* loaded from: classes.dex */
public final class C0446IU {

    /* renamed from: E */
    public CharSequence f1489E;

    /* renamed from: G */
    public int f1490G;

    /* renamed from: I */
    public CharSequence f1491I;

    /* renamed from: J */
    public ColorStateList f1492J;

    /* renamed from: M */
    public FrameLayout f1493M;

    /* renamed from: N */
    public final TimeInterpolator f1494N;

    /* renamed from: P */
    public final TimeInterpolator f1495P;

    /* renamed from: Q */
    public final TimeInterpolator f1496Q;

    /* renamed from: R */
    public int f1497R;

    /* renamed from: S */
    public final float f1498S;

    /* renamed from: U */
    public ColorStateList f1499U;

    /* renamed from: V */
    public Animator f1500V;

    /* renamed from: W */
    public LinearLayout f1501W;

    /* renamed from: Y */
    public int f1502Y;

    /* renamed from: f */
    public boolean f1503f;

    /* renamed from: g */
    public CharSequence f1504g;

    /* renamed from: h */
    public final int f1505h;

    /* renamed from: k */
    public C0610LT f1506k;

    /* renamed from: o */
    public final TextInputLayout f1507o;

    /* renamed from: q */
    public boolean f1508q;

    /* renamed from: r */
    public C0610LT f1509r;

    /* renamed from: s */
    public int f1510s;

    /* renamed from: u */
    public final Context f1511u;

    /* renamed from: v */
    public final int f1512v;

    /* renamed from: w */
    public int f1513w;

    /* renamed from: y */
    public int f1514y;

    /* renamed from: z */
    public final int f1515z;

    public C0446IU(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f1511u = context;
        this.f1507o = textInputLayout;
        this.f1498S = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f1515z = AbstractC0795Op.m1831U8(context, R.attr.motionDurationShort4, 217);
        this.f1505h = AbstractC0795Op.m1831U8(context, R.attr.motionDurationMedium4, 167);
        this.f1512v = AbstractC0795Op.m1831U8(context, R.attr.motionDurationShort4, 167);
        this.f1495P = AbstractC0795Op.m1802BO(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC1090US.f3561P);
        LinearInterpolator linearInterpolator = AbstractC1090US.f3564z;
        this.f1494N = AbstractC0795Op.m1802BO(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f1496Q = AbstractC0795Op.m1802BO(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* renamed from: N */
    public final TextView m1071N(int i) {
        if (i == 1) {
            return this.f1506k;
        }
        if (i != 2) {
            return null;
        }
        return this.f1509r;
    }

    /* renamed from: P */
    public final void m1072P(ArrayList arrayList, boolean z, TextView textView, int i, int i2, int i3) {
        boolean z2;
        boolean z3;
        float f;
        int i4;
        TimeInterpolator timeInterpolator;
        boolean z4;
        if (textView != null && z) {
            if (i != i3 && i != i2) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                if (i3 == i) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, f);
                int i5 = this.f1512v;
                if (z3) {
                    i4 = this.f1505h;
                } else {
                    i4 = i5;
                }
                ofFloat.setDuration(i4);
                if (z3) {
                    timeInterpolator = this.f1494N;
                } else {
                    timeInterpolator = this.f1496Q;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i == i3 && i2 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    ofFloat.setStartDelay(i5);
                }
                arrayList.add(ofFloat);
                if (i3 == i && i2 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f1498S, 0.0f);
                    ofFloat2.setDuration(this.f1515z);
                    ofFloat2.setInterpolator(this.f1495P);
                    ofFloat2.setStartDelay(i5);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    /* renamed from: Q */
    public final void m1073Q() {
        this.f1491I = null;
        m1078v();
        if (this.f1497R == 1) {
            this.f1513w = (!this.f1503f || TextUtils.isEmpty(this.f1489E)) ? 0 : 2;
        }
        m1074W(this.f1497R, this.f1513w, m1076o(this.f1506k, ""));
    }

    /* renamed from: W */
    public final void m1074W(int i, int i2, boolean z) {
        TextView m1071N;
        TextView m1071N2;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f1500V = animatorSet;
            ArrayList arrayList = new ArrayList();
            m1072P(arrayList, this.f1503f, this.f1509r, 2, i, i2);
            m1072P(arrayList, this.f1508q, this.f1506k, 1, i, i2);
            AbstractC0795Op.m1855l(animatorSet, arrayList);
            animatorSet.addListener(new C0123CM(this, i2, m1071N(i), i, m1071N(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (m1071N2 = m1071N(i2)) != null) {
                m1071N2.setVisibility(0);
                m1071N2.setAlpha(1.0f);
            }
            if (i != 0 && (m1071N = m1071N(i)) != null) {
                m1071N.setVisibility(4);
                if (i == 1) {
                    m1071N.setText((CharSequence) null);
                }
            }
            this.f1497R = i2;
        }
        TextInputLayout textInputLayout = this.f1507o;
        textInputLayout.m5091U();
        textInputLayout.m5102r(z, false);
        textInputLayout.m5095c();
    }

    /* renamed from: h */
    public final void m1075h() {
        boolean z;
        LinearLayout linearLayout = this.f1501W;
        TextInputLayout textInputLayout = this.f1507o;
        if (linearLayout != null && textInputLayout.f9453I != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            EditText editText = textInputLayout.f9453I;
            Context context = this.f1511u;
            boolean m1852i = AbstractC0795Op.m1852i(context);
            LinearLayout linearLayout2 = this.f1501W;
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            int m200Q = AbstractC0095Bq.m200Q(editText);
            if (m1852i) {
                m200Q = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
            if (m1852i) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
            }
            int m198N = AbstractC0095Bq.m198N(editText);
            if (m1852i) {
                m198N = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            AbstractC0095Bq.m197M(linearLayout2, m200Q, dimensionPixelSize, m198N, 0);
        }
    }

    /* renamed from: o */
    public final boolean m1076o(TextView textView, CharSequence charSequence) {
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        TextInputLayout textInputLayout = this.f1507o;
        if (AbstractC1285Y3.m2635v(textInputLayout) && textInputLayout.isEnabled() && (this.f1513w != this.f1497R || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public final void m1077u(TextView textView, int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f1501W;
        if (viewGroup2 == null) {
            return;
        }
        boolean z = true;
        if (i != 0 && i != 1) {
            z = false;
        }
        if (z && (viewGroup = this.f1493M) != null) {
            viewGroup2 = viewGroup;
        }
        viewGroup2.removeView(textView);
        int i2 = this.f1490G - 1;
        this.f1490G = i2;
        LinearLayout linearLayout = this.f1501W;
        if (i2 == 0) {
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: v */
    public final void m1078v() {
        Animator animator = this.f1500V;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: z */
    public final void m1079z(TextView textView, int i) {
        boolean z;
        if (this.f1501W == null && this.f1493M == null) {
            Context context = this.f1511u;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f1501W = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f1501W;
            TextInputLayout textInputLayout = this.f1507o;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f1493M = new FrameLayout(context);
            this.f1501W.addView(this.f1493M, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.f9453I != null) {
                m1075h();
            }
        }
        if (i != 0 && i != 1) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f1493M.setVisibility(0);
            this.f1493M.addView(textView);
        } else {
            this.f1501W.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f1501W.setVisibility(0);
        this.f1490G++;
    }
}
