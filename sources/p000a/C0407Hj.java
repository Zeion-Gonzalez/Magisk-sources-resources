package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.topjohnwu.magisk.R;

/* renamed from: a.Hj */
/* loaded from: classes.dex */
public final class C0407Hj {

    /* renamed from: h */
    public final C2226py f1372h;

    /* renamed from: z */
    public final C2226py f1373z;

    public C0407Hj(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0795Op.m1851he(context, R.attr.materialCalendarStyle, C2292rA.class.getCanonicalName()).data, AbstractC0863Q8.f2939k);
        C2226py.m3862h(context, obtainStyledAttributes.getResourceId(4, 0));
        C2226py.m3862h(context, obtainStyledAttributes.getResourceId(2, 0));
        C2226py.m3862h(context, obtainStyledAttributes.getResourceId(3, 0));
        C2226py.m3862h(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList m1812H = AbstractC0795Op.m1812H(context, obtainStyledAttributes, 7);
        this.f1373z = C2226py.m3862h(context, obtainStyledAttributes.getResourceId(9, 0));
        C2226py.m3862h(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f1372h = C2226py.m3862h(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(m1812H.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
