package p000a;

import android.util.Log;

/* renamed from: a.uS */
/* loaded from: classes.dex */
public abstract class AbstractC2465uS {

    /* renamed from: z */
    public static final C1471be f7563z = C1471be.f4562z;

    /* renamed from: h */
    public static void m4244h(AbstractC1720gN abstractC1720gN) {
        if (C0364Gx.m791p(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(abstractC1720gN.f5403S.getClass().getName()), abstractC1720gN);
        }
    }

    /* renamed from: z */
    public static C1471be m4245z(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        boolean z;
        while (abstractComponentCallbacksC2342s3 != null) {
            if (abstractComponentCallbacksC2342s3.f7186F != null && abstractComponentCallbacksC2342s3.f7185E) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                abstractComponentCallbacksC2342s3.m4005R();
            }
            abstractComponentCallbacksC2342s3 = abstractComponentCallbacksC2342s3.f7183C;
        }
        return f7563z;
    }
}
