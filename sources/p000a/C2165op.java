package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: a.op */
/* loaded from: classes.dex */
public final class C2165op {

    /* renamed from: h */
    public int f6638h = 0;

    /* renamed from: z */
    public final ImageView f6639z;

    public C2165op(ImageView imageView) {
        this.f6639z = imageView;
    }

    /* renamed from: h */
    public final void m3775h(AttributeSet attributeSet, int i) {
        int m4646W;
        ImageView imageView = this.f6639z;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0483J5.f1606Q;
        C2709z9 m4639S = C2709z9.m4639S(context, attributeSet, iArr, i);
        AbstractC2446u3.m4215M(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) m4639S.f8534h, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (m4646W = m4639S.m4646W(1, -1)) != -1 && (drawable = AbstractC1843ih.m3431X(imageView.getContext(), m4646W)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC1888jY.m3509z(drawable);
            }
            if (m4639S.m4645V(2)) {
                AbstractC1144VO.m2345v(imageView, m4639S.m4647h(2));
            }
            if (m4639S.m4645V(3)) {
                AbstractC1144VO.m2343P(imageView, AbstractC1888jY.m3508v(m4639S.m4648o(3, -1), null));
            }
        } finally {
            m4639S.m4651w();
        }
    }

    /* renamed from: v */
    public final void m3776v(int i) {
        Drawable drawable;
        ImageView imageView = this.f6639z;
        if (i != 0) {
            drawable = AbstractC1843ih.m3431X(imageView.getContext(), i);
            if (drawable != null) {
                AbstractC1888jY.m3509z(drawable);
            }
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        m3777z();
    }

    /* renamed from: z */
    public final void m3777z() {
        Drawable drawable = this.f6639z.getDrawable();
        if (drawable != null) {
            AbstractC1888jY.m3509z(drawable);
        }
    }
}
