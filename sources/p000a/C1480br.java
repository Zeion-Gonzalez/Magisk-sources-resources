package p000a;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: a.br */
/* loaded from: classes.dex */
public class C1480br extends Drawable.ConstantState {

    /* renamed from: G */
    public float f4596G;

    /* renamed from: I */
    public final int f4597I;

    /* renamed from: M */
    public float f4598M;

    /* renamed from: N */
    public final ColorStateList f4599N;

    /* renamed from: P */
    public ColorStateList f4600P;

    /* renamed from: Q */
    public ColorStateList f4601Q;

    /* renamed from: R */
    public float f4602R;

    /* renamed from: S */
    public float f4603S;

    /* renamed from: V */
    public int f4604V;

    /* renamed from: W */
    public final float f4605W;

    /* renamed from: g */
    public int f4606g;

    /* renamed from: h */
    public C1445b5 f4607h;

    /* renamed from: k */
    public int f4608k;

    /* renamed from: o */
    public Rect f4609o;

    /* renamed from: q */
    public int f4610q;

    /* renamed from: s */
    public final Paint.Style f4611s;

    /* renamed from: u */
    public PorterDuff.Mode f4612u;

    /* renamed from: v */
    public ColorStateList f4613v;

    /* renamed from: w */
    public final float f4614w;

    /* renamed from: y */
    public boolean f4615y;

    /* renamed from: z */
    public C0099Bw f4616z;

    public C1480br(C1480br c1480br) {
        this.f4613v = null;
        this.f4600P = null;
        this.f4599N = null;
        this.f4601Q = null;
        this.f4612u = PorterDuff.Mode.SRC_IN;
        this.f4609o = null;
        this.f4605W = 1.0f;
        this.f4596G = 1.0f;
        this.f4604V = 255;
        this.f4603S = 0.0f;
        this.f4602R = 0.0f;
        this.f4614w = 0.0f;
        this.f4597I = 0;
        this.f4610q = 0;
        this.f4608k = 0;
        this.f4606g = 0;
        this.f4615y = false;
        this.f4611s = Paint.Style.FILL_AND_STROKE;
        this.f4616z = c1480br.f4616z;
        this.f4607h = c1480br.f4607h;
        this.f4598M = c1480br.f4598M;
        this.f4613v = c1480br.f4613v;
        this.f4600P = c1480br.f4600P;
        this.f4612u = c1480br.f4612u;
        this.f4601Q = c1480br.f4601Q;
        this.f4604V = c1480br.f4604V;
        this.f4605W = c1480br.f4605W;
        this.f4608k = c1480br.f4608k;
        this.f4597I = c1480br.f4597I;
        this.f4615y = c1480br.f4615y;
        this.f4596G = c1480br.f4596G;
        this.f4603S = c1480br.f4603S;
        this.f4602R = c1480br.f4602R;
        this.f4614w = c1480br.f4614w;
        this.f4610q = c1480br.f4610q;
        this.f4606g = c1480br.f4606g;
        this.f4599N = c1480br.f4599N;
        this.f4611s = c1480br.f4611s;
        if (c1480br.f4609o != null) {
            this.f4609o = new Rect(c1480br.f4609o);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C2281qz c2281qz = new C2281qz(this);
        c2281qz.f7031q = true;
        return c2281qz;
    }

    public C1480br(C0099Bw c0099Bw) {
        this.f4613v = null;
        this.f4600P = null;
        this.f4599N = null;
        this.f4601Q = null;
        this.f4612u = PorterDuff.Mode.SRC_IN;
        this.f4609o = null;
        this.f4605W = 1.0f;
        this.f4596G = 1.0f;
        this.f4604V = 255;
        this.f4603S = 0.0f;
        this.f4602R = 0.0f;
        this.f4614w = 0.0f;
        this.f4597I = 0;
        this.f4610q = 0;
        this.f4608k = 0;
        this.f4606g = 0;
        this.f4615y = false;
        this.f4611s = Paint.Style.FILL_AND_STROKE;
        this.f4616z = c0099Bw;
        this.f4607h = null;
    }
}
