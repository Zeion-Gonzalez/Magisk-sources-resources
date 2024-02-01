package p000a;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: a.qI */
/* loaded from: classes.dex */
public final class C2244qI extends AbstractC2703z2 {

    /* renamed from: I */
    public final /* synthetic */ Object f6903I;

    /* renamed from: R */
    public final /* synthetic */ int f6904R;

    /* renamed from: w */
    public final /* synthetic */ Class f6905w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2244qI(Object obj, Class cls, int i) {
        super(7);
        this.f6904R = i;
        this.f6903I = obj;
        this.f6905w = cls;
    }

    @Override // p000a.AbstractC2703z2
    /* renamed from: Lq */
    public final Object mo3375Lq() {
        int i = this.f6904R;
        Object obj = this.f6903I;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return ((Constructor) obj).newInstance(null);
            default:
                return ((Method) obj).invoke(null, this.f6905w, Object.class);
        }
    }

    @Override // p000a.AbstractC2703z2
    public final String toString() {
        int i = this.f6904R;
        Class cls = this.f6905w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return cls.getName();
            default:
                return cls.getName();
        }
    }
}
