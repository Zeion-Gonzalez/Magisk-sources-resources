package p000a;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: a.Hq */
/* loaded from: classes.dex */
public final class C0414Hq extends Property {

    /* renamed from: z */
    public final /* synthetic */ int f1388z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0414Hq(Class cls, String str, int i) {
        super(cls, str);
        this.f1388z = i;
    }

    /* renamed from: P */
    public final void m927P(View view, Float f) {
        switch (this.f1388z) {
            case 6:
                AbstractC0043At.f188z.mo2166M(view, f.floatValue());
                return;
            case 7:
            default:
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                AbstractC0095Bq.m197M(view, AbstractC0095Bq.m200Q(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
                return;
            case 8:
                view.getLayoutParams().width = f.intValue();
                view.requestLayout();
                return;
            case 9:
                view.getLayoutParams().height = f.intValue();
                view.requestLayout();
                return;
            case 10:
                int intValue = f.intValue();
                int paddingTop = view.getPaddingTop();
                WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
                AbstractC0095Bq.m197M(view, intValue, paddingTop, AbstractC0095Bq.m198N(view), view.getPaddingBottom());
                return;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f1388z) {
            case AbstractC0795Op.f2698E /* 0 */:
                return Float.valueOf(((AbstractC0877QS) obj).f3017n);
            case 1:
                C1735gf c1735gf = (C1735gf) obj;
                return null;
            case 2:
                C1735gf c1735gf2 = (C1735gf) obj;
                return null;
            case 3:
                View view = (View) obj;
                return null;
            case 4:
                View view2 = (View) obj;
                return null;
            case 5:
                View view3 = (View) obj;
                return null;
            case 6:
                return m930z((View) obj);
            case 7:
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                return AbstractC1973l6.m3588z((View) obj);
            case 8:
                return m930z((View) obj);
            case 9:
                return m930z((View) obj);
            case 10:
                return m930z((View) obj);
            default:
                return m930z((View) obj);
        }
    }

    /* renamed from: h */
    public final void m928h(C1735gf c1735gf, PointF pointF) {
        switch (this.f1388z) {
            case 1:
                c1735gf.getClass();
                c1735gf.f5476z = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c1735gf.f5473h = round;
                int i = c1735gf.f5472Q + 1;
                c1735gf.f5472Q = i;
                if (i == c1735gf.f5474u) {
                    AbstractC0043At.m90z(c1735gf.f5470N, c1735gf.f5476z, round, c1735gf.f5475v, c1735gf.f5471P);
                    c1735gf.f5472Q = 0;
                    c1735gf.f5474u = 0;
                    return;
                }
                return;
            default:
                c1735gf.getClass();
                c1735gf.f5475v = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                c1735gf.f5471P = round2;
                int i2 = c1735gf.f5474u + 1;
                c1735gf.f5474u = i2;
                if (c1735gf.f5472Q == i2) {
                    AbstractC0043At.m90z(c1735gf.f5470N, c1735gf.f5476z, c1735gf.f5473h, c1735gf.f5475v, round2);
                    c1735gf.f5472Q = 0;
                    c1735gf.f5474u = 0;
                    return;
                }
                return;
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f1388z) {
            case AbstractC0795Op.f2698E /* 0 */:
                AbstractC0877QS abstractC0877QS = (AbstractC0877QS) obj;
                abstractC0877QS.f3017n = ((Float) obj2).floatValue();
                abstractC0877QS.invalidate();
                return;
            case 1:
                m928h((C1735gf) obj, (PointF) obj2);
                return;
            case 2:
                m928h((C1735gf) obj, (PointF) obj2);
                return;
            case 3:
                m929v((View) obj, (PointF) obj2);
                return;
            case 4:
                m929v((View) obj, (PointF) obj2);
                return;
            case 5:
                m929v((View) obj, (PointF) obj2);
                return;
            case 6:
                m927P((View) obj, (Float) obj2);
                return;
            case 7:
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                AbstractC1973l6.m3587v((View) obj, (Rect) obj2);
                return;
            case 8:
                m927P((View) obj, (Float) obj2);
                return;
            case 9:
                m927P((View) obj, (Float) obj2);
                return;
            case 10:
                m927P((View) obj, (Float) obj2);
                return;
            default:
                m927P((View) obj, (Float) obj2);
                return;
        }
    }

    /* renamed from: v */
    public final void m929v(View view, PointF pointF) {
        switch (this.f1388z) {
            case 3:
                AbstractC0043At.m90z(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
                return;
            case 4:
                AbstractC0043At.m90z(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
                return;
            default:
                int round = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                AbstractC0043At.m90z(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
                return;
        }
    }

    /* renamed from: z */
    public final Float m930z(View view) {
        switch (this.f1388z) {
            case 6:
                return Float.valueOf(AbstractC0043At.f188z.mo2165G(view));
            case 7:
            default:
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                return Float.valueOf(AbstractC0095Bq.m198N(view));
            case 8:
                return Float.valueOf(view.getLayoutParams().width);
            case 9:
                return Float.valueOf(view.getLayoutParams().height);
            case 10:
                WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
                return Float.valueOf(AbstractC0095Bq.m200Q(view));
        }
    }
}
