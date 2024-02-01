package p000a;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* renamed from: a.F */
/* loaded from: classes.dex */
public final class C0261F implements Enumeration {

    /* renamed from: h */
    public int f923h = 0;

    /* renamed from: v */
    public final /* synthetic */ AbstractC1593e f924v;

    /* renamed from: z */
    public final /* synthetic */ int f925z;

    public /* synthetic */ C0261F(int i, AbstractC1593e abstractC1593e) {
        this.f925z = i;
        this.f924v = abstractC1593e;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        int i = this.f925z;
        AbstractC1593e abstractC1593e = this.f924v;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (this.f923h < ((AbstractC1333Z) abstractC1593e).f4224S.length) {
                    return true;
                }
                return false;
            default:
                if (this.f923h < ((AbstractC0102C) abstractC1593e).f388S.length) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        int i = this.f925z;
        AbstractC1593e abstractC1593e = this.f924v;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                int i2 = this.f923h;
                InterfaceC0959S[] interfaceC0959SArr = ((AbstractC1333Z) abstractC1593e).f4224S;
                if (i2 < interfaceC0959SArr.length) {
                    this.f923h = i2 + 1;
                    return interfaceC0959SArr[i2];
                }
                throw new NoSuchElementException();
            default:
                int i3 = this.f923h;
                InterfaceC0959S[] interfaceC0959SArr2 = ((AbstractC0102C) abstractC1593e).f388S;
                if (i3 < interfaceC0959SArr2.length) {
                    this.f923h = i3 + 1;
                    return interfaceC0959SArr2[i3];
                }
                throw new NoSuchElementException();
        }
    }
}
