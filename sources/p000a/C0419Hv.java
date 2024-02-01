package p000a;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: a.Hv */
/* loaded from: classes.dex */
public class C0419Hv extends ViewGroup.MarginLayoutParams {

    /* renamed from: P */
    public boolean f1394P;

    /* renamed from: h */
    public final Rect f1395h;

    /* renamed from: v */
    public boolean f1396v;

    /* renamed from: z */
    public AbstractC0249El f1397z;

    public C0419Hv(int i, int i2) {
        super(i, i2);
        this.f1395h = new Rect();
        this.f1396v = true;
        this.f1394P = false;
    }

    /* renamed from: h */
    public final boolean m948h() {
        if ((this.f1397z.f848G & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final boolean m949v() {
        return this.f1397z.m527W();
    }

    /* renamed from: z */
    public final int m950z() {
        return this.f1397z.m531v();
    }

    public C0419Hv(C0419Hv c0419Hv) {
        super((ViewGroup.LayoutParams) c0419Hv);
        this.f1395h = new Rect();
        this.f1396v = true;
        this.f1394P = false;
    }

    public C0419Hv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1395h = new Rect();
        this.f1396v = true;
        this.f1394P = false;
    }

    public C0419Hv(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1395h = new Rect();
        this.f1396v = true;
        this.f1394P = false;
    }

    public C0419Hv(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f1395h = new Rect();
        this.f1396v = true;
        this.f1394P = false;
    }
}
