package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.AbstractC2760z;
import java.util.ArrayList;
import java.util.List;
import p000a.AbstractC2479uk;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends AbstractC2479uk {

    /* renamed from: z */
    public static final SparseIntArray f8965z = new SparseIntArray(0);

    @Override // p000a.AbstractC2479uk
    /* renamed from: h */
    public final AbstractC2760z mo4253h(View view, int i) {
        if (f8965z.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // p000a.AbstractC2479uk
    /* renamed from: v */
    public final AbstractC2760z mo4254v(View[] viewArr, int i) {
        if (viewArr.length != 0 && f8965z.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // p000a.AbstractC2479uk
    /* renamed from: z */
    public final List mo4255z() {
        return new ArrayList(0);
    }
}
