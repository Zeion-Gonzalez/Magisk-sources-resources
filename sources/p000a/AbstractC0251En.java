package p000a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;

/* renamed from: a.En */
/* loaded from: classes.dex */
public abstract class AbstractC0251En {

    /* renamed from: G */
    public int f879G;

    /* renamed from: I */
    public int f880I;

    /* renamed from: M */
    public Animator f881M;

    /* renamed from: N */
    public LayerDrawable f882N;

    /* renamed from: P */
    public C2251qP f883P;

    /* renamed from: Q */
    public boolean f884Q;

    /* renamed from: R */
    public float f885R;

    /* renamed from: S */
    public C0030Ab f886S;

    /* renamed from: V */
    public C0030Ab f888V;

    /* renamed from: W */
    public float f889W;

    /* renamed from: f */
    public ViewTreeObserverOnPreDrawListenerC2587wk f890f;

    /* renamed from: g */
    public final C2196pM f891g;

    /* renamed from: h */
    public C2281qz f892h;

    /* renamed from: k */
    public final FloatingActionButton f893k;

    /* renamed from: o */
    public float f894o;

    /* renamed from: u */
    public float f897u;

    /* renamed from: v */
    public Drawable f898v;

    /* renamed from: z */
    public C0099Bw f901z;

    /* renamed from: r */
    public static final C1945kc f877r = AbstractC1090US.f3563v;

    /* renamed from: Y */
    public static final int f872Y = R.attr.motionDurationLong2;

    /* renamed from: J */
    public static final int f870J = R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: c */
    public static final int f874c = R.attr.motionDurationMedium1;

    /* renamed from: H */
    public static final int f869H = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* renamed from: e */
    public static final int[] f875e = {16842919, 16842910};

    /* renamed from: X */
    public static final int[] f871X = {16843623, 16842908, 16842910};

    /* renamed from: F */
    public static final int[] f868F = {16842908, 16842910};

    /* renamed from: Z */
    public static final int[] f873Z = {16843623, 16842910};

    /* renamed from: C */
    public static final int[] f867C = {16842910};

    /* renamed from: p */
    public static final int[] f876p = new int[0];

    /* renamed from: w */
    public float f899w = 1.0f;

    /* renamed from: q */
    public int f895q = 0;

    /* renamed from: y */
    public final Rect f900y = new Rect();

    /* renamed from: s */
    public final RectF f896s = new RectF();

    /* renamed from: U */
    public final RectF f887U = new RectF();

    /* renamed from: E */
    public final Matrix f878E = new Matrix();

    public AbstractC0251En(FloatingActionButton floatingActionButton, C2196pM c2196pM) {
        this.f893k = floatingActionButton;
        this.f891g = c2196pM;
        C0525Ju c0525Ju = new C0525Ju(5);
        C1410aT c1410aT = (C1410aT) this;
        c0525Ju.m1226Q(f875e, m534P(new C0613LX(c1410aT, 2)));
        int i = 1;
        c0525Ju.m1226Q(f871X, m534P(new C0613LX(c1410aT, i)));
        c0525Ju.m1226Q(f868F, m534P(new C0613LX(c1410aT, i)));
        c0525Ju.m1226Q(f873Z, m534P(new C0613LX(c1410aT, i)));
        c0525Ju.m1226Q(f867C, m534P(new C0613LX(c1410aT, 3)));
        c0525Ju.m1226Q(f876p, m534P(new C0613LX(c1410aT, 0)));
        this.f885R = floatingActionButton.getRotation();
    }

    /* renamed from: P */
    public static ValueAnimator m534P(C0613LX c0613lx) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f877r);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(c0613lx);
        valueAnimator.addUpdateListener(c0613lx);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* renamed from: G */
    public abstract void mo535G(float f, float f2, float f3);

    /* renamed from: M */
    public final void m536M() {
    }

    /* renamed from: N */
    public abstract float mo537N();

    /* renamed from: Q */
    public void mo538Q(Rect rect) {
        int i = 0;
        if (this.f884Q) {
            int i2 = this.f879G;
            FloatingActionButton floatingActionButton = this.f893k;
            i = Math.max((i2 - floatingActionButton.m5060Q(floatingActionButton.f9365I)) / 2, 0);
        }
        int max = Math.max(i, (int) Math.ceil(mo537N() + this.f889W));
        int max2 = Math.max(i, (int) Math.ceil(r0 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    /* renamed from: R */
    public abstract void mo539R();

    /* renamed from: S */
    public abstract boolean mo540S();

    /* renamed from: V */
    public final void m541V(C0099Bw c0099Bw) {
        this.f901z = c0099Bw;
        C2281qz c2281qz = this.f892h;
        if (c2281qz != null) {
            c2281qz.mo3137h(c0099Bw);
        }
        Drawable drawable = this.f898v;
        if (drawable instanceof InterfaceC1661fF) {
            ((InterfaceC1661fF) drawable).mo3137h(c0099Bw);
        }
        C2251qP c2251qP = this.f883P;
        if (c2251qP != null) {
            c2251qP.f6934w = c0099Bw;
            c2251qP.invalidateSelf();
        }
    }

    /* renamed from: W */
    public abstract void mo542W(int[] iArr);

    /* renamed from: h */
    public final AnimatorSet m543h(C0030Ab c0030Ab, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.f893k;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, property, fArr);
        c0030Ab.m72Q("opacity").m2893z(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton, View.SCALE_X, f2);
        c0030Ab.m72Q("scale").m2893z(ofFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            ofFloat2.setEvaluator(new C0176DQ());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton, View.SCALE_Y, f2);
        c0030Ab.m72Q("scale").m2893z(ofFloat3);
        if (i == 26) {
            ofFloat3.setEvaluator(new C0176DQ());
        }
        arrayList.add(ofFloat3);
        Matrix matrix = this.f878E;
        m548z(f3, matrix);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(floatingActionButton, new C0083Bb(), new C2679yb(this), new Matrix(matrix));
        c0030Ab.m72Q("iconScale").m2893z(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AbstractC0795Op.m1855l(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: o */
    public abstract void mo544o();

    /* renamed from: u */
    public abstract void mo545u(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i);

    /* renamed from: v */
    public final AnimatorSet m546v(float f, float f2, float f3, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f893k;
        ofFloat.addUpdateListener(new C1554dF(this, floatingActionButton.getAlpha(), f, floatingActionButton.getScaleX(), f2, floatingActionButton.getScaleY(), this.f899w, f3, new Matrix(this.f878E)));
        arrayList.add(ofFloat);
        AbstractC0795Op.m1855l(animatorSet, arrayList);
        animatorSet.setDuration(AbstractC0795Op.m1831U8(floatingActionButton.getContext(), i, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(AbstractC0795Op.m1802BO(floatingActionButton.getContext(), i2, AbstractC1090US.f3562h));
        return animatorSet;
    }

    /* renamed from: w */
    public final void m547w() {
        Drawable drawable;
        Rect rect = this.f900y;
        mo538Q(rect);
        AbstractC1843ih.m3407G(this.f882N, "Didn't initialize content background");
        if (mo540S()) {
            drawable = new InsetDrawable((Drawable) this.f882N, rect.left, rect.top, rect.right, rect.bottom);
        } else {
            drawable = this.f882N;
        }
        C2196pM c2196pM = this.f891g;
        c2196pM.m3816E(drawable);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        ((FloatingActionButton) c2196pM.f6755R).f9373s.set(i, i2, i3, i4);
        FloatingActionButton floatingActionButton = (FloatingActionButton) c2196pM.f6755R;
        int i5 = floatingActionButton.f9370k;
        floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
    }

    /* renamed from: z */
    public final void m548z(float f, Matrix matrix) {
        matrix.reset();
        if (this.f893k.getDrawable() == null || this.f880I == 0) {
            return;
        }
        RectF rectF = this.f896s;
        RectF rectF2 = this.f887U;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i = this.f880I;
        rectF2.set(0.0f, 0.0f, i, i);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i2 = this.f880I;
        matrix.postScale(f, f, i2 / 2.0f, i2 / 2.0f);
    }
}
