package p000a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;

/* renamed from: a.uB */
/* loaded from: classes.dex */
public abstract class AbstractC2451uB extends Drawable.ConstantState {

    /* renamed from: E */
    public boolean f7491E;

    /* renamed from: F */
    public boolean f7492F;

    /* renamed from: G */
    public boolean f7493G;

    /* renamed from: H */
    public boolean f7494H;

    /* renamed from: I */
    public int f7495I;

    /* renamed from: J */
    public boolean f7496J;

    /* renamed from: M */
    public Rect f7497M;

    /* renamed from: N */
    public int f7498N;

    /* renamed from: P */
    public int f7499P;

    /* renamed from: Q */
    public SparseArray f7500Q;

    /* renamed from: R */
    public int f7501R;

    /* renamed from: S */
    public boolean f7502S;

    /* renamed from: U */
    public boolean f7503U;

    /* renamed from: V */
    public boolean f7504V;

    /* renamed from: W */
    public boolean f7505W;

    /* renamed from: X */
    public PorterDuff.Mode f7506X;

    /* renamed from: Y */
    public int f7507Y;

    /* renamed from: Z */
    public boolean f7508Z;

    /* renamed from: c */
    public ColorFilter f7509c;

    /* renamed from: e */
    public ColorStateList f7510e;

    /* renamed from: f */
    public int f7511f;

    /* renamed from: g */
    public int f7512g;

    /* renamed from: h */
    public Resources f7513h;

    /* renamed from: k */
    public boolean f7514k;

    /* renamed from: o */
    public int f7515o;

    /* renamed from: q */
    public int f7516q;

    /* renamed from: r */
    public int f7517r;

    /* renamed from: s */
    public boolean f7518s;

    /* renamed from: u */
    public Drawable[] f7519u;

    /* renamed from: v */
    public int f7520v;

    /* renamed from: w */
    public int f7521w;

    /* renamed from: y */
    public boolean f7522y;

    /* renamed from: z */
    public final AbstractC0913RC f7523z;

    public AbstractC2451uB(AbstractC2451uB abstractC2451uB, AbstractC0913RC abstractC0913RC, Resources resources) {
        Resources resources2;
        int i;
        SparseArray sparseArray;
        this.f7505W = false;
        this.f7504V = false;
        this.f7491E = true;
        this.f7517r = 0;
        this.f7507Y = 0;
        this.f7523z = abstractC0913RC;
        if (resources != null) {
            resources2 = resources;
        } else if (abstractC2451uB != null) {
            resources2 = abstractC2451uB.f7513h;
        } else {
            resources2 = null;
        }
        this.f7513h = resources2;
        if (abstractC2451uB != null) {
            i = abstractC2451uB.f7520v;
        } else {
            i = 0;
        }
        int i2 = AbstractC0913RC.f3127r;
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        i = i == 0 ? 160 : i;
        this.f7520v = i;
        if (abstractC2451uB != null) {
            this.f7499P = abstractC2451uB.f7499P;
            this.f7498N = abstractC2451uB.f7498N;
            this.f7518s = true;
            this.f7503U = true;
            this.f7505W = abstractC2451uB.f7505W;
            this.f7504V = abstractC2451uB.f7504V;
            this.f7491E = abstractC2451uB.f7491E;
            this.f7511f = abstractC2451uB.f7511f;
            this.f7517r = abstractC2451uB.f7517r;
            this.f7507Y = abstractC2451uB.f7507Y;
            this.f7496J = abstractC2451uB.f7496J;
            this.f7509c = abstractC2451uB.f7509c;
            this.f7494H = abstractC2451uB.f7494H;
            this.f7510e = abstractC2451uB.f7510e;
            this.f7506X = abstractC2451uB.f7506X;
            this.f7492F = abstractC2451uB.f7492F;
            this.f7508Z = abstractC2451uB.f7508Z;
            if (abstractC2451uB.f7520v == i) {
                if (abstractC2451uB.f7493G) {
                    this.f7497M = abstractC2451uB.f7497M != null ? new Rect(abstractC2451uB.f7497M) : null;
                    this.f7493G = true;
                }
                if (abstractC2451uB.f7502S) {
                    this.f7501R = abstractC2451uB.f7501R;
                    this.f7521w = abstractC2451uB.f7521w;
                    this.f7495I = abstractC2451uB.f7495I;
                    this.f7516q = abstractC2451uB.f7516q;
                    this.f7502S = true;
                }
            }
            if (abstractC2451uB.f7514k) {
                this.f7512g = abstractC2451uB.f7512g;
                this.f7514k = true;
            }
            if (abstractC2451uB.f7522y) {
                this.f7522y = true;
            }
            Drawable[] drawableArr = abstractC2451uB.f7519u;
            this.f7519u = new Drawable[drawableArr.length];
            this.f7515o = abstractC2451uB.f7515o;
            SparseArray sparseArray2 = abstractC2451uB.f7500Q;
            if (sparseArray2 != null) {
                sparseArray = sparseArray2.clone();
            } else {
                sparseArray = new SparseArray(this.f7515o);
            }
            this.f7500Q = sparseArray;
            int i3 = this.f7515o;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f7500Q.put(i4, constantState);
                    } else {
                        this.f7519u[i4] = drawableArr[i4];
                    }
                }
            }
            return;
        }
        this.f7519u = new Drawable[10];
        this.f7515o = 0;
    }

    /* renamed from: N */
    public abstract void mo3602N();

    /* renamed from: P */
    public final Drawable m4235P(int i) {
        int indexOfKey;
        Drawable drawable = this.f7519u[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f7500Q;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f7500Q.valueAt(indexOfKey)).newDrawable(this.f7513h);
        AbstractC2340s1.m3999h(newDrawable, this.f7511f);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f7523z);
        this.f7519u[i] = mutate;
        this.f7500Q.removeAt(indexOfKey);
        if (this.f7500Q.size() == 0) {
            this.f7500Q = null;
        }
        return mutate;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.f7515o;
        Drawable[] drawableArr = this.f7519u;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                if (AbstractC0235ET.m477h(drawable)) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f7500Q.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f7499P | this.f7498N;
    }

    /* renamed from: h */
    public final void m4236h() {
        this.f7502S = true;
        m4237v();
        int i = this.f7515o;
        Drawable[] drawableArr = this.f7519u;
        this.f7521w = -1;
        this.f7501R = -1;
        this.f7516q = 0;
        this.f7495I = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f7501R) {
                this.f7501R = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f7521w) {
                this.f7521w = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f7495I) {
                this.f7495I = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f7516q) {
                this.f7516q = minimumHeight;
            }
        }
    }

    /* renamed from: v */
    public final void m4237v() {
        SparseArray sparseArray = this.f7500Q;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = this.f7500Q.keyAt(i);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f7500Q.valueAt(i);
                Drawable[] drawableArr = this.f7519u;
                Drawable newDrawable = constantState.newDrawable(this.f7513h);
                AbstractC2340s1.m3999h(newDrawable, this.f7511f);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f7523z);
                drawableArr[keyAt] = mutate;
            }
            this.f7500Q = null;
        }
    }

    /* renamed from: z */
    public final int m4238z(Drawable drawable) {
        int i = this.f7515o;
        if (i >= this.f7519u.length) {
            int i2 = i + 10;
            AbstractC2324rj abstractC2324rj = (AbstractC2324rj) this;
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = abstractC2324rj.f7519u;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            abstractC2324rj.f7519u = drawableArr;
            int[][] iArr = new int[i2];
            System.arraycopy(abstractC2324rj.f7154C, 0, iArr, 0, i);
            abstractC2324rj.f7154C = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f7523z);
        this.f7519u[i] = drawable;
        this.f7515o++;
        this.f7498N = drawable.getChangingConfigurations() | this.f7498N;
        this.f7514k = false;
        this.f7522y = false;
        this.f7497M = null;
        this.f7493G = false;
        this.f7502S = false;
        this.f7518s = false;
        return i;
    }
}
