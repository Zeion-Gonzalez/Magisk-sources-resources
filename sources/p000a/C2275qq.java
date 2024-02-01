package p000a;

import android.widget.EditText;

/* renamed from: a.qq */
/* loaded from: classes.dex */
public final class C2275qq {

    /* renamed from: h */
    public final int f6994h;

    /* renamed from: v */
    public final Object f6995v;

    /* renamed from: z */
    public final int f6996z;

    public C2275qq() {
        this.f6995v = new C2275qq[256];
        this.f6996z = 0;
        this.f6994h = 0;
    }

    public C2275qq(int i, int i2) {
        this.f6995v = null;
        this.f6996z = i;
        int i3 = i2 & 7;
        this.f6994h = i3 == 0 ? 8 : i3;
    }

    public C2275qq(EditText editText) {
        this.f6996z = Integer.MAX_VALUE;
        this.f6994h = 0;
        if (editText == null) {
            throw new NullPointerException("editText cannot be null");
        }
        this.f6995v = new C2090nN(editText);
    }
}
