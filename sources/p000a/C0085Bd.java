package p000a;

/* renamed from: a.Bd */
/* loaded from: classes.dex */
public final class C0085Bd {

    /* renamed from: h */
    public int f330h = 0;

    /* renamed from: z */
    public final String f331z;

    public C0085Bd(String str) {
        this.f331z = str;
    }

    /* renamed from: z */
    public final String m191z() {
        int i = this.f330h;
        if (i == -1) {
            return null;
        }
        String str = this.f331z;
        int indexOf = str.indexOf(46, i);
        if (indexOf == -1) {
            String substring = str.substring(this.f330h);
            this.f330h = -1;
            return substring;
        }
        String substring2 = str.substring(this.f330h, indexOf);
        this.f330h = indexOf + 1;
        return substring2;
    }
}
