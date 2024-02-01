package p000a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.AbstractC2760z;
import androidx.databinding.DataBinderMapperImpl;

/* renamed from: a.rQ */
/* loaded from: classes.dex */
public abstract class AbstractC2307rQ {

    /* renamed from: z */
    public static final DataBinderMapperImpl f7124z = new DataBinderMapperImpl();

    /* renamed from: h */
    public static AbstractC2760z m3966h(ViewGroup viewGroup, int i, int i2) {
        int childCount = viewGroup.getChildCount();
        int i3 = childCount - i;
        if (i3 == 1) {
            return m3968z(viewGroup.getChildAt(childCount - 1), i2);
        }
        View[] viewArr = new View[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            viewArr[i4] = viewGroup.getChildAt(i4 + i);
        }
        return f7124z.mo4254v(viewArr, i2);
    }

    /* renamed from: v */
    public static AbstractC2760z m3967v(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        boolean z2 = viewGroup != null && z;
        return z2 ? m3966h(viewGroup, z2 ? viewGroup.getChildCount() : 0, i) : m3968z(layoutInflater.inflate(i, viewGroup, z), i);
    }

    /* renamed from: z */
    public static AbstractC2760z m3968z(View view, int i) {
        return f7124z.mo4253h(view, i);
    }
}
