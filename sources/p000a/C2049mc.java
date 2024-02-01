package p000a;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: a.mc */
/* loaded from: classes.dex */
public final class C2049mc extends C0639M1 {

    /* renamed from: v */
    public final Object[] f6376v;

    public C2049mc(int i, Object... objArr) {
        super(i);
        this.f6376v = objArr;
    }

    @Override // p000a.C0639M1, p000a.AbstractC2222pt
    /* renamed from: v */
    public final String mo1433z(Resources resources) {
        Object[] objArr = this.f6376v;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (CharSequence charSequence : objArr) {
            if (charSequence instanceof AbstractC2222pt) {
                charSequence = ((AbstractC2222pt) charSequence).mo1433z(resources);
            }
            arrayList.add(charSequence);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        return resources.getString(this.f2064h, Arrays.copyOf(array, array.length));
    }
}
